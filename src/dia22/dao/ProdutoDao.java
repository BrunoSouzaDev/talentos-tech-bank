package dia22.dao;

import dia22.models.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDao {

    private Connection conn;

    public ProdutoDao(Connection conn) {
        this.conn = conn;
    }

    public void criarProduto(Produto produto) throws SQLException {
        String query = "INSERT INTO produto VALUES (default, ?, ?, ?, ?, ?, ?);";

        try(PreparedStatement insertProduto = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            int i = 0;


            insertProduto.setString(++i, produto.getDescricao());
            insertProduto.setBigDecimal(++i, produto.getValorDeCusto());
            insertProduto.setBigDecimal(++i, produto.getPesoUnitario());
            insertProduto.setString(++i, produto.getUnidadeDeMedida());
            insertProduto.setString(++i, produto.getCodigoDeBarras());
            insertProduto.setBigDecimal(++i, produto.getValorDeVenda());

            insertProduto.executeUpdate();

            ResultSet rsIdProduto = insertProduto.getGeneratedKeys();
            rsIdProduto.next();
            Long id = rsIdProduto.getLong("id");

            produto.setId(id);

            rsIdProduto.close();
        }
    }

    public Boolean verificarSeProdutoExiste(String codigoDeBarras) throws SQLException {
        String query = "select count(*) > 0 as produto_ja_cadastrado from produto where codigo_de_barras = ?";

        try(PreparedStatement selectVerificaProdutoExiste = conn.prepareStatement(query)) {
            selectVerificaProdutoExiste.setString(1, codigoDeBarras);

            ResultSet rs = selectVerificaProdutoExiste.executeQuery();
            rs.next();
            return rs.getBoolean("produto_ja_cadastrado");
        }

    }
}

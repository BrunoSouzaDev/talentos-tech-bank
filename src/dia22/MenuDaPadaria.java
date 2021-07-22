package dia22;

import dia22.dao.ProdutoDao;

import java.sql.Connection;
import java.sql.SQLException;

public class MenuDaPadaria {

    public static void main(String[] args) throws SQLException {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getConnection();

        ProdutoDao produtoDao = new ProdutoDao(conn);
        System.out.println(produtoDao.verificarSeProdutoExiste("7896074600993"));
    }
}

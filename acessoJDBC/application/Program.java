package acessoJDBC.application;

import acessoJDBC.db.DB;

import java.sql.Connection;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws SQLException {

        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}

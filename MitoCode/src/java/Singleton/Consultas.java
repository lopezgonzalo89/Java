package Singleton;

import java.sql.SQLException;

public class Consultas {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Se puede acceder directo a getConexion porque es static
        Conexion con = Conexion.getConexion();
        con.conectar();
    }
}

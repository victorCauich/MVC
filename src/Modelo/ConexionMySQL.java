package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    private static Connection conexionUnica;

    private ConexionMySQL(String direccionIp, String nombreBD,
                          String usuarioBD, String passwordBD) throws SQLException{

        //cargar driver
        cargarControlador();

        //obtener la conexion
        String url = "jdbc:mysql://" + direccionIp + "/" + nombreBD;

        conexionUnica = DriverManager.getConnection(url,usuarioBD,passwordBD);
    }

    private void cargarControlador() throws SQLException{
        DriverManager.registerDriver (new com.mysql.jdbc.Driver());
    }

    public static Connection getConexionUnica(String direccionIp,
                                              String nombreBD, String usuarioBD, String passwordBD) throws SQLException{

        if(conexionUnica == null){
            System.out.println("La conexion es nula, hay que crearla una vez");
            new ConexionMySQL(direccionIp, nombreBD, usuarioBD, passwordBD);
        }

        System.out.println("Te doy la conexion");
        return conexionUnica;
    }
}
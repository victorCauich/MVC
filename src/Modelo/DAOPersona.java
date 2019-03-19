package Modelo;

import DTOs.PersonaDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOPersona {
    private Connection conn;

    public DAOPersona(Connection conn){
        this.conn=conn;
    }
    private static final String insertarPersona ="insert into datospersona values (null,?,?,?,?)";

    public int insertarPersona (PersonaDTO personaDTO)  {
        int idPersona=0;
        try {
            ResultSet rs;
            PreparedStatement sentencia;

            sentencia = conn.prepareStatement(insertarPersona, PreparedStatement.RETURN_GENERATED_KEYS);
            sentencia.setString(1, personaDTO.getPrimerNombre());
            sentencia.setString(2, personaDTO.getSegundoNombre());
            sentencia.setString(3, personaDTO.getApellidoPaterno());
            sentencia.setString(4, personaDTO.getApellidoMaterno());
            sentencia.executeUpdate();
            rs=sentencia.getGeneratedKeys();

            if(rs.next()){
                idPersona = rs.getInt(1);
            }
            System.out.println("Se añadio al autor correctamente");

        }catch (SQLException e){
            System.out.println("No se pudo añadir a la base de datos");
            e.printStackTrace();
        }
        return idPersona;
    }

}

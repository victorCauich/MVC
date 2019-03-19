package Controlador;

import DTOs.PersonaDTO;
import Modelo.ConexionMySQL;
import Modelo.DAOPersona;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "AltaPersona", urlPatterns = "/AltaPersona")
public class AltaPersona extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Recuperamos los parametros y los enviamos al DTO de autor
        PersonaDTO personaDTO = new PersonaDTO();

        String primerNombre = request.getParameter("primerNombre");
        String segundoNombre = request.getParameter("segundoNombre");
        String apellidoPaterno = request.getParameter("apellidoPaterno");
        String apellidoMaterno = request.getParameter("apellidoMaterno");

        personaDTO.setPrimerNombre(primerNombre);
        personaDTO.setSegundoNombre(segundoNombre);
        personaDTO.setApellidoPaterno(apellidoPaterno);
        personaDTO.setApellidoMaterno(apellidoMaterno);

        try
        {
            Connection conn = ConexionMySQL.getConexionUnica ("localhost", "persona", "root", "saqohLWa");

            DAOPersona daoPersona = new DAOPersona(conn);
            daoPersona.insertarPersona(personaDTO);

            request.setAttribute("personaDTO",personaDTO);
            RequestDispatcher redirect= request.getRequestDispatcher("Resultado.jsp");
            redirect.include(request,response);
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

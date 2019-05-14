package dbsqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Metodos{

    public void insertar(String nombre, String apellidos) throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
        PreparedStatement st = conn.prepareStatement("INSERT INTO alumnos (nombre, apellidos) VALUES ('" + nombre + "', '" + apellidos + "')");
        st.execute();
        conn.close();
    }
    
    public void modificar(String id, String nombre, String apellidos) throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
        PreparedStatement st = conn.prepareStatement("UPDATE alumnos SET nombre='" + nombre + "',apellidos='" + apellidos + "' WHERE id=" + id);
        st.execute();
        conn.close();
    }
    
    public String consultar(String id) throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
        PreparedStatement st = conn.prepareStatement("SELECT * FROM alumnos WHERE id=" + id);
        ResultSet result = st.executeQuery();
        StringBuilder sb = new StringBuilder();
        while(result.next()){
            sb.append("- Id: " + result.getInt("id") + "\n- Nombre: " + result.getString("nombre") + "\n- Apellidos: " + result.getString("apellidos"));
        }
        conn.close();
        return sb.toString();
    }
    
    public void eliminar(String id) throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
        PreparedStatement st = conn.prepareStatement("DELETE FROM alumnos WHERE id=" + id);
        st.execute();
        conn.close();
    }
}
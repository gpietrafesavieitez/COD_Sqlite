package dbsqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Metodos{
    Connection conn;
    String db = "prueba.db";
    
    public boolean insertar(String nombre, String apellidos){
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:" + db);
            PreparedStatement st = conn.prepareStatement("INSERT INTO alumnos (nombre, apellidos) VALUES ('" + nombre + "', '" + apellidos + "')");
            st.execute();
            conn.close();
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean modificar(String id, String nombre, String apellidos){
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:" + db);
            PreparedStatement st = conn.prepareStatement("UPDATE alumnos SET nombre='" + nombre + "',apellidos='" + apellidos + "' WHERE id=" + id);
            st.execute();
            conn.close();
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public String consultar(String id){
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:" + db);
            PreparedStatement st = conn.prepareStatement("SELECT * FROM alumnos WHERE id=" + id);
            ResultSet result = st.executeQuery();
            StringBuilder sb = new StringBuilder();
            while(result.next()){
                sb.append("- Id: " + result.getInt("id") + "\n- Nombre: " + result.getString("nombre") + "\n- Apellidos: " + result.getString("apellidos"));
            }
            conn.close();
            return sb.toString();
        }catch(SQLException e){
            return null;
        }
    }
    
    public boolean eliminar(String id){
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:" + db);
            PreparedStatement st = conn.prepareStatement("DELETE FROM alumnos WHERE id=" + id);
            st.execute();
            conn.close();
            return true;
        }catch(SQLException e){
            return false;
        }
    }
}
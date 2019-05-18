package dbsqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class SQLite{
    private Connection conn;
    private String bd;
    private String tabla;
    
    public SQLite(){
    }
    
    public SQLite(String bd){
        this.bd = bd;
    }
    
    public SQLite(String bd, String tabla){
        this.bd = bd;
        this.tabla = tabla;
    }
    
    public boolean conectar(){
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:" + bd + ".db");
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean crearTabla(String tabla){
        try{
            PreparedStatement st = conn.prepareStatement("CREATE TABLE IF NOT EXISTS " + tabla + "(id integer PRIMARY KEY AUTOINCREMENT, nombre VARCHAR(140), apellidos VARCHAR(140))");
            st.execute();
            return true;
        }catch(SQLException e){
            return false;
        }   
    }
      
    public int insertar(String nombre, String apellidos){
        try{
            PreparedStatement st = conn.prepareStatement("INSERT INTO " + tabla + "(nombre, apellidos) VALUES ('" + nombre + "', '" + apellidos + "')");
            return st.executeUpdate();
        }catch(SQLException e){
            return -1;
        }
    }
    
    public int modificar(int id, String nombre, String apellidos){
        try{
            PreparedStatement st = conn.prepareStatement("UPDATE " + tabla + " SET nombre='" + nombre + "',apellidos='" + apellidos + "' WHERE id=" + id);
            return st.executeUpdate();
        }catch(SQLException e){
            return -1;
        }
    }
    
    public String consultar(int id){
        try{
            PreparedStatement st = conn.prepareStatement("SELECT * FROM " + tabla + " WHERE id=" + id);
            ResultSet result = st.executeQuery();
            StringBuilder sb = new StringBuilder();
            while(result.next()){
                sb.append("- Id: " + result.getInt("id") + "\n- Nombre: " + result.getString("nombre") + "\n- Apellidos: " + result.getString("apellidos"));
            }
            if(sb.length() != 0){
                return sb.toString();
            }else{
                return null;
            }
        }catch(SQLException e){
            return null;
        }
    }
    
    public int eliminar(int id){
        try{
            PreparedStatement st = conn.prepareStatement("DELETE FROM " + tabla + " WHERE id='" + id + "'");
            return st.executeUpdate();
        }catch(SQLException e){
            return -1;
        }
    }
}
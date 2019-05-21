package dbsqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 * Esta clase sirve de herramienta principal para trabajar e interactuar con SQLite.
 * @author: gpietrafesavieitez
 * @version: 20/05/19
 * @see <a href = "https://moodle.danielcastelao.org">CPR Daniel Castelao - Moodle</a>
 */

public class SQLite{
    private Connection conn;
    private String bd;
    private String tabla;

    public SQLite(){
    }
    
    /**
     * Constructor con parámetros para una base de datos previamente definida.
     * @param bd Define una base de datos concreta.
     */
    public SQLite(String bd){
        this.bd = bd;
    }
    
    /**
     * Constructor con parámetros para una base de datos y una tabla previamente definidas.
     * @param bd Define una base de datos concreta.
     * @param tabla Define una tabla concreta.
     */
    public SQLite(String bd, String tabla){
        this.bd = bd;
        this.tabla = tabla;
    }
    
    /**
     * Establece una conexión entre la aplicación y la base de datos.
     * @return Devuelve verdadero en el caso de una conexión exitosa, de lo contrario devuelve falso.
     */
    public boolean conectar(){
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:" + bd + ".db");
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    /**
     * Exige una desconexión entre la aplicación y la base de datos.
     * @return Devuelve verdadero en el caso de una desconexión exitosa, de lo contrario devuelve falso.
     */
    public boolean desconectar(){
        try{
            conn.close();
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    /**
     * Prepara y ejecuta la orden de crear una tabla.
     * @param tabla Define el nombre de la tabla a crear.
     * @return Devuelve verdadero en el caso de que la sentencia sea exitosa, de lo contrario devuelve falso.
     */
    public boolean crear(String tabla){
        try{
            PreparedStatement st = conn.prepareStatement("CREATE TABLE IF NOT EXISTS " + tabla + "(id integer PRIMARY KEY AUTOINCREMENT, nombre VARCHAR(140), apellidos VARCHAR(140))");
            st.execute();
            return true;
        }catch(SQLException e){
            return false;
        }   
    }
    
    /**
     * Prepara y ejecuta la orden de insertar datos en una tabla.
     * @param nombre Define un campo de la tabla de tipo cadena de texto.
     * @param apellidos Define un campo de la tabla de tipo cadena de texto.
     * @return Devuelve el número de filas afectadas en el caso de que la sentencia sea exitosa, de lo contrario devuelve -1.
     */
    public int insertar(String nombre, String apellidos){
        try{
            PreparedStatement st = conn.prepareStatement("INSERT INTO " + tabla + "(nombre, apellidos) VALUES ('" + nombre + "', '" + apellidos + "')");
            return st.executeUpdate();
        }catch(SQLException e){
            return -1;
        }
    }
    
    /**
     * Prepara y ejecuta la orden de modificar los datos en una tabla.
     * @param id Define el campo principal de la tabla de tipo entero.
     * @param nombre Define un campo de la tabla de tipo cadena de texto.
     * @param apellidos Define un campo de la tabla de tipo cadena de texto.
     * @return Devuelve el número de filas afectadas en el caso de que la sentencia sea exitosa, de lo contrario devuelve -1.
     */
    public int modificar(int id, String nombre, String apellidos){
        try{
            PreparedStatement st = conn.prepareStatement("UPDATE " + tabla + " SET nombre='" + nombre + "',apellidos='" + apellidos + "' WHERE id=" + id);
            return st.executeUpdate();
        }catch(SQLException e){
            return -1;
        }
    }
    
    /**
     * Prepara y ejecuta la orden de consultar una fila concreta de la tabla.
     * @param id Define el campo principal de la tabla de tipo entero.
     * @return Devuelve el resultado de la consulta en el caso de que la sentencia sea exitosa, de lo contrario devuelve nulo.
     */
    public String consultar(int id){
        try{
            PreparedStatement st = conn.prepareStatement("SELECT * FROM " + tabla + " WHERE id=" + id);
            ResultSet result = st.executeQuery();
            StringBuilder sb = new StringBuilder();
            while(result.next()){
                sb.append("- Nombre: " + result.getString("nombre") + "\n- Apellidos: " + result.getString("apellidos"));
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
    
    /**
     * Prepara y ejecuta la orden de eliminar una fila concreta de la tabla.
     * @param id Define el campo principal de la tabla de tipo entero.
     * @return Devuelve el número de filas afectadas en el caso de que la sentencia sea exitosa, de lo contrario devuelve -1.
     */
    public int eliminar(int id){
        try{
            PreparedStatement st = conn.prepareStatement("DELETE FROM " + tabla + " WHERE id='" + id + "'");
            return st.executeUpdate();
        }catch(SQLException e){
            return -1;
        }
    }
}
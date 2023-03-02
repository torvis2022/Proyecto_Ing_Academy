
package conectarbd;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class conexionMysql {
        Connection cn;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/dbacademy","root","");
            System.out.println("CONECTADO");
        } catch (Exception e){
            System.out.println("ERROR DE CONEXION BD"+e);
        }
       return cn; 
    }
}

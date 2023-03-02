
package conectarbd;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Metodos_sql {
    
     public static conexionMysql conexion = new conexionMysql();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public static String buscarNombre(String Ndni){
        String busqueda_nombre = null;
        Connection conexi = null;
        
        try{
            conexi = conexion.conectar();
            String sentencia_buscar = ("SELECT nombres,apellidos FROM talumno WHERE DNI_E = '"+Ndni+"'");
            sentencia_preparada = (PreparedStatement) conexi.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                String name = resultado.getString("nombres");
                String apellidas = resultado.getString("apellidos");
                busqueda_nombre = (name +" "+ apellidas);
            }
            conexi.close();
            
        }catch (Exception e){
            System.out.println(e);
        }
        
        return busqueda_nombre;
    }
    ////////////////////
    public static String buscarNombreRepor(String Ndni){
        String busqueda_nombre = null;
        Connection conexi = null;
        
        try{
            conexi = conexion.conectar();
            String sentencia_buscar = ("SELECT nombres,apellidos FROM talumno WHERE DNI_E = '"+Ndni+"'");
            sentencia_preparada = (PreparedStatement) conexi.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                String name = resultado.getString("nombres");
                String apellidas = resultado.getString("apellidos");
                busqueda_nombre = (name +" "+ apellidas);
            }
            conexi.close();
            
        }catch (Exception e){
            System.out.println(e);
        }
        
        return busqueda_nombre;
    }
    
    //////////////////////////
    
    public static String buscarNombreReporCiclo(String Ndni){
        String busqueda_cic = null;
        Connection conexi = null;
        
        try{
            conexi = conexion.conectar();
            String sentencia_buscar = ("SELECT ciclo FROM tmatricula WHERE codigoAlumno = '"+Ndni+"'");
            sentencia_preparada = (PreparedStatement) conexi.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                String cicl = resultado.getString("ciclo");
                
                busqueda_cic = cicl ;
            }
            conexi.close();
            
        }catch (Exception e){
            System.out.println(e);
        }
        
        return busqueda_cic;
    }
    
   ////////////////////////////////////////////
     public static String buscarNombreReporFecha(String Ndni){
        String busqueda_fecha = null;
        Connection conexi = null;
        
        try{
            conexi = conexion.conectar();
            String sentencia_buscar = ("SELECT fecha FROM tmatricula WHERE codigoAlumno = '"+Ndni+"'");
            sentencia_preparada = (PreparedStatement) conexi.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                String fecha = resultado.getString("fecha");
                
                busqueda_fecha = fecha ;
            }
            conexi.close();
            
        }catch (Exception e){
            System.out.println(e);
        }
        
        return busqueda_fecha;
    }
  /////////////////////////////////////////////////////////////////////////  
    
    
    
    
    
  /*  
  public static String buscarUsuarioRegistrado (String dni, String contraseña){
      String busqueda_usuario = null;
        Connection conexi = null;
        
      try{
            conexi = conexion.conectar();
            String sentencia_busqueda_usuario = ("SELECT nombres,DNI,celular FROM talumno WHERE DNI = '"+dni+"' && celular = '"+contraseña+"'");
            sentencia_preparada = (PreparedStatement) conexi.prepareStatement(sentencia_busqueda_usuario);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                busqueda_usuario = "Usuario encontrado";
            } else{
                 busqueda_usuario = "Usuario encontrado";
            }
            
            conexi.close();
            
        }catch (Exception e){
            System.out.println(e);
        }
        
        return busqueda_usuario;
  }  
    */
    
    public static String mostrarUsuarioRegistrado (String dni){
      String busqueda_dni = null;
        Connection conexi = null;
        
        
      try{
            conexi = conexion.conectar();
            String sentencia_busqueda_dni = ("SELECT * FROM talumno WHERE DNI = '"+dni+"'");
            sentencia_preparada = (PreparedStatement) conexi.prepareStatement(sentencia_busqueda_dni);
            resultado = sentencia_preparada.executeQuery();
            
            
            if(resultado.next()){
                busqueda_dni = "Usuario encontrado";
            } else{
                 busqueda_dni = "Usuario encontrado";
            }
            
            conexi.close();
            
        }catch (Exception e){
            System.out.println(e);
        }
        
        return busqueda_dni;
  }  
    
  /* 
  public static void listar(String Ndni){
        
      String sql="select * from talumno WHERE DNI = '"+Ndni+"'";
      
        
        try{
           cn=con.getConnection();
           st=cn.createStatement();
           rs=st.executeQuery(sql);
           object[]talumno=new Objeto[7];
           modelo=(DefaultTableModel)TablaDatos.getModel();
           
           while (rs.next()) {
               talumno[0]=rs.getInt("Id");
               talumno[1]=rs.getInt
               talumno[2]=rs.getInt
               talumno[3]=rs.getInt
               talumno[4]=rs.getInt
               talumno[5]=rs.getInt
               talumno[6]=rs.getInt
                       
                       
           }
            
        }catch (Exception e){
            System.out.println(e);
        }
        
    }  */
    
    public static ResultSet ListarTabla(String consulta){
        
        Connection cn=conexion.conectar();
        Statement sql;
        
        ResultSet datos=null;
        try{
            
            
        }catch (Exception e){
           System.out.println(e);  
        }
        
        return datos;
    }
}

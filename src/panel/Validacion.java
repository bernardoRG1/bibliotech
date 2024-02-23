/*
 *VALIDACION DEL LOS DATOS EN CASO DE QUERER HACER LOGIN EN EL APARTADO DE ADMINISTRADORES
*/

package panel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static panel.Validacion.getConnection;

/**
 *
 * @author Jorge
 */
public class Validacion {
    //Conexion con DB
    public static final String URL = "jdbc:mysql://localhost:3306/bibliotech";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    PreparedStatement ps;
    ResultSet rs;
    
    public static Connection getConnection(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("CONEXION EXITOSA");
        } catch (Exception e){
            System.out.println("Error de conexion"+e);
        }
        return con;
    }//Fin de la conexion
    
    public void validacion(String user, String pass){
        
        
         Connection con = null;
        
        
        //En caso de que no se ingrese ningun dato
        if(user.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(null, "CAMPOS FALTANTES FAVOR DE LLENARLOS");
        }
        else{
            
            
            try{
           
               con = getConnection();
               ps = con.prepareStatement("SELECT usuario, pass FROM administradores WHERE usuario = '" + user + " 'AND pass ='" + pass + "'");
               rs =  ps.executeQuery();
           
                if(rs.next()){
                    //en caso de ser correcta y validar desplegar la pantalla de admin
                    vistaAdmin admin = new vistaAdmin();
                    admin.setVisible(true);
                }
                //En caso de que el usuario o contraseña no sean validos
                else{
                    JOptionPane.showMessageDialog(null, "CREDENCIALES INCORRECTAS FAVOR DE INTENTARLO DE NUEVO");
                    return;
                }
              
            } catch(Exception e){
                
                System.err.println(e);
            }
        }
    }
}

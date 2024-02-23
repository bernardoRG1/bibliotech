
package panel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static panel.AltaManual.getConnection;

/**
 *
 * @author Jorge
 */
public class AltaManual {
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
    
    public void manual(String matricula, String nombre, String carrera, String area){
                //GUARDAR EL FORMULARIO DE ENTRADA
        Connection con = null;
        
        //Validacion de que los campos no esten vacios
        if(matricula.isEmpty() || nombre.isEmpty() || carrera.isEmpty() || matricula.length() < 10){
                JOptionPane.showMessageDialog(null, "FAVOR DE LLENAR LOS CAMPOS CORRESPONDIENTES CORRETAMENTE");
                return;
            }
        
        
        try{
            con = getConnection();
            
            //SE EVITA LA INYECCIÓN DE SQL
            ps = con.prepareStatement("INSERT INTO registros (matricula, nombre, carrera, zona) VALUES(?,?,?,?)");
            ps.setString(1, matricula);
            ps.setString(2, nombre);
            ps.setString(3, carrera);
            ps.setString(4, area);
            
            
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "REGISTRO CON EXITO BIENVENIDO!!");
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR TU RESGISTRO");
            }
            
        }catch(Exception e){
            System.err.println(e);
        }
        
        //MUESTRA LA PANTALLA DE REGISTRO AUTOMATICO
        inicioAlumnos ini = new inicioAlumnos();
        inicioManual man = new inicioManual();
        ini.setVisible(true);
        man.dispose(); 
    }
}

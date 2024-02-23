/*
 * En esta clase se da de alta el alumno con el formulario del programa
 */
package panel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class AltasAlumnosManual {
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
    }
    
    public void altasAlumnosManual(String matricula, String nombre, String carrera){
        Connection con = null;
        
        if(matricula.isEmpty() || nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "FAVOR DE LLENAR LOS CAMPOS CORREPONDIENTES");
            return; //EN CASO DE QUE NO INGRESE DATOS SE TERMINAN LAS ACCIONES
        }
        
        try{
        
            con = getConnection();
            
            //SE EVITA LA INSERCIÓN SQL
            ps = con.prepareStatement("INSERT INTO alumnos (matricula, nombre, carrera) VALUES(?,?,?)");
            ps.setString(1, matricula);
            ps.setString(2, nombre);
            ps.setString(3, carrera);
            
          int res =  ps.executeUpdate();
          
          if(res > 0){
              JOptionPane.showMessageDialog(null, "USUARIO REGISTRADO CON EXITO");
              inicioAlumnos ini = new inicioAlumnos();
              ini.setVisible(true);
              
              
          }
          else{
              JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR A LA PERSONA");
          }
          
          con.close();
            
        } catch(Exception e){
            System.err.println(e); 
        }
    }
}

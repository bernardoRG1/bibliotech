/*
 * EN ESTA CLASE SE DA DE ALTA EL REGISTRO AUTOMATICAMENTE ESCANEANDO LA MATRICULA DE ALUMNO
 */
package panel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static panel.AltasAlumnos.getConnection;

/**
 *
 * @author Jorge
 */
public class AltasAlumnos {
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
    
    public void altas(String matricula, String area){
         //Declaracion de variables para el formulario
         String carr = null, nomb = null;
        
        //GUARDAR EL FORMULARIO DE ENTRADA
        Connection con = null;
        
        //Validacion de que los campos no esten vacios
        if(matricula.isEmpty()){
                JOptionPane.showMessageDialog(null, "FAVOR DE LLENAR LOS CAMPOS CORRESPONDIENTES");
                return;
            }
        
        //Primer try para obtener los datos de la base de datos
        try{
            
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM alumnos WHERE matricula = ?");
            ps.setString(1, matricula);
            
            rs =  ps.executeQuery();
           
            //SE OBTIENEN LOS DATOS EN CASO DE QUE LA PERSONA ESTE DADA DE ALTA EN LA BASE DE DATOS
           if(rs.next()){
               matricula = rs.getString("matricula");
               nomb = rs.getString("nombre");
              carr = rs.getString("carrera");
           }
           else{
               JOptionPane.showMessageDialog(null, "NO EXISTE PERSONA CON ESA MATRICULA REGISTRADA");
               return;
           }
              
        } catch(Exception e){
            System.err.println(e);
        }
        
        
        //Segundo try para dar de alta el registro
         try{
            con = getConnection();
            
            //SE COLOCA PARA EVITAR INSERCIÓN SQL
            ps = con.prepareStatement("INSERT INTO registros (matricula, nombre, carrera, zona) VALUES(?,?,?,?)");
            
            ps.setString(1, matricula);
            ps.setString(2, nomb);
            ps.setString(3, carr);
            ps.setString(4, area);
            
            
            int res = ps.executeUpdate();
            
            //HACEMOS UNA PEQUEÑA COMPARASION PARA DARME ALGO DE MERITO A MI COMO PROGRAMADOR (DARLE UN TOQUE PERSONAL AL PROGRAMA)
            if(res > 0 && ("2021030600".equals(matricula))){
                JOptionPane.showMessageDialog(null, "BIENVENIDO CREADOR");
            }
           else if(res > 0){
                JOptionPane.showMessageDialog(null, "REGISTRO CON ¡¡EXITO BIENVENIDO!!");
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR TU RESGISTRO");
            }
            
        }catch(Exception e){
            System.err.println(e);
        }
        
    }
}



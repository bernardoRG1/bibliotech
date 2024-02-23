/*
 * CLASE QUE CONTIENE EL METODO QUE RETORNA LA CONSULTA SQL PARA MOSTRAR EN EL APARTDAO DE LA VISTA DE ADMINISTRADOR
 */
package panel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Jorge
 */
public class MostrarTabla {
    //Conexion con DB
    public static final String URL = "jdbc:mysql://localhost:3306/bibliotech";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    static Connection con = null;
    ResultSet rs;
    
    
    public static Connection getConnection(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("CONEXION EXITOSA");
        } catch (Exception e){
            System.out.println("Error de conexion"+e);
        }
        return con;
    }//Fin de la conexion
    
    //CONSULTA SQL
    
    public String consulta(String sql, String matricula, String zona, String fecha, String fechafin, String carrera){
         //CONSULTA DE DATOS DEPENDIENDO DE QUE CAMPOS CONTENGA 
            
            //EN CASO DE QUE SOLO EL CAMPO DE MATRICULA TEGA DATOS
            if("".equals(fecha) && !"".equals(matricula) && "".equals(zona) && "".equals(fechafin) && "".equals(carrera)){//PONER LA CONDICIÓN DE LA FECHA
             
                sql = sql + " WHERE matricula = " + matricula + " ORDER BY nombre";
            }
            //EN CASO DE QUE SOLO EL CAMPO DE ZONA CONTENGA DATOS
            else if("".equals(fecha) && "".equals(matricula) && !"".equals(zona) && "".equals(fechafin) && "".equals(carrera)){//PONER LA CONDICIÓN DE LA FECHA
                
                zona = "'" + zona + "'";//MAÑOSA PARA QUE LA CONSULTA SQL DETECTARA LA VARIABLE COMO TEXTO
                sql = sql + " WHERE zona = " + zona + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE SOLO EL CAMPO DE FECHA INICIO CONTENGA DATOS
            else if(!"".equals(fecha) && "".equals(fechafin) && "".equals(matricula) && "".equals(zona) && "".equals(carrera)){
                fecha = "'" + fecha + "'";
                System.out.println(fecha);
                sql = sql + " WHERE fecha_entrada = " + fecha + " ORDER BY nombre";
                 //sql = sql + " WHERE fecha_entrada BETWEEN '" + fecha +"'" + " AND '" + fechafin +"'";
            }
            
            //EN CASO DE QUE MATRICULA, ZONA Y FECHA INICIO CONTENGAN DATOS
            if(!"".equals(matricula) && !"".equals(zona) && !"".equals(fecha) && "".equals(fechafin) && "".equals(carrera)){
                fecha = "'" + fecha + "'";
                zona = "'" + zona + "'";
                sql = sql + " WHERE matricula = " + matricula + " AND zona LIKE " + zona + " AND fecha_entrada = " + fecha + " ORDER BY nombre"; 
            }
            
            
            //EN CASO DE QUE EL CAMPO DE MATRICULA Y ZONA CONTENGAN DATOS
            else if("".equals(fecha) && !"".equals(matricula) && !"".equals(zona) && "".equals(fechafin) && "".equals(carrera)){
                zona = "'" + zona + "'";
                sql = sql + " WHERE matricula = " + matricula + " AND zona LIKE " + zona + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE EL CAMPO DE MATRICULA Y FECHA INICIO CONTENGAN DATOS
            else if(!"".equals(fecha) && !"".equals(matricula) && "".equals(zona) && "".equals(fechafin) && "".equals(carrera)){
                fecha = "'" + fecha + "'";
                sql = sql + " WHERE matricula = " + matricula + " AND fecha_entrada = " + fecha + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE EL CAMPO DE MATRICULA ZONA Y LAS 2 FECHAS CONTENGAN DATOS
            else if(!"".equals(matricula) && !"".equals(zona) && !"".equals(fecha) && !"".equals(fechafin) && "".equals(carrera)){
                fecha = "'" + fecha + "'";
                fechafin = "'" + fechafin + "'";
                zona = "'" + zona + "'";
                sql = sql + " WHERE matricula = " + matricula + " AND fecha_entrada BETWEEN " + fecha + " AND " + fechafin + " AND ZONA = " + zona;
            }
            
            //EN CASO DE QUE EL CAMPO DE MATRICULA Y LAS 2 FECHAS CONTENGAN DATOS
            else if(!"".equals(fecha) && !"".equals(fechafin) && !"".equals(matricula) && "".equals(carrera) && "".equals(zona)){
                fecha = "'" + fecha + "'";
                fechafin = "'" + fechafin + "'";
                sql = sql + " WHERE matricula = " + matricula + " AND fecha_entrada BETWEEN " + fecha + " AND " + fechafin + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE ZONA Y FECHA INICIO CONTENGAN DATOS
            else if(!"".equals(fecha) && "".equals(matricula) && !"".equals(zona) && "".equals(fechafin) && "".equals(carrera)){
                fecha = "'" + fecha + "'";
                zona = "'" + zona + "'";
                sql = sql + " WHERE zona LIKE " + zona + " AND fecha_entrada = " + fecha + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE ZONA Y LAS 2 FECHAS CONTENGAN DATOS
            else if("".equals(matricula) && !"".equals(zona) && !"".equals(fecha) && !"".equals(fechafin) && "".equals(carrera)){
                fecha = "'" + fecha + "'";
                fechafin = "'" + fechafin + "'";
                zona = "'" + zona + "'";
                sql = sql + " WHERE zona LIKE " + zona + " AND fecha_entrada BETWEEN " + fecha + " AND " + fechafin + " ORDER BY nombre";
            }
            
            
            //EN CASO DE QUE LOS CAMPOS DE FECHA INICIO Y FIN CONTENGAN DATOS
            else if(!"".equals(fecha) && !"".equals(fechafin) && "".equals(matricula) && "".equals(zona) && "".equals(carrera)){
                fecha = "'" + fecha + "'";
                fechafin = "'" + fechafin + "'";
                System.out.println(fecha);
                System.out.println(fechafin);
                sql = sql + " WHERE fecha_entrada BETWEEN " + fecha + " AND " + fechafin + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE SOLO EL CAMPO DE CARRERA CONTENGA DATOS
            else if(!"".equals(carrera) && "".equals(matricula) && "".equals(zona) && "".equals(fecha) && "".equals(fechafin)){
                carrera = "'" + carrera + "'";
                sql = sql + " WHERE carrera = " + carrera + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE EL CAMPO DE CARRERA Y MATRICULA CONTENGAN DATOS
            else if(!"".equals(carrera) && !"".equals(matricula) && "".equals(zona) && "".equals(fecha) && "".equals(fechafin)){
                carrera = "'" + carrera + "'";
                sql = sql + " WHERE matricula = " + matricula + " AND carrera LIKE " + carrera + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE EL CAMPO DE CARRERA Y ZONA CONTENGAN DATOS
            else if(!"".equals(carrera) && "".equals(matricula) && !"".equals(zona) && "".equals(fecha) && "".equals(fechafin)){
                carrera = "'" + carrera + "'";
                zona = "'" + zona + "'";
                sql = sql + " WHERE carrera LIKE " + carrera + " AND zona LIKE " + zona + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE EL CAMPO DE CARRERA Y FECHA INICIO CONTENGAN DATOS
            else if(!"".equals(carrera) && "".equals(matricula) && "".equals(zona) && !"".equals(fecha) && "".equals(fechafin)){
                carrera = "'" + carrera + "'";
                fecha = "'" + fecha + "'";
                sql = sql + " WHERE carrera LIKE " + carrera + " AND fecha_entrada LIKE " + fecha + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE EL CAMPO DE CARRERA Y LAS 2 FECHAS CONTENGAN DATOS
            else if(!"".equals(carrera) && "".equals(matricula) && "".equals(zona) && !"".equals(fecha) && !"".equals(fechafin)){
                carrera = "'" + carrera + "'";
                fecha = "'" + fecha + "'";
                fechafin = "'" + fechafin + "'";
                sql = sql + " WHERE carrera LIKE " + carrera + " AND fecha_entrada BETWEEN " + fecha + " AND " + fechafin + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE EL CAMPO DE CARRERA, MATRICULA Y ZONA CONTENGAN DATOS
            else if(!"".equals(carrera) && !"".equals(matricula) && !"".equals(zona) && "".equals(fecha) && "".equals(fechafin)){
                zona = "'" + zona + "'";
                carrera = "'" + carrera + "'";
                sql = sql + " WHERE matricula = " + matricula +" AND zona LIKE " + zona + " AND carrera LIKE "+ carrera + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE EL CAMPO DE CARRERA, MATRICULA, ZONA Y LA FECHA DE INICIO CONTENGAN DATOS
            else if(!"".equals(carrera) && !"".equals(matricula) && !"".equals(zona) && !"".equals(fecha) && "".equals(fechafin)){
                zona = "'" + zona + "'";
                carrera = "'" + carrera + "'";
                fecha = "'" + fecha + "'";
                sql = sql + " WHERE matricula = " + matricula +" AND zona LIKE " + zona + " AND carrera LIKE "+ carrera + " AND fecha_entrada LIKE " + fecha + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE TODOS LOS CAMPOS CONTENGAN DATOS
            else if(!"".equals(fecha) && !"".equals(matricula) && !"".equals(fechafin) && !"".equals(zona) && !"".equals(carrera)){
                fecha = "'" + fecha + "'";
                fechafin = "'" + fechafin + "'";
                zona = "'" + zona + "'";
                carrera = "'" + carrera + "'";
                sql = sql + " WHERE matricula = " + matricula +" AND zona LIKE " + zona + " AND carrera LIKE "+ carrera + " AND fecha_entrada BETWEEN " + fecha + " AND " + fechafin + " ORDER BY nombre";
            }
            
            //EN CASO DE QUE NINGUN CAMPO CONTENGA DATOS
            else if("".equals(matricula) && "".equals(zona) && "".equals(fecha) && "".equals(fechafin)){
                sql = sql + " ORDER BY nombre";
            }
            
            //RETORNA LA CONSULTA SQL COMPLETA
            return sql;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rjlcx
 */
public class Conexion {
    private static String URL="jdc:mysql://localhost/pizeria";
    private static String Usuario= "root";
    private static String Contraseña="root";
   
    public static Connection conectar(){
        Connection conexion=null;
        try{
            Class.forName("com.mysql.jdc.Driver");
            conexion = DriverManager.getConnection(URL, Usuario, Contraseña);
            System.out.println("Se establecio conexion");
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        return conexion;
    }
}

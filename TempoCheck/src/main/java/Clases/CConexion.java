
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class CConexion {
    Connection conectar;
    
    String usuario = "root";
    String contrasenia = "root";
    String bd = "login";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            //JOptionPane.showMessageDialog(null,"Se agregó");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Problema en la conexion"+e.toString());
        }
        return conectar;
    }
    

}


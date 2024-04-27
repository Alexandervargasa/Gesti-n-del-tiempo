
package Clases;

import Ingreso.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CLogin {
    public void validaUsuario(Usuario usuario){
        try{
            ResultSet rs = null;
            PreparedStatement ps=null;
            
            Clases.CConexion objetoConexion = new Clases.CConexion();
            String consulta="SELECT * FROM USUARIOS WHERE Usuarios.ingresoUsuario=(?) and Usuarios.ingresoContrasenia=(?);";
            ps=objetoConexion.estableceConexion().prepareStatement(consulta);
            
            
            
            ps.setString(1,usuario.getUsuario());
            ps.setString(2,usuario.getContrasenia());
            
            rs = ps.executeQuery();
            
            if (rs.next()){
                JOptionPane.showMessageDialog(null,"El usuario es correcto!");
                Principal objetoMenu= new Principal();
                objetoMenu.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"El usuario es incorrecto!");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e.toString());
        }
    }
}

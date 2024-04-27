
package Clases;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CRegistrar {
    public void insertarUsuario(String usuario, String contra) {
        try {
            ResultSet rs = null;
            PreparedStatement ps=null;
            Clases.CConexion objetoConexion = new Clases.CConexion();
            ps = objetoConexion.estableceConexion().prepareStatement("INSERT INTO USUARIOS (ingresoUsuario, ingresoContrasenia) VALUES (?, ?)");
            ps.setString(1, usuario);
            ps.setString(2, contra);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar usuario: " + e.toString());
        }
    }
}

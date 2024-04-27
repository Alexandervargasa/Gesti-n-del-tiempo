
package Clases;
public class Usuario {
    private String Usuario;
    private String Contrasenia;
    
    public Usuario(String user, String contra){
        this.Usuario=user;
        this.Contrasenia=contra;
    }
    
    
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }
    
}

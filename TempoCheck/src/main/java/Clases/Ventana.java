
package Clases;

import javax.swing.JFrame;

public class Ventana {
    private JFrame frameNuevo;
    private JFrame frameActual;
    public Ventana(JFrame frameNuevo,JFrame frameActual){
        this.frameNuevo=frameNuevo;
        this.frameActual=frameActual;
    }
    public void abrirVentana(){
        frameNuevo.setVisible(true);
    }
    public void cerrarVentanaActual(){
        frameActual.setVisible(false);
    }
    
}

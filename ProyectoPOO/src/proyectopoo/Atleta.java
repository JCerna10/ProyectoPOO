/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import javax.swing.JOptionPane;

/**
 *
 * @author JCERNA10
 */
public class Atleta {

    String Nombre;
    private String apellido;
    int edad;
    private String Deporte;
    private String direccion;
    private String dpi;
    private String genero;

    public Atleta() {
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String Deporte) {
        this.Deporte = Deporte;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

     public void mostrardatos() {
        JOptionPane.showConfirmDialog(null, Nombre + apellido+edad+Deporte +  direccion+dpi );
    }

    public void ingresodatos() {
        Nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido = JOptionPane.showInputDialog("Ingrese el Apellido"); 
        Deporte = JOptionPane.showInputDialog("Ingrese el Deporte"); 
        direccion = JOptionPane.showInputDialog("Ingrese el direccion");
        dpi = JOptionPane.showInputDialog("Ingrese el dpi"); 
    }

}

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
public class boxeador extends Atleta {

    private String Categoria;
    private Double PESO;
    private String derrotas;
    private String victorias;
    private String KO;

    public boxeador() {
    }

    public String getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(String derrotas) {
        this.derrotas = derrotas;
    }

    public String getVictorias() {
        return victorias;
    }

    public void setVictorias(String victorias) {
        this.victorias = victorias;
    }

    public String getKO() {
        return KO;
    }

    public void setKO(String KO) {
        this.KO = KO;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public Double getPESO() {
        return PESO;
    }

    public void setPESO(Double PESO) {
        this.PESO = PESO;
    }

   
    public void mostrar2() {
        mostrardatos();//Metodo heredado de Empleado
        JOptionPane.showMessageDialog(null, PESO + Categoria);
    }

    public void ingreso2() {
        ingresodatos();
        Categoria = JOptionPane.showInputDialog("Ingrese Categoria");
        String s = JOptionPane.showInputDialog("Ingrese Peso");
        this.setPESO(Double.parseDouble(s));
    }
}

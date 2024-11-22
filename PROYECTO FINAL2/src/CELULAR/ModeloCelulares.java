package CELULAR;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ModeloCelulares {

    private String modelo;
    private double precio;
    private String especificaciones;

    public ModeloCelulares(String modelo, double precio, String especificaciones) {
        this.modelo = modelo;
        this.precio = precio;
        this.especificaciones = especificaciones;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }
}

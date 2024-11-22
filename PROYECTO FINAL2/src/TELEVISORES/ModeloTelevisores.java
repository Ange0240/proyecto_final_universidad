
package TELEVISORES;

public class ModeloTelevisores {

    private String modelo;
    private double precio;
    private String especificaciones;

    public ModeloTelevisores(String modelo, double precio, String especificaciones) {
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

package PC;


public class ModeloPC {

    private String modelo;
    private double precio;
    private String especificaciones;

    public ModeloPC(String modelo, double precio, String especificaciones) {
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
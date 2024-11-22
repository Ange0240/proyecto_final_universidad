package Models;

import CELULAR.ModeloCelulares;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private String nroIdentificacion;
    private String contraseña;
    private String tipoUsuario;
    private List<ModeloCelulares> carrito;
    private List<ModeloCelulares> listaDeDeseos;
    private List<String> historialCompras;

    public Usuario(String nombre, String nroIdentificacion, String contraseña, String tipoUsuario) {
        this.nombre = nombre;
        this.nroIdentificacion = nroIdentificacion;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
        this.carrito = new ArrayList<>();
        this.listaDeDeseos = new ArrayList<>();
        this.historialCompras = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroIdentificacion() {
        return nroIdentificacion;
    }

    public void setNroIdentificacion(String nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<ModeloCelulares> getCarrito() {
        return carrito;
    }

    public List<ModeloCelulares> getListaDeDeseos() {
        return listaDeDeseos;
    }

    public List<String> getHistorialCompras() {
        return historialCompras;
    }

    // Agregar y eliminar productos del carrito
    public void agregarAlCarrito(ModeloCelulares celular) {
        if (!carrito.contains(celular)) {  // Evitar duplicados en el carrito
            carrito.add(celular);
        }
    }

    public void eliminarDelCarrito(ModeloCelulares celular) {
        carrito.remove(celular);
    }

    // Agregar y eliminar productos de la lista de deseos
    public void agregarAListaDeDeseos(ModeloCelulares celular) {
        if (!listaDeDeseos.contains(celular)) {  // Evitar duplicados en la lista de deseos
            listaDeDeseos.add(celular);
        }
    }

    public void eliminarDeListaDeDeseos(ModeloCelulares celular) {
        listaDeDeseos.remove(celular);
    }

    // Comprar productos del carrito
    public void comprarCarrito() {
        // Añadir productos al historial de compras
        for (ModeloCelulares celular : carrito) {
            historialCompras.add(celular.getModelo());  // Puedes agregar más detalles si es necesario
        }
        // Limpiar el carrito después de la compra
        carrito.clear();
    }

}
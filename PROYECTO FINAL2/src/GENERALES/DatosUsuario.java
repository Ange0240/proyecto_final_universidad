package GENERALES;

import java.util.ArrayList;

public class DatosUsuario {

    public static String Usuario; // Nombre de usuario del usuario logueado
    public static String[] Contraseña; // Contraseñas de los usuarios
    public static String[] Rango; // Rango de usuario (ej. Admin, Usuario normal)
    public static int Fila; // Índice que indica cuál es el usuario logueado

    // Carrito y lista de deseos para cada usuario (por fila)
    public static ArrayList<Object>[] carrito = new ArrayList[100];  // Para almacenar productos en el carrito
    public static ArrayList<Object>[] listaDeDeseos = new ArrayList[100]; // Para almacenar productos en la lista de deseos

    // Establecer el usuario logueado
    public static void setUsuario(String Usuario, int fila) {
        DatosUsuario.Usuario = Usuario;
        DatosUsuario.Fila = fila;
    }

    // Obtener la contraseña del usuario logueado
    public static String getContraseña() {
        return Contraseña[Fila];
    }

    // Establecer las contraseñas de los usuarios
    public static void setContraseña(String[] Contraseña) {
        DatosUsuario.Contraseña = Contraseña;
    }

    // Obtener el rango de los usuarios
    public static String[] getRango() {
        return Rango;
    }

    // Establecer los rangos de los usuarios
    public static void setRango(String[] Rango) {
        DatosUsuario.Rango = Rango;
    }

    // Establecer la fila del usuario logueado (la posición en los arrays)
    public static void setFila(int Fila) {
        DatosUsuario.Fila = Fila;
    }

    // Obtener el carrito del usuario logueado
    public static ArrayList<Object> getCarrito() {
        return carrito[Fila];
    }

    // Agregar un producto al carrito del usuario logueado
    public static void agregarAlCarrito(Object producto) {
        if (carrito[Fila] == null) {
            carrito[Fila] = new ArrayList<>();
        }
        carrito[Fila].add(producto);
    }

    // Eliminar un producto del carrito del usuario logueado
    public static void eliminarDelCarrito(Object producto) {
        if (carrito[Fila] != null) {
            carrito[Fila].remove(producto);
        }
    }

    // Obtener la lista de deseos del usuario logueado
    public static ArrayList<Object> getListaDeDeseos() {
        return listaDeDeseos[Fila];
    }

    // Agregar un producto a la lista de deseos del usuario logueado
    public static void agregarAListaDeDeseos(Object producto) {
        if (listaDeDeseos[Fila] == null) {
            listaDeDeseos[Fila] = new ArrayList<>();
        }
        listaDeDeseos[Fila].add(producto);
    }

    // Eliminar un producto de la lista de deseos del usuario logueado
    public static void eliminarDeListaDeDeseos(Object producto) {
        if (listaDeDeseos[Fila] != null) {
            listaDeDeseos[Fila].remove(producto);
        }
    }

    // Guardar la información del usuario (para persistencia si es necesario)
    public static void guardarUsuario() {
        // Aquí podrías guardar los datos en una base de datos o archivo si lo necesitas
    }
}

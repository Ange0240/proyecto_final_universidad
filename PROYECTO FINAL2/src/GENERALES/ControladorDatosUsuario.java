package GENERALES;

import java.util.ArrayList;


public class ControladorDatosUsuario {
        
    
  private static ArrayList<String> AlmacenarUsuarios = new ArrayList<>();
  private static ArrayList<String> AlmacenarContraseña = new ArrayList<>();
  
  
   // Método para agregar un usuario
    public static void agregarUsuario(String usuario) {
        AlmacenarUsuarios.add(usuario);
    }
    
    // Método para obtener todos los usuarios
    public static ArrayList<String> obtenerUsuarios() {
        return AlmacenarUsuarios;
    }
    
     // Método para obtener un usuario por índice
    public static String obtenerUsuario(int indice) {
        if (indice >= 0 && indice < AlmacenarUsuarios.size()) {
            return AlmacenarUsuarios.get(indice);
        }
        return null; // Retorna null si el índice es inválido
    }
    
    
    
    
    
  //Guardar la contraseña

   // Método para agregar la contraseña
    public static void AgregarContraseña(String contraseña) {
        AlmacenarContraseña.add(contraseña);
    }
    
     // Método para obtener un usuario por índice
    public static String obtenerContraseña(int indice) {
        if (indice >= 0 && indice < AlmacenarContraseña.size()) {
            return AlmacenarContraseña.get(indice);
        }
        return null; // Retorna null si el índice es inválido
    }

}

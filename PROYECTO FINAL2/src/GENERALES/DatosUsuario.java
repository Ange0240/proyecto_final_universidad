
package GENERALES;


public class DatosUsuario {
    
    public static String Usuario;
    public static String[] Contraseña;
    public static String[] Rango;
    public static int Fila;

//    public static String getUsuario() {
//        return Usuario[Fila];
//    }

    public static void setUsuario(String Usuario, int fila) {
        DatosUsuario.Usuario = Usuario;
    }
    
   

    public static String getContraseña() {
        return Contraseña[Fila];
    }

    public static void setContraseña(String[] Contraseña) {
        DatosUsuario.Contraseña = Contraseña;
    }

    public static String[] getRango() {
        return Rango;
    }

    public static void setRango(String[] Rango) {
        DatosUsuario.Rango = Rango;
    }

    
    public static void setFila(int Fila) {
        DatosUsuario.Fila = Fila;
    }

    public static void guardarUsuario() {
        
        
    }

    
    
}

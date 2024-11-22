
package TELEVISORES;


import java.util.List;

public class ControladorTelevisores {

    private List<ModeloTelevisores> listaTelevisores;

    public ControladorTelevisores(List<ModeloTelevisores> listaTelevisores) {
        this.listaTelevisores = listaTelevisores;
    }

    public ModeloTelevisores getEspecificaciones(String modelo) {
        for (ModeloTelevisores televisor : listaTelevisores) {
            if (televisor.getModelo().equals(modelo)) {
                return televisor;
            }
        }
        return null;
    }
}
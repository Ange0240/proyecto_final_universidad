package TABLETS;

import java.util.List;

public class ControladorTablets {

    private List<ModeloTablets> listaTablets;

    public ControladorTablets(List<ModeloTablets> listaTablets) {
        this.listaTablets = listaTablets;
    }

    public ModeloTablets getEspecificaciones(String modelo) {
        for (ModeloTablets tablet : listaTablets) {
            if (tablet.getModelo().equals(modelo)) {
                return tablet;
            }
        }
        return null;
    }
}

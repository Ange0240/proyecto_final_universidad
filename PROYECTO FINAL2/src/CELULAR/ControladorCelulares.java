package CELULAR;

import java.util.List;

public class ControladorCelulares {

    private List<ModeloCelulares> listaCelulares;

    public ControladorCelulares(List<ModeloCelulares> listaCelulares) {
        this.listaCelulares = listaCelulares;
    }

    public ModeloCelulares getEspecificaciones(String modelo) {
        for (ModeloCelulares celular : listaCelulares) {
            if (celular.getModelo().equals(modelo)) {
                return celular;
            }
        }
        return null; // Si no se encuentra el celular
    }
}

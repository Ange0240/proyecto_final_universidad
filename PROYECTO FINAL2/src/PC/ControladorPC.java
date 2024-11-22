
package PC;


import java.util.List;

public class ControladorPC {

    private List<ModeloPC> listaPCs;

    public ControladorPC(List<ModeloPC> listaPCs) {
        this.listaPCs = listaPCs;
    }

    public ModeloPC getEspecificaciones(String modelo) {
        for (ModeloPC pc : listaPCs) {
            if (pc.getModelo().equals(modelo)) {
                return pc;
            }
        }
        return null;
    }
}
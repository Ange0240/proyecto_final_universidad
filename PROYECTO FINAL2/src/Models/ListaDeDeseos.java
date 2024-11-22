
package Models;

import CELULAR.ModeloCelulares;
import PC.ModeloPC;
import TABLETS.ModeloTablets;
import TELEVISORES.ModeloTelevisores;
import java.util.ArrayList;
import java.util.List;


public class ListaDeDeseos {
    private List<ModeloCelulares> celulares;
    private List<ModeloPC> pcs;
    private List<ModeloTablets> tablets;
    private List<ModeloTelevisores> televisores;

    public ListaDeDeseos() {
        this.celulares = new ArrayList<>();
        this.pcs = new ArrayList<>();
        this.tablets = new ArrayList<>();
        this.televisores = new ArrayList<>();
    }

    // Métodos para añadir productos a la lista de deseos
    public void agregarCelular(ModeloCelulares celular) {
        celulares.add(celular);
    }

    public void agregarPc(ModeloPC pc) {
        pcs.add(pc);
    }

    public void agregarTablet(ModeloTablets tablet) {
        tablets.add(tablet);
    }

    public void agregarTelevisor(ModeloTelevisores televisor) {
        televisores.add(televisor);
    }

    // Métodos para obtener los productos
    public List<ModeloCelulares> getCelulares() {
        return celulares;
    }

    public List<ModeloPC> getPcs() {
        return pcs;
    }

    public List<ModeloTablets> getTablets() {
        return tablets;
    }

    public List<ModeloTelevisores> getTelevisores() {
        return televisores;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadeconversion;

/**
 *
 * @author Alex3D
 */
public class ConversorPesosADolares extends ConversorPesos {
    
    public ConversorPesosADolares() {
        super(0.0625);
    }
    
    /*public double convertirADolar(double cant) {
        return super.convertirAmoneda(cant);
    }*/
    
    private ConversorPesosADolares(double factorCambio) {
        super(factorCambio);
    }
    
}

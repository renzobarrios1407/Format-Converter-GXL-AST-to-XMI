/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.File;


/**
 *Esta interface se encarga de contener los metodos encargados, de la convercion del archivo xml
 * a un documen, el cual sera  legible para java.
 * @author Estudiante
 */
public interface Parser {
    /**
     * este metodo se encarga de la convercion de un archivo xml, a un document
     * @param archivoxml
     * @return 
     */
    public void generarDocumento(File archivoxml);
    
}

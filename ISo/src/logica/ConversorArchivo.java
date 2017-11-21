/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author Estudiante
 */
public class ConversorArchivo  {
    private ConversorDeArchivoXML archivo;
    private AnalizadorArchivo analizador;

    public ConversorArchivo() {
        this.archivo = new ConversorDeArchivoXML();
    }

    public ConversorArchivo(ConversorDeArchivoXML archivo) {
        this.archivo = archivo;
    }

    public ConversorDeArchivoXML getArchivo() {
        return archivo;
    }

    public void setArchivo(ConversorDeArchivoXML archivo) {
        this.archivo = archivo;
    }
    public Document getDocumento(){
        return this.archivo.getInformacionDocumento();
    }

    public AnalizadorArchivo getAnalizador() {
        return analizador;
    }

    public void setAnalizador(AnalizadorArchivo analizador) {
        this.analizador = analizador;
    }
    
    
    
   public void cargarDocumentoAAnalizar(){
       this.getAnalizador().setDocumento(this.getDocumento());
   }
    
}

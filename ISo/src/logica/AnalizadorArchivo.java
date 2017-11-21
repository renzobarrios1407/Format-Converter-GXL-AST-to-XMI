/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import static java.lang.System.out;

/**
 *
 * @author Estudiante
 */
public class AnalizadorArchivo implements ExtraccionNodos
 {
    private Nodos nodos;
    private Document documento;
    
    public AnalizadorArchivo() {
        this.documento = null;
        nodos = new Nodos();
    }

    public AnalizadorArchivo(Document documento) {
        this.documento = documento;
        nodos = new Nodos();
    }

    public Document getDocumento() {
        return documento;
    }

    public void setDocumento(Document documento) {
        this.documento = documento;
    }
    
    /**
     * se encarga de agrupar todos elementos de un nodo
     * @param etiqueta
     * @return 
     */
    @Override
    public List getNodos(String etiqueta){
        return null;
    } 
    
    @Override
    public void mostrarInformacionNodo(List l){
    }
    
    public Nodos getNodos() {
        return nodos;
    }

    public void setNodos(Nodos nodos) {
        this.nodos = nodos;
    }  
}

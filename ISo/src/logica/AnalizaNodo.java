/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import static java.lang.System.out;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author Estudiante
 */
public class AnalizaNodo extends AnalizadorArchivo{


    public AnalizaNodo() {
    }

    public AnalizaNodo(Document documento) {
        super(documento);
        
    }
    
    /**
     * se encarga de agrupar todos elementos de un nodo
     * @param etiqueta
     * @return 
     */
    @Override
    public List getNodos(String etiqueta){
        Element rootNode =this.getDocumento().detachRootElement();
        return rootNode.getChildren(etiqueta);
    } 
    
    
    @Override
    public void mostrarInformacionNodo(List l){
        int con=1;
        for (Object elemento : l) {
            Element el =(Element)elemento; 
            Nodo tem_nodo= new Nodo();
            tem_nodo.setId(el.getAttributeValue("id"));
            tem_nodo.setType(el.getChildText("type"));
           // tem_nodo.setAtrib(el.getChildText(""));
            this.getNodos().addNodo(null);
        }
    }


}

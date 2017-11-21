/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Nodo {    
    private String id;
    private String Type;
    private Atributos atrib = new Atributos(); // se hace el con el fin de que esa clase sea experta en eso

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Atributos getAtrib() {
        return atrib;
    }

    public void setAtrib(Atributos atrib) {
        this.atrib = atrib;
    }
    
    
    
    
    
}

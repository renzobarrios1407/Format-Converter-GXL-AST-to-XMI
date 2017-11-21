/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import com.sun.org.apache.xpath.internal.operations.Variable;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Atributos {
    private ArrayList<Atributo> atributos;

    public Atributos() {
        this.atributos = new ArrayList<>();
    }
    
    public void addVariable(Atributo p){
        this.atributos.add(p);
    }
    
    public Atributo getVariable(int p){
        return this.atributos.get(p);
    }
    // que valide por el nombre que el nombre exista o qu eretorne la pos
    
    public boolean vlidarAtributo(Atributo a){
        for (Atributo atributo : atributos) {
            if(atributo.equals(a)){
                return true;
            }
        }
        return false;
    }
    
    public int posicionAtributo(Atributo a){
        int c=0;
        for (Atributo atributo : atributos) {
            if(atributo.equals(a)){
                return c;
            }
            c++;
        }
        return -1;
    }
    
    public boolean vlidarAtributo(String a){
        
        for (Atributo atributo : atributos) {
            if(atributo.getNomtipoAtributo().equals(a)){
                return true;
            }
            
        }
        return false;
    }
}

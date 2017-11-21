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
public class Nodos {
    private ArrayList<Nodo> nodos;

    public Nodos(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }
    
    public Nodos() {
        this.nodos = new ArrayList<>();
    }    

    public ArrayList<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }
    
    public void addNodo(Nodo n){
        this.nodos.add(n);
    }
    
    public void setNodo(int p,Nodo n){
        this.nodos.set(p, n);
    }
    
    public boolean validarNodo(Nodo n){
        for (Nodo nodo : nodos) {
            if(nodo.equals(nodo))
                return true;
        }
        return false;
    }
    
    public int posicionNodo(String n){
        int c=0;
        for (Nodo nodo : nodos) {
            if(nodo.getId().equalsIgnoreCase(n))
                return c;
            c++;
        }
        return c;
    }
    
    public int posicionNodo(Nodo n){
        int c=0;
        for (Nodo nodo : nodos) {
            if(nodo.equals(n))
                return c;
            c++;
        }
        return -1;
    }
 
    
}

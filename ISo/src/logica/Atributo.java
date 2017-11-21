/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

/**
 *
 * @author Estudiante
 */
public class Atributo {
    private String nombreAtrrib;
    private String tipoAtributo;
    private String nomtipoAtributo;

    public Atributo(String nombreAtrrib, String tipoAtributo, String nomtipoAtributo) {
        this.nombreAtrrib = nombreAtrrib;
        this.tipoAtributo = tipoAtributo;
        this.nomtipoAtributo = nomtipoAtributo;
    }

    public String getNombreAtrrib() {
        return nombreAtrrib;
    }

    public void setNombreAtrrib(String nombreAtrrib) {
        this.nombreAtrrib = nombreAtrrib;
    }

    public String getTipoAtributo() {
        return tipoAtributo;
    }

    public void setTipoAtributo(String tipoAtributo) {
        this.tipoAtributo = tipoAtributo;
    }

    public String getNomtipoAtributo() {
        return nomtipoAtributo;
    }

    public void setNomtipoAtributo(String nomtipoAtributo) {
        this.nomtipoAtributo = nomtipoAtributo;
    }
    
    

    
    
    
    
}

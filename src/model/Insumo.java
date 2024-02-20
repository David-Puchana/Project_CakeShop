/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author davidpuchana
 */
public class Insumo {
    private int id;
    private String nombre;
    private String unidadDeMedida;

    public Insumo(int id, String nombre, String unidadDeMedida) {
        this.id = id;
        this.nombre = nombre;
        this.unidadDeMedida = unidadDeMedida;
    }
    
    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }
    
    public String toString(){
        return this.nombre;
    }
    
}

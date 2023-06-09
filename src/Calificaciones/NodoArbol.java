/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calificaciones;

/**
 *
 * @author Johan Ordoñez
 */
public class NodoArbol {
    private int dato;
    private NodoArbol izq,der;
    
    public NodoArbol(int dato, NodoArbol izq, NodoArbol der){
        this.dato=dato;
        this.izq=izq;
        this.der=der;
    }
    
    public int getDato(){
        return dato;
    }
    public void setDato(int dato){
        this.dato=dato;
    }
    
    public NodoArbol getIzq(){
        return izq;
    }
    public void setIzq(NodoArbol izq){
        this.izq=izq;
    }
    
    public NodoArbol getDer(){
        return der;
    }
    public void setDer(NodoArbol der){
        this.der=der;
    }
}

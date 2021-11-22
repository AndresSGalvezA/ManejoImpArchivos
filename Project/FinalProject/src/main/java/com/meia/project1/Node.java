/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meia.project1;

/**
 *
 * @author mau_l
 */
public class Node {
    public Node Izq;
    public Node Der;
    public String datos;
    public String llave;
    public int No_registro; 
 
    public Node(int numberRegister, String key , String data){
        Izq = null;
        Der = null;
        llave = key;
        No_registro = numberRegister;
        datos = data;
    }
    
    public boolean IsLeaf(){
        if (Der == null && Izq == null) {
            return true;
        } else {
            return false;
        }
    }
    
}

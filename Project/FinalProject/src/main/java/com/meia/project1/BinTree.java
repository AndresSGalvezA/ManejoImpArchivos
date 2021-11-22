/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meia.project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author mau_l
 */
public class BinTree {
    private int counter = 1;
    public Node raiz = null;
    private List listDataTree;
    private List List_msg;
    private List List_Search;

    public void Cargar() throws FileNotFoundException, IOException
    {
        counter = 1;
        raiz = null;
        try {
            String Archivo  = "C:\\MEIA\\Materiales_2.txt";
            File materiales = new File(Archivo);
            if (materiales.exists()) {
                FileReader fReader = new FileReader(Archivo);
                BufferedReader br = new BufferedReader(fReader);
                var Linea = br.readLine();

                while(Linea != null) {
                    if(!"".equals(Linea)) {
                        var datos = Linea.split(Pattern.quote("|"));
                        String llave = datos[3];
                        var Linea_datos = datos[3] +"|" + datos[4] + "|" + datos[5] + "|" + datos[6] + "|" 
                            + datos[7] + "|" + datos[8]+ "|" + datos[9];
                        Insertar(llave,Linea_datos);       
                    }
                
                    Linea = br.readLine();
                }
            
                br.close();
                fReader.close();
            }
        } catch (IOException ex) { ex.printStackTrace(); }           
    } 

    public void Insertar(String llave, String data){
        var newNode = new Node(counter, llave, data);
        
        if (raiz == null) {
            raiz = newNode;
            counter++;  
        } else {
            raiz = InsertNode(raiz, newNode);
            counter++;
        }
    }

    private Node InsertNode(Node currentNode, Node newNode){
        if (newNode.llave.compareTo(currentNode.llave) > 0) {
            if (currentNode.Der == null) {             
                currentNode.Der = newNode;                  
                return currentNode;
            } else {
                currentNode.Der = InsertNode(currentNode.Der, newNode);
                return currentNode;
            }
        }
     
        if (newNode.llave.compareTo(currentNode.llave) < 0) {
            if (currentNode.Izq == null) {
                currentNode.Izq = newNode;
                return currentNode;
            } else {
                currentNode.Izq = InsertNode(currentNode.Izq, newNode);
                return currentNode;
            }
        }   
   
        return null;
    }
    
    private void inOrder(Node root) {
        var izqNo = "";
        var derNo = "";   
    
        if (root != null) {
            inOrder(root.Izq);
            
            if (root.Izq == null) {
                izqNo = "-1";
            } else {
                izqNo =   Integer.toString(root.Izq.No_registro);  
            }
            
            if (root.Der == null) {
                derNo = "-1";
            } else {
                derNo =  Integer.toString(root.Der.No_registro); 
            }
            
            var raizNo =  Integer.toString(root.No_registro);   
            var register =  raizNo + "|" + derNo + "|" + izqNo  + "|" + root.datos;
            listDataTree.add(register);
            inOrder(root.Der);    
        }
    }
    
    public void posOrden(Node root){
       var izqNo = "";
       var derNo = "";
     
       if (root != null) {
           posOrden(root.Der);
            
           if (root.Der == null) {
               derNo = "-1";
           } else {
               derNo =  Integer.toString(root.Der.No_registro);
           }
            
           if (root.Izq == null)
           {
               izqNo = "-1";
           } else {
               izqNo =  Integer.toString(root.Izq.No_registro);
           }          
            
           var raizNo =  Integer.toString(root.No_registro);
           var register =  raizNo + "|" + derNo + "|" + izqNo  + "|" + root.datos;          
           listDataTree.add(register);
           posOrden(root.Izq);     
        }
    }
 
    public void PreOrden(Node root){
        var izqNo = "";
        var derNo = "";
     
        if (root != null) {
            if (root.Der == null) {
              derNo = "-1";
            } else {
                derNo = Integer.toString(root.Der.No_registro);
            }
           
            if (root.Izq == null) 
            {
                izqNo = "-1";
            } else {
                izqNo =  Integer.toString(root.Izq.No_registro);  
            }          
          
            var raizNo =  Integer.toString(root.No_registro);
            var register =  raizNo + "|" + izqNo + "|" +  derNo + "|" + root.datos;         
            listDataTree.add(register);
            PreOrden(root.Izq);  
            PreOrden(root.Der);                         
        }
    }

    public void WriteTree(String pathFileTree) throws IOException {
        listDataTree = new ArrayList(); 
        PreOrden(raiz);
        var manejoArchivos = new ManejoArchivo();
        var strError = "";   
        
        for (int i = 0; i < listDataTree.size(); i++) {
            var Actual_linea = (String) listDataTree.get(i);
            var Actual = Actual_linea.split(Pattern.quote("|"));
            var Archivo_txt = manejoArchivos.LecturaLinea(new File(pathFileTree), strError, Integer.parseInt(Actual[0]) -1);
            var Array_Archivo_txt = Archivo_txt.split(Pattern.quote("|"));
         
            if (Archivo_txt.equals("")) {
                manejoArchivos.Escritura(new File(pathFileTree), Actual_linea, strError, true);
            } else {
                var Modificar = Actual[0] + "|" + Actual[1]+ "|" + Actual[2] + "|"+Array_Archivo_txt[3]+ "|"+Array_Archivo_txt[4]+ "|"+Array_Archivo_txt[5]
                    + "|"+Array_Archivo_txt[6] + "|"+Array_Archivo_txt[7]+ "|"+Array_Archivo_txt[8]+ "|" + Array_Archivo_txt[9];
                manejoArchivos.Modificar(new File(pathFileTree),Archivo_txt, Modificar , strError);
            }
        }
    
        listDataTree.clear();
    }

    void WriteTree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

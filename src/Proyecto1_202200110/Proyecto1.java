/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto1_202200110;

import java.util.ArrayList;
import java.util.Scanner;
import Objetos.IngresoUsuarios;
import Objetos.Kioskos;
import Objeto.Paneles.Pago;
import Objeto.VentanaPrincipal.VentanaPrincipal;
//import VentanaGeneral.VentanaGeneral1;


public class Proyecto1 {

           
    Pago pago = new Pago();
   
        
    public String pure="";
    
    static ArrayList <Kioskos> listakiosko = new ArrayList<Kioskos>();
    public static void main(String[] args) {
        // TODO code application logic here
   // VentanaGeneral1 Ven =new VentanaGeneral1();
    //Ven.setVisible(true);
         VentanaPrincipal Vprincipal =new VentanaPrincipal();
     Vprincipal.setVisible(true);
    // de aqui hacia arriba no se debe tocar nada 
     
     
     
     
     
     
   String cadena ="ABCDEFGHIJKLMNOPQRSTUVWZYabcdefghijklmnopqrstuvwxyz0123456789";
   int longitud=10;
   StringBuilder sb =new StringBuilder();

      for(int i=0;i<longitud;i++){
      double aleatorio=Math.random()*cadena.length();
      int posicion=(int)aleatorio;
      char letra=cadena.charAt(posicion);
      sb.append(letra);}
      
      String Caleatorio = sb.toString();
      
        System.out.println(sb);
        System.out.println("");
        System.out.println(Caleatorio);
    }
 
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import Objeto.Paneles.RegistroDatosFacturacion;


public class datoFactura {
    private String nombreF="";
    private String direccionF="";
    private String nitF="";
    
    public datoFactura(){
    
    }

    public datoFactura(String nom,String direc, String nit) {
        this.nombreF=nom;
        this.direccionF=direc;
        this.nitF=nit;
    }

    public String getNombreF() {
        return nombreF;
    }

    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }

    public String getDireccionF() {
        return direccionF;
    }

    public void setDireccionF(String direccionF) {
        this.direccionF = direccionF;
    }

    public String getNitF() {
        return nitF;
    }

    public void setNitF(String nitF) {
        this.nitF = nitF;
    }
    
    

}
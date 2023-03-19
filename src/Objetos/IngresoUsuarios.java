/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class IngresoUsuarios {
public ArrayList llenadoUni =new ArrayList();
    private String Correo;
    private  String Nombre;
    private String Apellido;
    private String Contraseña;
    private String DPI;
    private String Fechadenacimiento;
    private String Genero;
    private String Nacionalidad;
    private String Sobrenombre;
    private String Telefono;
    private String Rol;
    
    //Aqui esta mi constructor
    
public IngresoUsuarios(String Correo,String Nombre,String Apellido,String Contraseña,String DPI,String Fechanacimiento,String Genero,String Nacionalidad,String Sobrenombre,String Telefono,String Rol){
     this.Correo=Correo;
     this.Nombre=Nombre;
     this.Apellido=Apellido;
     this.Contraseña=Contraseña;
     this.DPI=DPI;
     this.Fechadenacimiento=Fechanacimiento;
     this.Genero=Genero;
     this.Nacionalidad=Nacionalidad;
     this.Sobrenombre=Sobrenombre;
     this.Telefono=Telefono;
     this.Rol=Rol;
}


public IngresoUsuarios(String correo, String contra){
        this.Correo=correo;
        this.Contraseña=contra;
}

    public IngresoUsuarios() {
    }


    public ArrayList getLlenadoUni() {
        return llenadoUni;
    }
    public void setLlenadoUni(ArrayList llenadoUni) {
        this.llenadoUni =llenadoUni;
    }
    
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    public String getContraseña() {
        return Contraseña;
    }
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public String getDPI() {
        return DPI;
    }
    public void setDPI(String DPI) {
        this.DPI = DPI;
    }
    
    public String getFechadenacimiento() {
        return Fechadenacimiento;
    }
    public void setFechadenacimiento(String Fechadenacimiento) {
        this.Fechadenacimiento = Fechadenacimiento;
    }

    public String getGenero() {
        return Genero;
    }
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }
    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getSobrenombre() {
        return Sobrenombre;
    }
    public void setSobrenombre(String Sobrenombre) {
        this.Sobrenombre = Sobrenombre;
    }

    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getRol() {
        return Rol;
    }
    public void setRol(String Rol) {
        this.Rol = Rol;
    }
    
    
    
 
 
    }

   
     
     
     
           
    /*
             public Producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }
            */

    
    


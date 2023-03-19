/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;


public class Kioskos {

private String codigokiosko;
private String nombrekiosko;
private String codigoderegion;//por el momento lo dejo como un String pero primero debo llenar el manejo de regiones 

    public Kioskos(){
    codigokiosko="";
    nombrekiosko="";
    codigoderegion="";
    }
    public Kioskos(String Codigokiosko,String Nombrekiosko, String Codigoderegion){
    this.codigoderegion=Codigoderegion;
    this.codigokiosko=Codigokiosko;
    this.nombrekiosko=Nombrekiosko;
    }

    public String getCodigokiosko() {
        return codigokiosko;
    }

    public void setCodigokiosko(String codigokiosko) {
        this.codigokiosko = codigokiosko;
    }

    public String getNombrekiosko() {
        return nombrekiosko;
    }

    public void setNombrekiosko(String nombrekiosko) {
        this.nombrekiosko = nombrekiosko;
    }

    public String getCodigoderegion() {
        return codigoderegion;
    }

    public void setCodigoderegion(String codigoderegion) {
        this.codigoderegion = codigoderegion;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;


public class estudiante {
     String nombre;
     char sexo;
     double nota; 
    
    public estudiante( String nombre,char sexo,double nota ){

         this.nombre = nombre;
        this.sexo=sexo;
        this.nota=nota;
        
    }    
    public void setNota(double nota){
    this.nota=nota;
    }
    public void setSexo(char sexo){
    this.sexo=sexo;
    
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    public int getNota() {
        return (int) nota;
    }
    public char getSexo() {
       return sexo;
    }
    public String getNombre() {
        return nombre;
    }
    
    
}



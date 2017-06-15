/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.Ej4arrays;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Biblioteca {
    private Libro biblioteca [];
    
    //Constructor sin parametros
    public Biblioteca () {
        this.biblioteca = new Libro[3];
    }
    //constructor parametrizado
    public Biblioteca (int longitud) {
       this.biblioteca = new Libro[longitud];
    }
    //Damos de alta un libro, le indico que el objeto Libro se guarde en una posici√≥n
    public void darAlta(Libro objeto, int posicion) {
        biblioteca [posicion] = objeto;
    }
    //Mostramos los datos del libro
    public void mostrar(){
        for(int i=0; i<this.biblioteca.length; i++){
            System.out.println(this.biblioteca[i]);
        }
    }
    //Buscamos un libro a traves de sus Titulo
    public void buscar (String Titulo){
       boolean encontrado=false;
       for(int i=0;i<2;i++){
            if (biblioteca[i].getTitulo().equals(Titulo)){
                encontrado=true;
            System.out.println ("El libro se encuentra en la biblioteca");break;
        }
       }
    if (!encontrado)
    System.out.println ("El libro no se encuentra en la biblioteca");
    /*Este es un comentario aÒadido para practicar con Git (ej2)*/
    
    /*Este es otro comentario aÒadido para practicar con Git (ej3)*/
    /*Este es otro comentario aÒadido para practicar con Git (ej6)*/
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5;
/**
 *
 * @author Alumno
 */
public class Libro 
{
//Atributos
    private String Titulo, Autor;
    private int NumeroEjemplares, EjemplaresPrestados;

//Metodos
    Libro()
    {
        Titulo="Titulo";
        Autor="Autor";
        NumeroEjemplares=0;
        EjemplaresPrestados=0;
    }
    
    Libro(String Titulo,String Autor,int NumeroEjemplares,int EjemplaresPrestados)
    {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroEjemplares = NumeroEjemplares;
        this.EjemplaresPrestados = EjemplaresPrestados;
    }
    
    //Metodos getter
        public String getTitulo()
        {
            return Titulo;
        }
        public String getAutor()
        {
            return Autor;
        }
        public int getNEjemplares()
        {
            return NumeroEjemplares;
        }
        public int getNPrestados()
        {
            return EjemplaresPrestados;
        }
        
    //Metodos setter
        public void setTitulo(String Titulo)
        {
            this.Titulo="Titulo";
        }
        public void setAutor(String Autor)
        {
            this.Autor="Autor";
        }
        public void setNEjemplares()
        {
            this.NumeroEjemplares=1;
        }
        public void setEPrestados()
        {
            this.EjemplaresPrestados=1;
        }
    //Metodos
        public boolean Prestamo()
        {
            if (NumeroEjemplares>0)
            {
                EjemplaresPrestados +=1;
                NumeroEjemplares -=1;
                System.out.println("Préstamo realizado correctamente.");
                System.out.println("Numero de libros "+NumeroEjemplares+" Prestados "+EjemplaresPrestados+".");
                return true;
            }else
            {
                System.out.println("No quedan ejemplares suficientes para prestar.");
                return false;
            }
        }
        public boolean Devolucion()
        {
            if(EjemplaresPrestados<=0)
            {
                System.out.println("No hay ejemplares que devolver.");
                return false;
            }else
            {
                NumeroEjemplares +=1;
                EjemplaresPrestados -=1;
                System.out.println("Devolucion realizada correctamente.");
                System.out.println("Numero de libros "+NumeroEjemplares+" Prestados "+EjemplaresPrestados+".");
                return true;
            }
        }
        @Override
        public String toString()
        {
            return " Titulo: " + Titulo + "\n" + " Autor: " + Autor + "\n" 
                    + " Número de ejemplares: " + NumeroEjemplares + "\n" 
                    + " Número de ejemplares prestados: " + EjemplaresPrestados;
        }
}
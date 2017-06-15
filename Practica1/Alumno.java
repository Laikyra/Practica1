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
public class Alumno 
{
    //Declaramos los atributos de la clase alumno
    public int n_matricula;
    public String Nombre;
    public String Apellido1;
    public String Apellido2;
    public double [] notas1Ev;
    
    //Definimos el constructor por defecto
    Alumno()
    {
        n_matricula=0; //Lo iniciamos por defecto en 0
        Nombre="Nombre";//El valor por defecto es el nombre del atributo, para cambiarlo despues
        Apellido1="Apellido1";//El valor por defecto es el nombre del atributo, para cambiarlo despues
        Apellido2="Apellido2";//El valor por defecto es el nombre del atributo, para cambiarlo despues
        notas1Ev = new double [6]; //Se inicializa en 0
    }
    
    //definimos los metodos set
    public void setMatricula(int num)
    {
        n_matricula = num;
    }
    public void setNombre(String nom)
    {
        Nombre = nom;
    }
    public void setApellido1(String ap1)
    {
        Apellido1 = ap1;
    }
    public void setApellido2(String ap2)
    {
        Apellido2 = ap2;
    }
    public void setNotas1Ev (double [] not)
    {
        notas1Ev = not;
    }
    
    //definimos los metodos get
    public int getMatricula()
    {
        return n_matricula;
    }
    public String getNombre()
    {
        return Nombre;
    }
    public String getApellido1()
    {
        return Apellido1;
    }
    public String getApellido2()
    {
        return Apellido2;
    }
    public String getNotas1Ev ()
    {
        String notas = "";
        for(int i=0;i<notas1Ev.length;i++)
        {
            notas = notas + " " + notas1Ev[i] + " ";
        }
        return notas;
    }
    
    //Definimos metodos de clase
    public double Media(double [] nota)
    {
        /*
        Declaramos la variable media,que recoge la suma de los valores de cada una de las posiciones
        del array que guarda las notas del alumno. 
        La variable la inicializamos a 0.
        */
        double media = 0;
        for (int i = 0; i<notas1Ev.length ; i++)
        {
            media = media + notas1Ev[i];
        }
        
        return media/notas1Ev.length;
    }
    
    /*public void MostrarAlumno()
    {
        /*
        Mostramos los datos del alumno.
        */
        /*System.out.println("El alumno tiene el numero de matricula " + getMatricula() + 
                ", su nombre es " + getNombre() + ", su primer apellido es " + getApellido1() 
                + ", su segundo apellido es " + getApellido2() + ", y sus notas son " 
                + getNotas1Ev());
    }*/
    
    public String toString()
    {
        return "n_matricula: " + n_matricula + " nombre: " + Nombre + " apellido1: " + Apellido1
                + " apellido2: " + Apellido2 + " notas: " + getNotas1Ev();
                
    }
}

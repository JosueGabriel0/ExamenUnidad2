package pe.edu.upeu.jgom;

import pe.edu.upeu.jgom.utils.LeerTeclado;
import pe.edu.upeu.jgom.examen.ResolucionExamen;


public class App{
    //Objetos 
    static LeerTeclado lt2 = new LeerTeclado();
    static ResolucionExamen res = new ResolucionExamen();
    
    //Metodo MENUDEOPCIONES
    static void menuDeOpciones(){

        int f=lt2.leer(0,"\nLista de Algoritmos:"+"\n\n-Pregunta 2 : 1"+"\n-Pregunta 3 : 2"+
        "\n-Pregunta 4 : 3"+"\n-Pregunta 5 : 4"+"\n-Para Cerrar El Menu de opciones Introduzca el Numero: 0"+"\n\nIntroduzca el numero del algoritmo que desea Probar");
        
        while(f!=0){
            switch(f){
                case 1: res.impuestosDeUnaCompañiaDeAutos();break;

                case 2: res.tablaDeMultiplicacionDel1Al20();break;
                        
                case 3: res.PrimerosNumerosPerfectos();break;

                case 4: int x=lt2.leer(0,"Introduzca la base");
                        int n=lt2.leer(0,"Introduzca el exponente");
                        System.out.println("El resultado de "+x+" con exponente "+n+" es: "+res.potenciaRecursivo(x, n));break;
                        
                default: System.out.println("Elija un algoritmo existente!");   

            }
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
            f=lt2.leer(0,"\nLista de Algoritmos:"+"\n\n-Pregunta 2 : 1"+"\n-Pregunta 3 : 2"+
            "\n-Pregunta 4 : 3"+"\n-Pregunta 5 : 4"+"\n-Para Cerrar El Menu de opciones Introduzca el Numero: 0"+"\n\nIntroduzca el numero del algoritmo que desea Probar");

        }

        
    }



    public static void main( String[] args ){

        System.out.println( "<---------Bienvenido al menú de opciónes del examen de la segunda unidad By JGOM!--------->" );
       
        menuDeOpciones();
       
    }

    
}
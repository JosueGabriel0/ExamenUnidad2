package pe.edu.upeu.jgom;

import pe.edu.upeu.jgom.utils.LeerTeclado;//*
import pe.edu.upeu.jgom.examen.ResolucionExamen;//*


public class App{
    //Objetos 
    static LeerTeclado lt2 = new LeerTeclado();
    static ResolucionExamen res = new ResolucionExamen();
    
    //Metodo MENUDEOPCIONES
    static void menuDeOpciones(){

        int f=lt2.leer(0,"\nLista de Algoritmos:"+"\n\n-Pregunta 2 : 1"+"\n-Pregunta 3 : 2"+
        "\n-Pregunta 4 : 3"+"\n-Pregunta 5 : 4"+"\n-Para Cerrar El Algoritomo Introdusca el Numero: 0"+"\n\nIntrodusca el numero del algoritmo que desea Probar");
        
        while(f!=0){
            switch(f){
                case 1: res.impuestoAutos();break;

                case 2: res.TMultiplicar1hasta20();break;
                        
                case 3: res.numerosperfectos();break;

                case 4: int x=lt2.leer(0,"Introdusca el primer valor");
                        int n=lt2.leer(0,"Introdusca el segundo valor");
                        System.out.println("El resultado es: "+res.potencia(x, n));break;
                        
                default: System.out.println("Elija un algoritmo existente!");   

            }
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
            f=lt2.leer(0,"\nLista de Algoritmos:"+"\n\n-Pregunta 2 : 1"+"\n-Pregunta 3 : 2"+
            "\n-Pregunta 4 : 3"+"\n-Pregunta 5 : 4"+"\n\nIntrodusca el numero del algoritmo que desea Probar");

        }

        
    }



    public static void main( String[] args ){

        System.out.println( "<---------Bienvenido al menú de opciónes del examen de la segunda unidad By JGOM!--------->" );
       
        menuDeOpciones();
       
    }

    
}
package pe.edu.upeu.jgom;
import pe.edu.upeu.jgom.utils.LeerTeclado;
import pe.edu.upeu.jgom.examen.ResolucionExamen;


public class App{
    static LeerTeclado lt = new LeerTeclado();
    static ResolucionExamen res = new ResolucionExamen();

    static void menuDeOpciones(){
        
    }



    public static void main( String[] args ){

        System.out.println( "Bienvenido al menú de opciónes del examen de la segunda unidad By JGOM!" );
        int a=10;
        
        int b= res.multiplicacion3(a);

        System.out.println(b);
       
    }

    
}
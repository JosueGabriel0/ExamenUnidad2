package pe.edu.upeu.jgom.examen;

import pe.edu.upeu.jgom.utils.LeerTeclado;

public class ResolucionExamen {
    //Objetos
    LeerTeclado lt1 =new LeerTeclado();
    
    //Pregunta 2:
    public void impuestosDeUnaCompañiaDeAutos(){
        int x, i=1, tipoCategoria;
        float impuestoAuto, autoPrecio, autoConCategoria1=0, autoConCategoria2=0, autoConCategoria3=0,totalImpuesto=0;
       
        x=lt1.leer(0,"Ingrese el numero de Autos");
        
        while (i<=x){
            
            autoPrecio=lt1.leer(0,"Ingrese el Precio del Auto numero "+i);
            
            tipoCategoria=lt1.leer(0,"Ingrese la Categoria del Auto numero "+i);
            if (tipoCategoria<=3 && tipoCategoria>=1){
                if (tipoCategoria==1){
                    impuestoAuto = (autoPrecio*12)/100; 
                    autoConCategoria1 = autoConCategoria1 + impuestoAuto;
                System.out.println("El Impuesto que debe pagar por el Auto numero "+i+" Es: "+impuestoAuto+"$");
                }
                if (tipoCategoria==2){
                    impuestoAuto = (autoPrecio*8)/100; 
                    autoConCategoria2 = autoConCategoria2 + impuestoAuto;
                System.out.println("El Impuesto que debe pagar por el Auto numero "+i+" Es: "+impuestoAuto+"$");
                }
                if (tipoCategoria==3){
                    impuestoAuto = (autoPrecio*5)/100; 
                    autoConCategoria3 = autoConCategoria3 + impuestoAuto;
                System.out.println("El Impuesto que debe pagar por el Auto numero "+i+" Es: "+impuestoAuto+"$");
                }
            }
            else
                System.out.println("Ingrese una Categoria Válida!");
                
                i++;
            }

            totalImpuesto=autoConCategoria1+autoConCategoria2+autoConCategoria3;
            
            System.out.println("--------------------------------------------------");
            System.out.println("El Impuesto Total de los Autos con Categoria 1 Es: "+autoConCategoria1+"$");
            System.out.println("El Impuesto Total de los Autos con Categoria 2 Es: "+autoConCategoria2+"$");
            System.out.println("El Impuesto Total de los Autos con Categoria 3 Es: "+autoConCategoria3+"$");
            System.out.println("El Impuesto Total por cada Categotia Y por todos los Autos Es: "+totalImpuesto+"$");     
        } 

    //Pregunta 3:
    public void tablaDeMultiplicacionDel1Al20() {
        int i=1, x=20, resultado=0;
        
        while(i<=x){
            System.out.println("\n<--------Tabla de multiplicar del numero "+i+"-------->\n");
            for(int p=1; p<=10; p++){
                resultado=i*p;
                System.out.println(i+" x "+p+" = "+resultado);
            }

            i++;
        }
    }

    //Pregunta 4:
    public void PrimerosNumerosPerfectos() {

        int r=1, DivisoSumatoria;

        System.out.println("Los Primeros números perfectos entre el 1 y 3000 Son: ");
        
        while(r <= 3000){      
            DivisoSumatoria=0;
            int c=1;

            while(c < r){    

                 if(r % c == 0){
                    DivisoSumatoria = DivisoSumatoria + c; 
                 }

                 c++;
            }

          if(r == DivisoSumatoria){                           
             System.out.println(r);
          }
         
          r++;
        }
    }

    //Pregunta 5:
    public int potenciaRecursivo(int l, int f) {

        if (f==1) {
            return l;
        } if (f==0) {
            return 1;
        } else{
            return l * potenciaRecursivo(l, f-1);
        }

    }

}

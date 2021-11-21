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
    public void TMultiplicar1hasta20() {
        int n=1;
        int m=20;
        for (int i=n; i<=m; i++){
            for(int j=1; j<=10; j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
        }
    }
    //Pregunta 4:
    public void numerosperfectos() {
        int i, j, suma;
        System.out.println("Números perfectos entre 1 y 1000: ");
        for(i=1;i <= 1000;i++){     
            suma = 0;
            for(j = 1;j < i;j++){                          
                    if(i % j==0){
                    suma = suma + j; 
                    }
            }
            if(i == suma){                       
                System.out.println(i);
            }
        }
    }
    //Pregunta 5:
    public int potencia(int b, int e) {
        if (e==1) {
            return b;
        } if (e==0) {
            return 1;
        } else{
            return b * potencia(b, e-1);
        }

    }

}

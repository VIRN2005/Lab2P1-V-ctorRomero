
package lab2p1_víctorromero2;
import java.util.Scanner;

public class Lab2P1_VíctorRomero2 {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Victor Romero - 12211079");
        
        int opcion;
        do { 
        System.out.println("_____________________________________________________________ ");
        System.out.println(" ");
        System.out.println(">> MENU <<");
        System.out.println("----------------------- ");
               
        System.out.println("1 -> EJERCICIO 1 => MCD");
        System.out.println("2 -> EJERCICIO 2 => SUMATORIA");
        System.out.println("3 -> EJERCICIO 3 => SUPERMERCADO");
        System.out.println("4 -> SALIDA");
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.print("Ingrese su Opcion: ");
        opcion = leer.nextInt();
        System.out.println("=> La Opcion escojida es: "+opcion);
        System.out.println(" ");
    
        if (opcion == 1){
            int num1, num2;
            int MCD=0;
            
            System.out.println(" .: OPCION 1 :. ");
            System.out.println("OPCION MCD EN CURSO...");
            
            System.out.println(" ");
            System.out.print("> Ingrese el PRIMER numero: ");
            num1=leer.nextInt();
            System.out.print("> Ingrese el SEGUNDO numero: ");
            num2=leer.nextInt();
            
            while (num1 < 0 || num1 == 0){
                System.out.println("NUMERO NO VALIDO - ERROR 404!");
                System.out.print("> Ingrese un numero POSITIVO:  "); 
                num1 = leer.nextInt();
                System.out.println(" ");} // Validación Num1
            
            while (num2 < 0 || num2 == 0){
                System.out.println("NUMERO NO VALIDO - ERROR 404!");
                System.out.print("> Ingrese un numero POSITIVO:  "); 
                num2 = leer.nextInt();
                System.out.println(" ");}// Validación Num2
                
                do {
                  if (num1>num2){
                  MCD=num2;
                  MCD=num1-num2;
                  num1=MCD;        
                    } // Fin MCD num1 mayor que num2 
                else if (num1<num2){
                  MCD=num1;
                  MCD=num2-num1;
                  num2=MCD;      
                    }// Fin MCD num2 mayor que num1
                
                } while (num1 != num2);
        System.out.println(">> EL MCD ES: "+MCD);            
        }// Fin Opcion 1 ____________________________________________________ 
           
        
        else if (opcion ==2){
        System.out.println(" .: OPCION 2 :. ");
        System.out.println("OPCION SUMATORIA EN CURSO...");   
        
        double k;
        double n=1;
        double y=0.0;
        double base=0;
        
        System.out.println(" ");
        System.out.print("> Ingrese el LIMITE de la Sumatoria: ");
        k=leer.nextInt();
        
        while (k < 0 || k == 0){
                System.out.println("NUMERO NO VALIDO - ERROR 404!");
                System.out.print("> Ingrese un numero POSITIVO:  "); 
                k = leer.nextInt();
                System.out.println(" ");}// Validación While
        
        while (n<=k){         
            base=n/(n+1);
            y=Math.pow(base, n)+y;
            n++;
            } // Fin de Formula
            System.out.println(">> LA SUMATORIA ES DE: "+ y);
           
        }// Fin Opcion 2 ____________________________________________________ 
        
        else if (opcion ==3){
        int cliente;
       
        System.out.println(">> TIPO CLIENTE <<");
        System.out.println("----------------------- ");
               
        System.out.println("(0) CLIENTE 0");
        System.out.println("(1) CLIENTE 1");
        System.out.println("(2) CLIENTE 2 ");
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.print("> Ingrese el TIPO de Cliente: ");
        cliente=leer.nextInt();
        
        
        while (cliente < 0 || cliente >2){
                System.out.println("NUMERO NO VALIDO - ERROR 404!");
                System.out.print("> Ingrese un numero VALIDO:  "); 
                cliente = leer.nextInt();
                System.out.println(" ");}
                      
               
        if (cliente==0){
            System.out.println(" === CLIENTE 1 ===");
        double precio; 
        double cantidad; 
        double cantidadNew = 0, total;
        System.out.print("> Ingrese el Precio del Producto: ");
        precio=leer.nextDouble();
        System.out.print("> Ingrese la Cantidad de Productos: ");
        cantidad=leer.nextDouble();
            
            
            if (cantidad >= 0 || cantidad <= 9){
            total = cantidad*precio;
            System.out.println(">> EL TOTAL A PAGAR ES: "+total);
            }
            
            else if ( cantidad >=10 || cantidad <= 19){
            cantidadNew=cantidad - 2;
            total = cantidadNew*precio;
            System.out.println(">> EL TOTAL A PAGAR ES: "+total);
            }
            
            else if (cantidad >= 20)
            cantidadNew=cantidad-5;
            total = cantidadNew*precio;
            System.out.println(">> EL TOTAL A PAGAR ES: "+total);
        }// Fin Cliente 0
                
        else if (cliente==1){
        System.out.println(" === CLIENTE 1 ===");
        double precio; 
        double cantidad; 
        double cantidadNew = 0, total;
        System.out.print("> Ingrese el Precio del Producto: ");
        precio=leer.nextDouble();
        System.out.print("> Ingrese la Cantidad de Productos: ");
        cantidad=leer.nextDouble();
        
            double subtotal, desc;
            
            if (cantidad >= 0 && cantidad <= 19){
            subtotal = cantidad*precio;
            desc = subtotal*0.10;
            total= subtotal-desc;
            System.out.println(">> EL TOTAL A PAGAR ES: "+total);
            }
                    
            else if (cantidad >=20 && cantidad <= 29){
            cantidadNew = cantidad - 2;
            subtotal = cantidadNew*precio;
            desc = subtotal*0.10;
            total= subtotal-desc;
            System.out.println(">> EL TOTAL A PAGAR ES: "+total);   
            }
        
            else if (cantidad >= 30){
            cantidadNew = cantidad - 5;
            subtotal = cantidadNew*precio;
            desc = subtotal*0.10;
            total= subtotal-desc;
            System.out.println(">> EL TOTAL A PAGAR ES: "+total);
            }
        }
            
        else if (cliente==2){
        System.out.println(" === CLIENTE 1 ===");
        double precio; 
        double cantidad; 
        double cantidadNew = 0, total;
        System.out.print("> Ingrese el Precio del Producto: ");
        precio=leer.nextDouble();
        System.out.print("> Ingrese la Cantidad de Productos: ");
        cantidad=leer.nextDouble();
            
         double subtotal, desc;
            
            if (cantidad >= 0 && cantidad <= 19){
            subtotal = cantidad*precio;
            desc = subtotal*0.30;
            total= subtotal-desc;
            System.out.println(">> EL TOTAL A PAGAR ES: "+total);
            }
                    
            else if (cantidad >=30 && cantidad <= 39){
            cantidadNew = cantidad - 2;
            subtotal = cantidadNew*precio;
            desc = subtotal*0.30;
            total= subtotal-desc;
            System.out.println(">> EL TOTAL A PAGAR ES: "+total);   
            }
        
            else if (cantidad >= 40){
            cantidadNew = cantidad - 5;
            subtotal = cantidadNew*precio;
            desc = subtotal*0.30;
            total= subtotal-desc;
            System.out.println(">> EL TOTAL A PAGAR ES: "+total);
            }
        }
        }
        else if (opcion == 4) {
        System.out.println("SALIENDO...."
                + "\n TASK DONE!"
                + "\n TENGA UN LINDO DIA :D");   
        }// Fin Opcion 4 ____________________________________________________ 
    
        }while (opcion != 4);
    
        } 
}


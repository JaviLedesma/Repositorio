

package ProgramaApp;
import listase.*;
  import java.util.Random;
/**
 *
 * @author Kelly Zarco
 */
public class ListaApp {
    
    Lista LNum;
    
    public ListaApp(){
    		
            LNum=new Lista(); 
            //Probando 
		}

		
public void  generar(){
			Object entrada;
			String op;
			Nodo p=LNum.Inicio();
			
			op="s";
			System.out.println("Carga de la lista");
			while (op.charAt(0) !='n')
			{
			    System.out.print("Ingrese un numero:");
			    entrada=EntradaSalida.leerInt();
			      
	       		    LNum.insertarFin(entrada); 
			     
			    	
	 		    System.out.println("Desea seguir cargando ¿? S/N ");
			    System.out.println(" ");
			    op=EntradaSalida.leerString();
	       	}
	}	

	public void visualizar(){
		   
		     Nodo q=LNum.Inicio();
		    while(q!=null)
		    {
		        System.out.print(q.getDato() + " ");
		        
		        q=q.getPs();
		  	}   
		  	
		    
		}
	public void generarAleatorio(){ 
		    Random r=new Random();
		    int elem;
		    int m;
		   // m=Math.abs(r.nextInt()*99+1);
		    for(int i=0;i<5;i++){
		        elem=(int)(r.nextDouble() * 10.0);
                        System.out.println(elem);
		        LNum.insertarpri(elem);
		          	}   

		} 
        public void busqueda(){
            int b=0; 
            Nodo p=LNum.Inicio(); 
            System.out.println("Ingrese el elemento que busca:");
            Object ele=EntradaSalida.leerInt();
            while(p!=null && b==0){
                if(p.getDato()== ele){
                    b=1;
                }
            p=p.getPs();
            } 
            if(b==1)
                EntradaSalida.mostrarMensaje("El elemento ingresado existe!");
            else
                EntradaSalida.mostrarMensaje("El elemento ingresado NO existe!");
        }
	public void eliminarElemento(){
            char op='s'; 
            while(op!='n'){
                System.out.println("Ingrese elemento:");
                Object ele=EntradaSalida.leerInt(); 
                buscoElemento(ele);
                EntradaSalida.mostrarMensaje(" Dece seguir eliminando¿? - S/N");
                op=EntradaSalida.leerChar(); 
            }
        } 
        public void buscoElemento(Object elem){
            int b=0;
            Nodo p=LNum.Inicio(); 
            Nodo q=null; 
            while(p.getPs()!= null && b==0){
                if(p.getDato()== elem){
                    LNum.quitar(p, q); 
                    b=1; 
                    System.out.println("El elemento a sido eliminado!");
                }
                else{
                q=p;
                p=p.getPs();
                }
            }
            if(b==0){
                System.out.println("El elemento NO existe!");
            }
        } 
        public void imprimeMenu(){
            System.out.println ("\n*************************************************************************");
            System.out.println ("1 - Generar la Lista:");
            System.out.println ("2 - Generar aleatorio:");
            System.out.println ("3 - Mostrar la lista:");
            System.out.println ("4 - Buscar un elemento:");
            System.out.println ("5 - Eliminar un elemento:");
            System.out.println ("6 - Fin programa.-");
            System.out.print("\tIngrese su Opcion:");
        }
	
	public void menu(){
	    int opc=0;
            do{
            switch (opc){
                case 1:generar(); break; 
                case 2:generarAleatorio(); break;
                case 3:visualizar();break;      
                case 4: busqueda();break;
                case 5:eliminarElemento(); break;   
                case 0:break;
            }
           imprimeMenu();
            opc= EntradaSalida.leerInt();
            } while (opc!=6);
          }
		}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listase;

/**
 *
 * @author Kelly Zarco
 */
public class Lista {

	
 private Nodo inicio;
	    
//	************************************* CONSTRUCTOR ******************************************************
	    
 public Lista(){
	     inicio= null;
	    }

	                

//	***************************************** INICIO *******************************************************

 public Nodo Inicio(){
	        return inicio;
	    }

//	********************************** INSERTAR AL PRINCIPIO ***********************************************
	    
 public void insertarpri(Object elem){
	        Nodo x= new Nodo(elem);
	        if(inicio==null){
	            inicio=x;
	        }
	        else{
	        x.setPs(inicio);
	        inicio=x;
	    }
	    }
public void insertarFin(Object elem) {
	       Nodo x= new Nodo(elem);
               Nodo p=Inicio();
               if(Inicio()==null){
                   inicio=x;}
               else{
               while (p.getPs()!=null){
	            p=p.getPs();
                     }
	       p.setPs(x);
	       }	    
               }
//	******************************************** QUITAR ****************************************************
	    
	    public Nodo quitar(Nodo p, Nodo q){
	        Nodo x=p;
	      
	        if (p==inicio){
	        	inicio=p.getPs();
	           	              }
	        else {
	        	q.setPs(p.getPs());
	        
	            
	        }
	        return x;
	    }
	    

	}

 


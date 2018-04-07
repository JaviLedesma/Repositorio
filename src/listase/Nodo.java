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
public class Nodo {
        private Object  dato;
	    private Nodo ps;

	    public Nodo(Object elem)
	    {
	        dato=elem;
	        ps=null;
	    }

		public Object getDato() {
			return dato;
		}

		public void setDato(Object dato) {
			this.dato = dato;
		}

		public Nodo getPs() {
			return ps;
		}

		public void setPs(Nodo ps) {
			this.ps = ps;
		}
	    
	    

}

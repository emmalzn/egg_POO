/*
 * 
 * 
 */
package entidad;


public class Vectores {
   private int [] arregloA = new int [50];
   private int [] arregloB = new int [20];

    public Vectores() {
    }
    
    public Vectores(int[] arregloA, int[] arregloB) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;
        
    }


    public int[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(int[] arregloA) {
        this.arregloA = arregloA;
    }

    public int[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(int[] arregloB) {
        this.arregloB = arregloB;
    }
   
}

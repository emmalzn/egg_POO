/*
 * 
 * 
 */
package Servicio;

import entidad.Matematica;


public class MatematicaServicio {
    
    public void devolverMayor(Matematica mate){
        
        int numMayor = Math.max(mate.getNum1(), mate.getNum2());
        
        System.out.println("El número mayor es: " + numMayor);
    }
    
    public void calcularPotencia(Matematica mate){
        
        int numMayor = Math.max(mate.getNum1(), mate.getNum2());
        int numMenor = Math.min(mate.getNum1(), mate.getNum2());
        double potencia = Math.pow(numMayor, numMenor);
        
        
        System.out.println("La potencia de: " + numMayor + " elevado a " + numMenor + " es: " + potencia);
    }
    
    public void calculaRaiz(Matematica mate){
        
        int numMenor = Math.min(mate.getNum1(), mate.getNum2());
        double raiz = Math.sqrt(Math.abs(numMenor));
        
        System.out.println("La raiz cuadrada de: " + numMenor + " es: " + raiz);
    }

}

/*
 * 
 * 
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;


public class ServiciosCircunferencia {
    
    public Circunferencia crearCircunferencia(){
        
        Circunferencia circulo = new Circunferencia();
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo");
        circulo.setRadio(in.nextInt());
        
        return circulo;
    
    }
    
    public void area(Circunferencia circulo){
        
        double area = Math.PI * Math.pow(circulo.getRadio(),2);
        
        System.out.println("El área del circulo es: " + area);
    }
    
    public void perimetro(Circunferencia circulo){
        
        double perimetro = 2 * Math.PI * circulo.getRadio();
        
        System.out.println("El perímetro del circulo es: " + perimetro);
    }

}

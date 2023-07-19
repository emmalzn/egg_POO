/*
 * 
 * 
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;


public class RectanguloServicio {
    
    public Rectangulo crearRectangulo(){
        
        Rectangulo inf = new Rectangulo();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa la base del rectagulo en cm");
        inf.setBase(in.nextInt());
        
        System.out.println("Ingresa la altura del rectagulo en cm");
        inf.setAltura(in.nextInt());
        
        return inf;
    }
    
    public void superficieRectangulo(Rectangulo inf){
        
        int superficie = inf.getAltura() * inf.getBase();
        System.out.println("La superficie del rectangulo es;  " + superficie + "cm");
    
    }
    
    public void perimetroRectangulo(Rectangulo inf){
        
        int perimetro = (inf.getAltura() + inf.getBase()) * 2;
        System.out.println("La superficie del rectangulo es;  " + perimetro + "cm");
    
    }
    
    public void dibujarRectangulo(Rectangulo inf){
        
        for (int i = 0; i < inf.getBase(); i++) {
            for (int j = 0; j < inf.getAltura(); j++) {
                System.out.print(" * ");  
            }
            System.out.println("");
        }
    
    }

}

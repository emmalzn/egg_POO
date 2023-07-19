/*
 * 
 * 
 */
package servicio;

import entidad.Persona;
import java.util.Scanner;


public class PersonaServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona info = new Persona();
        
        System.out.println("Ingresa tu nombre");
        info.setNombre(entrada.nextLine());
        
        System.out.println("Ingresa tu edad");
        info.setEdad(entrada.nextInt());
        
        entrada.nextLine();
        
        //Comprobar que el usuario solo ingrese f, m, u o 
        do{
        System.out.println("Ingresa tu sexo M para masculino, F para femenino, O para otro");
        info.setSexo(entrada.nextLine());
        
        if(!info.getSexo().equalsIgnoreCase("m") && !info.getSexo().equalsIgnoreCase("f") && !info.getSexo().equalsIgnoreCase("o")){
            System.out.println("Ingresa una opcion correcta");
        }
        
        }while (!info.getSexo().equalsIgnoreCase("m") && !info.getSexo().equalsIgnoreCase("f") && !info.getSexo().equalsIgnoreCase("o"));
        
        System.out.println("Ingresa tu peso en kg");
        info.setPeso(entrada.nextDouble());
        
        System.out.println("Ingresa tu altura en metros");
        info.setAltura(entrada.nextDouble());
        
        return info;
    }
    
    public int calcularIMC(Persona info){
        
           double imc =  info.getPeso()/Math.pow(info.getAltura(), 2);
           
           if (imc < 20){
               return -1;
           } else if(imc >= 20 && imc <= 25){
               return 0;
           }else {
               return 1;
           }
           
    }
    
       public boolean esMayorDeEdad(Persona info) {
           
        return info.getEdad()>= 18;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexercicioseis;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class AppExercicioSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
     double base,altura,AreaTriangulo;
        
        Scanner teclado = new Scanner (System.in);
       
       System.out.println("Digite a base do triangulo: "); 
       base = teclado.nextDouble();
       System.out.println("Digite a altura do triangulo: "); 
       altura = teclado.nextDouble();;
       AreaTriangulo = base * altura / 2.0;
    
        System.out.println("A area de um triangulo e:" +AreaTriangulo);
    
    
    
    
    
    
    
    
    
    
    
    }
    
}

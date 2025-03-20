/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import Services.IMath;

/**
 *
 * @author marbellymoreno
 */
public class lamdaApp {
    public static void main(String[] args) {
            
        IMath objeto = new IMath(){
            @Override
            public Double execute (Double a, Double b) {
                return a - b;
            }
        };
        
        System.out.println( objeto.execute(5.0 ,8.0));
        
        IMath multiplicar = (a, b) -> a * b;
         System.out.println( multiplicar.execute(5.0 ,8.0));
        
        IMath dividir = (a, b) ->{
        return a /b;
        };
        System.out.println(dividir.execute(5.0 ,8.0));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.List;

/**
 *
 * @author marbellymoreno
 */
public class LambdasFor {
    public static void main(String[] args) {
        List<String> pais = List.of(
                "El salvador",
                "Guatemala", 
                "Honduras", 
                "EEUU", 
                "Mexico");
        for (String temp : pais){
            System.out.println(temp);
        }
        System.out.println("--------------------------------------");
        pais.forEach( c -> System.out.println(c.toUpperCase()));
        
    }
}

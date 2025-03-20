/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.borrador1;

import Services.InterfaceBD1;
import java.lang.reflect.Field;

/**
 *
 * @author marbellymoreno
 */
public class Borrador1 {

        public static void main(String[] args) {
           implementarClassInterfaz  obj = new implementarClassInterfaz();
           implementacionClase2 obj2 = new implementacionClase2();  
           
          System.out.println(implementarClassInterfaz.class.getName());
          System.out.println(implementacionClase2.class.getName());
          
          Field[] fields = implementacionClase2.class.getDeclaredFields();
            
          for ( Field field : fields ){
              System.out.println("nombre " + field.getName());
              System.out.println("Tipo " + field.getType());
          }
          
         InterfaceBD1<String> Temp = new InterfaceBD1<String>(){
               @Override
               public String getAll() {
                   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }

               @Override
               public String getById(int id) {
                   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }

               @Override
               public String insert(String objeto) {
                   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }

               @Override
               public String Update(String objeto) {
                   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }

               @Override
               public String delete(String objeto) {
                   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }
            };
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.borrador1;

import Modelos.EjemploTipo1;
import Services.InterfaceBD1;

/**
 *
 * @author marbellymoreno
 */
public class implementacionClase2 implements InterfaceBD1<EjemploTipo1>{

     EjemploTipo1 obj = new EjemploTipo1();
    @Override
    public EjemploTipo1 getAll() {
       obj.setDireccion("sin marca interfaz 2");    
       return  obj;
    }

    @Override
    public EjemploTipo1 getById(int id) {
        System.out.println( obj.getDireccion());
       return  obj;
    }

    @Override
    public EjemploTipo1 insert(String objeto) {
        obj.setNombre("Insert desde interfaz 2");
       return  obj;
    }

    @Override
    public EjemploTipo1 Update(String objeto) {
        System.out.println( obj.getNombre());
       return  obj;
    }

    @Override
    public EjemploTipo1 delete(String objeto) {
       System.out.println( obj.getNombre());
       return  obj;
    }   
    
    public String all(){
        return obj.toString();
    }
}

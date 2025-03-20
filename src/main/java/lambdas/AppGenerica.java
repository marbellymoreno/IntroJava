/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import Modelos.EjemploTipo1;
import Modelos.Modelo2;
import Services.IPrinter;

/**
 *
 * @author marbellymoreno
 */
public class AppGenerica {
    public static void main(String[] args) {
        IPrinter<String> imp = (objeto) -> {
            System.out.println(objeto);
        };
        imp.printer("Lambda desde interfaz");

        IPrinter<EjemploTipo1> ejem = modelo -> System.out.println(modelo);

        EjemploTipo1 MEjemplo = new EjemploTipo1();
        MEjemplo.setDireccion("Chalatenango, Chalatenango");
        MEjemplo.setNombre("Ever Sorto");
        ejem.printer(MEjemplo);

        IPrinter<Modelo2> md2 = temp -> System.out.println(temp);

        Modelo2 obj2 = new Modelo2();
        obj2.setEmpresa("Ecomoda");
        obj2.setMarca("Chinita");

        md2.printer(obj2);
    }
}

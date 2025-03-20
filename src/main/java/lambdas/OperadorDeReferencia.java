/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 *
 * @author marbellymoreno
 */
public class OperadorDeReferencia {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(10);
        IntStream repetir = IntStream.range(1, 11);
        // repetir.forEach(i ->  numbers.add(i));
        repetir.forEach(numbers::add);
        System.out.println(numbers);

        Supplier<UUID> getToken = UUID::randomUUID;
        System.out.println(getToken.get());
        
        //Supplier<Prueba1> rConstructor = ()-> new Prueba1();
        Supplier<Prueba1> rConstructor = Prueba1::new ;
        System.out.println(rConstructor.get());
        
        //BiPredicate<String,String> nombre = (x,y)-> x.equals(y);
        BiPredicate<String, String> nombre = String::equals;
        boolean aplicar = nombre.test("I am", "Bat man");
        System.err.println(aplicar);
    }
}

class Prueba1 {

    private String id;
    private Integer edad;

   public  Prueba1() {
      this.id = UUID.randomUUID().toString();
      this.edad = new Random().nextInt(100);
    }
    
    public String toString(){
        return "ID : " + id + " Edad " + edad;
    }
}
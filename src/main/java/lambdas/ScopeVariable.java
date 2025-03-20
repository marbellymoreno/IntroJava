/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 *
 * @author marbellymoreno
 */
public class ScopeVariable {
    public static void main(String[] args){
        AtomicInteger num = new AtomicInteger(10);
        
        IntStream.range(1, 10).forEach ( i -> num.set(num.get() +1) );
        System.out.print(num.get());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

/**
 *
 * @author marbellymoreno
 */
public interface InterfaceBD1<T>{
    
    T getAll();
    T getById(int id);
    T insert(String objeto );
    T Update (String objeto);
    T delete (String objeto);
    
}

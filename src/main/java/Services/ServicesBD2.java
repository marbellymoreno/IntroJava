/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

/**
 *
 * @author marbellymoreno
 */
public interface ServicesBD2 {
    
    String getAll();
    String getById(int id);
    String insert(String objeto );
    String Update (String objeto);
    String delete (String objeto);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author marbellymoreno
 */
public class Modelo2 {
    
    private String Empresa;
    private String Marca;

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
        @Override
    public String toString() {
        return "Modelo2{" + "Empresa=" + Empresa + ", Marca=" + Marca + '}';
    }
}

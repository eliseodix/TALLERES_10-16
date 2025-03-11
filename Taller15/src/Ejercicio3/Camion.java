/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Lenovo
 */
public class Camion implements Conduce, Carga{

    @Override
    public void conducir() {
        System.out.println("EL CAMIONERO CONDUCE HACIA OTRA CIUDAD");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Y CARGA MERCANCIA PARA VENDER");
    }
    
    
    
    
}

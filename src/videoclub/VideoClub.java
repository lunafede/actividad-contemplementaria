/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import Objetos.Cliente;

/**
 *
 * @author luna fede
 */
public class VideoClub {
    
   


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Cliente cliente;
        cliente = new Cliente();
        
        cliente.setNombre("Hugo");
        cliente.setApellido("Chanampe");
        cliente.setDni(Integer.parseInt("33694112") );
        cliente.setDomicilio("centro");
        cliente.setTelefono(Integer.parseInt("553298"));
        
        System.out.println("Clientes:");
        
        System.out.println("nombre = "+cliente.getNombre());
        System.out.println("apellido = "+cliente.getApellido());
        System.out.println("Dni = "+cliente.getDni());
        System.out.println("Domicilio = "+cliente.getDomicilio());
       System.out.println("Telefono = "+cliente.getTelefono());
    
}
}

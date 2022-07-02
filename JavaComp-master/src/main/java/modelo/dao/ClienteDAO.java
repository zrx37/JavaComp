/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;


import PL2_clases.Cliente;
import java.util.List;
import java.util.ArrayList;
        
/**
 *
 * @author Alejandro
 */
public class ClienteDAO {
    private List<Cliente> clientes;

    public ClienteDAO() {
        clientes = new ArrayList<>();
        
    }
    public int buscar(String cliente){
        int n=-1;
        for (int i = 0; i < clientes.size(); i++){
            if (clientes.get(i).getCliente().equals(cliente)) {
                n=i;
                break;
            }
        }
        return n; 
    }
        
    
    public boolean insertar(Cliente cliente){
        if (buscar(cliente.getCliente()) == -1 ) {
            clientes.add(cliente);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean modificar(Cliente cliente){
        if (buscar(cliente.getCliente()) != -1 ) {
            Cliente clienteaux = obtener(cliente.getCliente());
            
            clienteaux.setClave(cliente.getClave());
            clienteaux.setDNI(cliente.getDNI());
            clienteaux.setNombre(cliente.getNombre());
            clienteaux.setCorreo(cliente.getCorreo());
            clienteaux.setTarjetaCredito(cliente.getTarjetaCredito());
            clienteaux.setTelefono(cliente.getTelefono());
            clienteaux.setNumero(cliente.getNumero());
            clienteaux.setCodigoPostal(cliente.getCodigoPostal());
            clienteaux.setCalle(cliente.getCalle());
            clienteaux.setCiudad(cliente.getCiudad());
            
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eliminar(String cliente){
        if (buscar(cliente) != -1 ) {
            
            clientes.remove(buscar(cliente));
            
            return true;
        }else{
            return false;   
        }    
    }
    
    public Cliente obtener(String cliente){
        if (buscar(cliente) != -1) {
            return clientes.get(buscar(cliente));
        }else {
            return null;
        }
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;


import PL2_clases.Administrador;
import java.util.List;
import java.util.ArrayList;
        
/**
 *
 * @author Alejandro
 */
public class AdministradorDAO {
    private List<Administrador> administradores;

    public AdministradorDAO() {
        administradores = new ArrayList<>();
        Administrador admin = new Administrador();
		admin.setAdministrador("Admin");
		admin.setClave("1234");
                administradores.add(admin);
    }
    public int buscar(String administrador){
        int n=-1;
        for (int i = 0; i < administradores.size(); i++){
            if (administradores.get(i).getAdministrador().equals(administrador)) {
                n=i;
                break;
            }
        }
        return n; 
    }
        
    
    public boolean insertar(Administrador administrador){
        if (buscar(administrador.getAdministrador()) == -1 ) {
            administradores.add(administrador);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean modificar(Administrador administrador){
        if (buscar(administrador.getAdministrador()) != -1 ) {
            Administrador administradoraux = obtener(administrador.getAdministrador());
            
            administradoraux.setAdministrador(administrador.getClave());
            administradoraux.setClave(administrador.getClave());
            
            
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eliminar(String administrador){
        if (buscar(administrador) != -1 ) {
            
            administradores.remove(buscar(administrador));
            
            return true;
        }else{
            return false;   
        }    
    }
    
    public Administrador obtener(String administrador){
        if (buscar(administrador) != -1) {
            return administradores.get(buscar(administrador));
        }else {
            return null;
        }
    }

    
    
}


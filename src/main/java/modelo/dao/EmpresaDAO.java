/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import PL2_clases.Empresa;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class EmpresaDAO {
    private List<Empresa> empresas;

    public EmpresaDAO() {
        empresas = new ArrayList<>();
        
    }
    public int  buscar(String empresa){
        int n=-1;
        for (int i = 0; i < empresas.size(); i++){
            if (empresas.get(i).getEmpresa().equals(empresa)) {
                n=i;
                break;
            }
        }
        return n; 
    }
        
    
    public boolean insertar(Empresa empresa){
        if (buscar(empresa.getEmpresa()) == -1 ) {
            empresas.add(empresa);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean modificar(Empresa empresa){
        if (buscar(empresa.getEmpresa()) != -1 ) {
            Empresa empresaaux = obtener(empresa.getEmpresa());
            
            empresaaux.setCIF(empresa.getCIF());
            empresaaux.setNombre(empresa.getNombre());
            empresaaux.setTelefono(empresa.getTelefono());
            empresaaux.setTarjetaCredito(empresa.getTarjetaCredito());
            empresaaux.setCorreo(empresa.getCorreo());
            empresaaux.setClave(empresa.getClave());
            empresaaux.setWeb(empresa.getWeb());
            empresaaux.setNumero(empresa.getNumero());
            empresaaux.setCodigoPostal(empresa.getCodigoPostal());
            empresaaux.setCalle(empresa.getCalle());
            empresaaux.setCiudad(empresa.getCiudad());
            
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eliminar(String empresa){
        if (buscar(empresa) != -1 ) {
            
            empresas.remove(buscar(empresa));
            
            return true;
        }else{
            return false;   
        }    
    }
    
    public Empresa obtener(String empresa){
        if (buscar(empresa) != -1) {
            return empresas.get(buscar(empresa));
        }else {
            return null;
        }
    }

}

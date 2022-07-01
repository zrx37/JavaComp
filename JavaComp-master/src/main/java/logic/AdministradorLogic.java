/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import PL2_clases.Administrador;
import modelo.dao.AdministradorDAO;

/**
 *
 * @author Víctor Zurita
 */
public class AdministradorLogic {
    private static AdministradorDAO administradorDAO = new AdministradorDAO();

    public static boolean autentificar(String administrador, String clave){
        if (obtener(administrador) != null){
            Administrador administradorConsulta=obtener(administrador);
            return administradorConsulta.getAdministrador().equals(administrador)&&administradorConsulta.getClave().equals(clave);
        }else{
            return false;
        }
    }

    public static boolean insertar(Administrador administrador){
       return administradorDAO.insertar(administrador);
    }

    public static boolean modificar(Administrador administrador){
        return administradorDAO.modificar(administrador);
    }

    public static boolean eliminar(String administrador){
       return administradorDAO.eliminar(administrador);
    }

    public static Administrador obtener (String administrador){
       return administradorDAO.obtener(administrador);
    }

}

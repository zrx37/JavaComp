/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Víctor Zurita
 */
import PL2_clases.Cliente;
import modelo.dao.ClienteDAO;


public class ClienteLogic {
    private static ClienteDAO clienteDAO = new ClienteDAO();

    public static boolean autentificar(String cliente, String clave){
        if (obtener(cliente) != null){
            Cliente clienteConsulta=obtener(cliente);
            return clienteConsulta.getCliente().equals(cliente)&&clienteConsulta.getClave().equals(clave);
        }else{
            return false;
        }
    }

    public static boolean insertar(Cliente cliente){
       return clienteDAO.insertar(cliente);
    }

    public static boolean modificar(Cliente cliente){
        return clienteDAO.modificar(cliente);
    }

    public static boolean eliminar(String cliente){
       return clienteDAO.eliminar(cliente);
    }

    public static Cliente obtener (String cliente){
       return clienteDAO.obtener(cliente);
    }

}

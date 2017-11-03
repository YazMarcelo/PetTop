/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.ClienteDAO;
import persistencia.EspecieDAO;
import util.Mensagem;

/**
 *
 * @author HELM
 */
public class NCliente {
    Mensagem msg = new Mensagem();
    
    ClienteDAO dao;
    
    public NCliente() {
        dao = new ClienteDAO();
    }

    public void salvar(Cliente clie) throws SQLException, Exception {

        if (obrigatoriosPreenchidos(clie)) {
            if (clie.getCodigo() == 0) {

                dao.incluir(clie);

                msg.msg01();
            } else {
                if ((msg.msg02()) == JOptionPane.YES_OPTION) {
                    
                    dao.alterar(clie);
                    
                    msg.msg04();
                }
            }
        } else {
            msg.msg11();
        }

    }
    
    public void excluir(String codigo) throws SQLException, Exception {
        dao.excluir(codigo);
    }
    
    public Cliente consultar(String codigo) throws SQLException, Exception {
        return (Cliente) dao.consultar(codigo);
    }
    
    public ArrayList<Object> listar() throws SQLException, Exception {
        return dao.listar();
    }
    
    public boolean obrigatoriosPreenchidos(Cliente clie) {
        if (clie.getNome().equals("")) 
            return false;
        if(clie.getCpf().equals("   .   .   -  "))
            return false;
        
        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.Servico;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.ServicoDAO;
import util.Mensagem;

/**
 *
 * @author aluno
 */
public class NServico {
    ServicoDAO dao;
    Mensagem msg = new Mensagem();

    public NServico() {
        dao = new ServicoDAO();
    }

    public void salvar(Servico serv) throws SQLException, Exception {

        if (obrigatoriosPreenchidos(serv)) {
            if (serv.getCodigo() == 0) {

                dao.incluir(serv);

                msg.msg01();
            } else {
                if ((msg.msg02()) == JOptionPane.YES_OPTION) {
                    
                    dao.alterar(serv);
                    
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

    public Servico consultar(String codigo) throws SQLException, Exception {
        return (Servico) dao.consultar(codigo);
    }

    public ArrayList<Object> listar() throws SQLException, Exception {
        return dao.listar();
    }

    public boolean obrigatoriosPreenchidos(Servico servico) {
        if (servico.getDescricao().equals("")) {
            return false;
        }
        if (servico.getValor() < 1) {
            return false;
        }

        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.Especie;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.EspecieDAO;
import util.Mensagem;

/**
 *
 * @author aluno
 */
public class NEspecie {

    EspecieDAO dao;
    Mensagem msg = new Mensagem();

    public NEspecie() {
        dao = new EspecieDAO();
    }

    public void salvar(Especie espe) throws SQLException, Exception {

        if (obrigatoriosPreenchidos(espe)) {
            if (espe.getCodigo() == 0) {

                dao.incluir(espe);

                msg.msg01();
            } else {
                if ((msg.msg02()) == JOptionPane.YES_OPTION) {
                    
                    dao.alterar(espe);
                    
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

    public Especie consultar(String codigo) throws SQLException, Exception {
        return (Especie) dao.consultar(codigo);
    }

    public ArrayList<Object> listar(int codigo) throws SQLException, Exception {
        return dao.listar();
    }

    public boolean obrigatoriosPreenchidos(Especie especie) {
        if (especie.getDescricao().equals("")) {
            return false;
        }

        return true;
    }
}

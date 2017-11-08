/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.Animal;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.AnimalDAO;
import util.Mensagem;

/**
 *
 * @author aluno
 */
public class NAnimal {

    AnimalDAO dao;
    Mensagem msg = new Mensagem();

    public NAnimal() {
        dao = new AnimalDAO();
    }

    public void salvar(Animal anim) throws SQLException, Exception {

        if (obrigatoriosPreenchidos(anim)) {
            if (anim.getCodigo() == 0) {

                dao.incluir(anim);

                msg.msg01();
            } else {
                if ((msg.msg02()) == JOptionPane.YES_OPTION) {

                    dao.alterar(anim);

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

    public Animal consultar(String codigo) throws SQLException, Exception {
        return (Animal) dao.consultar(codigo);
    }

    public ArrayList<Object> listar() throws SQLException, Exception {
        return dao.listar();
    }

    public ArrayList<Object> listarPorCliente(String idCliente) throws SQLException, Exception {
        return dao.listarPorCliente(idCliente);
    }

    public boolean obrigatoriosPreenchidos(Animal anim) {
        if (anim.getNome().equals("")) {
            return false;
        }

        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.ProdutoDAO;
import util.Mensagem;

/**
 *
 * @author aluno
 */
public class NProduto {
    
    ProdutoDAO dao;
    Mensagem msg = new Mensagem();

    public NProduto() {
        dao = new ProdutoDAO();
    }

    public void salvar(Produto prod) throws SQLException, Exception {

        if (obrigatoriosPreenchidos(prod)) {
            if (prod.getCodigo() == 0) {

                dao.incluir(prod);

                msg.msg01();
            } else {
                if ((msg.msg02()) == JOptionPane.YES_OPTION) {
                    
                    dao.alterar(prod);
                    
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

    public Produto consultar(String codigo) throws SQLException, Exception {
        return (Produto) dao.consultar(codigo);
    }

    public ArrayList<Object> listar() throws SQLException, Exception {
        return dao.listar();
    }

    public boolean obrigatoriosPreenchidos(Produto produto) {
        if (produto.getDescricao().equals("")) {
            return false;
        }

        return true;
    }
    
}

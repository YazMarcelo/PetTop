/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Produto;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ProdutoDAO implements CRUD {

    @Override
    public void incluir(Object objeto) throws Exception {
        Produto objProduto = (Produto) (objeto);

        String sql = "insert into produto (prod_descricao, prod_valor, prod_quantidade) VALUES (?, ?, ?);";

        Connection cnn = util.Conexao.getConexao();

        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setString(1, objProduto.getDescricao());
        prd.setString(2, String.valueOf(objProduto.getValor()));
        prd.setString(3, String.valueOf(objProduto.getSaldoEstoque()));
        //Executa o comando no banco de dados
        prd.execute();

        //cria o sql para recuperar o codigo gerado
        String sql2 = "select currval('produto_prod_id_seq') as prod_id";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql2);

        if (rs.next()) {
            int codigo = rs.getInt("prod_id");
            objProduto.setCodigo(codigo);
        }

        rs.close();
        cnn.close();
    }

    @Override
    public void excluir(String id) throws Exception {
        String sql = "delete from produto where prod_id = ?;";

        Connection cnn = util.Conexao.getConexao();

        //Cria o procedimento armazenado a partir da conexão
        //e string sql
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, Integer.parseInt(id));

        prd.execute();

        prd.close();
        cnn.close();
    }

    @Override
    public void alterar(Object objeto) throws Exception {
        Produto objProduto = (Produto) (objeto);

        //Cria a instrução SQL para a inserção no banco
        String sql = "update produto set prod_descricao = ?, "
                + "prod_valor = ?, "
                + "prod_quantidade = ?;";

        Connection cnn = util.Conexao.getConexao();

        //Cria o procedimento armazenado a partir da conexão
        //e string sql
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setString(1, objProduto.getDescricao());
        prd.setString(2, String.valueOf(objProduto.getValor()));
        prd.setString(3, String.valueOf(objProduto.getSaldoEstoque()));

        prd.execute();

        prd.close();
        cnn.close();
    }

    @Override
    public Object consultar(String id) throws Exception {
        String sql = "select * from produto where prod_id = ?;";

        Connection cnn = util.Conexao.getConexao();

        //Cria o procedimento armazenado a partir da conexão
        //e string sql
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setInt(1, Integer.parseInt(id));

        ResultSet rs = prd.executeQuery();

        Produto objeto = new Produto();

        if (rs.next()) {
            objeto.setCodigo(rs.getInt("prod_id"));
            objeto.setDescricao(rs.getString("prod_descricao"));
            objeto.setValor((rs.getDouble("prod_quantidade")));
            objeto.setSaldoEstoque(rs.getInt("prod_valor"));
        }

        prd.execute();

        prd.close();
        cnn.close();

        return objeto;
    }

    @Override
    public ArrayList<Object> listar() throws Exception {
        ArrayList<Object> listaProduto = new ArrayList<>();

        String sql = "select * from produto order by produto_id";

        Connection cnn = util.Conexao.getConexao();
        Statement stm = cnn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        Produto objeto;

        while (rs.next()) {
            objeto = new Produto();
            objeto.setCodigo(rs.getInt("prod_id"));
            objeto.setDescricao(rs.getString("prod_descricao"));
            objeto.setValor(rs.getDouble("prod_valor"));
            objeto.setSaldoEstoque(rs.getInt("prod_quantidade"));

            listaProduto.add(objeto);
        }

        rs.close();
        cnn.close();

        return listaProduto;

    }

}

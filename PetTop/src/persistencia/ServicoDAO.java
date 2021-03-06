/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Especie;
import entidade.Servico;
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
public class ServicoDAO implements CRUD{

    
    @Override
     public void incluir(Object objeto) throws Exception {
        Servico objServico = (Servico)(objeto);
        
        String sql = "insert into servico (serv_descricao, serv_valor) VALUES (?,?);";

        Connection cnn = util.Conexao.getConexao();

        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setString(1, objServico.getDescricao());
        prd.setDouble(2, objServico.getValor());


        //Executa o comando no banco de dados
        prd.execute();

        //cria o sql para recuperar o codigo gerado
        String sql2 = "select currval('servico_serv_id_seq') as serv_id";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql2);

        if (rs.next()) {
            int codigo = rs.getInt("serv_id");
            objServico.setCodigo(codigo);
        }

        rs.close();
        cnn.close();
    }

    @Override
    public void excluir(String id) throws Exception {
        //Cria a instrução SQL para a inserção no banco
        String sql = "delete from servico where serv_id = ?;";

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
        
        Servico objServ =  (Servico) (objeto);
        
        //Cria a instrução SQL para a inserção no banco
        String sql = "update servico set serv_descricao = ?, serv_valor = ? where serv_id = ?;";

        Connection cnn = util.Conexao.getConexao();

        //Cria o procedimento armazenado a partir da conexão
        //e string sql
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setString(1, objServ.getDescricao());
        prd.setDouble(2, objServ.getValor());
        prd.setInt(3, objServ.getCodigo());

        prd.execute();

        prd.close();
        cnn.close(); 
    }

    @Override
    public ArrayList<Object> listar() throws Exception {
        
        ArrayList<Object> listarServico = new ArrayList<>();

        String sql = "select * from servico order by serv_id";

        Connection cnn = util.Conexao.getConexao();
        Statement stm = cnn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        Servico objeto;

        while (rs.next()) {
            objeto = new Servico();
            objeto.setCodigo(rs.getInt("serv_id"));
            objeto.setDescricao(rs.getString("serv_descricao"));
            objeto.setValor(rs.getDouble("serv_valor"));
            listarServico.add(objeto);
        }

        rs.close();
        cnn.close();

        return listarServico;
    }

    @Override
    public Object consultar(String id) throws Exception {
        String sql = "select * from servico where serv_id = ?;";

        Connection cnn = util.Conexao.getConexao();

        //Cria o procedimento armazenado a partir da conexão
        //e string sql
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setInt(1, Integer.parseInt(id));

        ResultSet rs = prd.executeQuery();

        Servico objeto = new Servico();

        if (rs.next()) {
            objeto.setCodigo(rs.getInt("serv_id"));
            objeto.setDescricao(rs.getString("serv_descricao"));
            objeto.setValor(rs.getDouble("serv_valor"));
        }

        prd.execute();

        prd.close();
        cnn.close();

        return objeto;
    }
    
}

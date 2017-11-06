/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Cliente;
import entidade.Especie;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HELM
 */
public class ClienteDAO implements CRUD{

    @Override
    public void incluir(Object objeto) throws Exception {
        Cliente objCliente = (Cliente)(objeto);
        
        String sql = "insert into cliente (clie_nome, clie_rg, clie_cpf, clie_data_nascimento,"
                + " clie_telefone, clie_bairro, clie_cep, clie_logradouro, clie_numero, clie_complemento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        Connection cnn = util.Conexao.getConexao();

        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setString(1, objCliente.getNome());
        prd.setString(2, objCliente.getRg());
        prd.setString(3, objCliente.getCpf());
        prd.setDate(4, objCliente.getDataNascimento());
        prd.setString(5, objCliente.getTelefone());
        prd.setString(6, objCliente.getBairro());
        prd.setString(7, objCliente.getCep());
        prd.setString(8, objCliente.getLogradouro());
        prd.setString(9, objCliente.getNumero());
        prd.setString(10, objCliente.getComplemento());


        //Executa o comando no banco de dados
        prd.execute();

        //cria o sql para recuperar o codigo gerado
        String sql2 = "select currval('cliente_clie_id_seq') as clie_id";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql2);

        if (rs.next()) {
            int codigo = rs.getInt("clie_id");
            objCliente.setCodigo(codigo);
        }

        rs.close();
        cnn.close();
    }

    @Override
    public void excluir(String id) throws Exception {
       String sql = "delete from cliente where clie_id = ?;";

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
        Cliente objCliente =  (Cliente) (objeto);
        
        //Cria a instrução SQL para a inserção no banco
        String sql = "update cliente set clie_nome = ?, "
                + "clie_rg = ?, "
                + "clie_cpf = ?, "
                + "clie_data_nascimento = ?, "
                + "clie_telefone = ?, "
                + "clie_bairro = ?, "
                + "clie_cep = ?, "
                + "clie_logradouro = ?, "
                + "clie_numero = ?, "
                + "clie_complemento = ? "
                + " where clie_id = ?;";

        Connection cnn = util.Conexao.getConexao();

        //Cria o procedimento armazenado a partir da conexão
        //e string sql
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setString(1, objCliente.getNome());
        prd.setString(2, objCliente.getRg());
        prd.setString(3, objCliente.getCpf());
        prd.setDate(4, objCliente.getDataNascimento());
        prd.setString(5, objCliente.getTelefone());
        prd.setString(6, objCliente.getBairro());
        prd.setString(7, objCliente.getCep());
        prd.setString(8, objCliente.getLogradouro());
        prd.setString(9, objCliente.getNumero());
        prd.setString(10, objCliente.getComplemento());
        prd.setInt(11, objCliente.getCodigo());

        prd.execute();

        prd.close();
        cnn.close(); 
    }

    @Override
    public Object consultar(String id) throws Exception {
        String sql = "select * from cliente where clie_id = ?;";

        Connection cnn = util.Conexao.getConexao();

        //Cria o procedimento armazenado a partir da conexão
        //e string sql
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setInt(1, Integer.parseInt(id));

        ResultSet rs = prd.executeQuery();

        Cliente objeto = new Cliente();

        if (rs.next()) {
            objeto.setCodigo(rs.getInt("clie_id"));
            objeto.setNome(rs.getString("clie_nome"));
            objeto.setRg(rs.getString("clie_rg"));
            objeto.setCpf(rs.getString("clie_cpf"));
            objeto.setDataNascimento(rs.getDate("clie_data_nascimento"));
            objeto.setTelefone(rs.getString("clie_telefone"));
            objeto.setBairro(rs.getString("clie_bairro"));
            objeto.setLogradouro(rs.getString("clie_logradouro"));
            objeto.setNumero(rs.getString("clie_numero"));
            objeto.setComplemento(rs.getString("clie_complemento"));
            objeto.setCep(rs.getString("clie_cep"));
        }

        prd.execute();

        prd.close();
        cnn.close();

        return objeto;
    }

    @Override
    public ArrayList<Object> listar() throws Exception {
       ArrayList<Object> listaEspecie = new ArrayList<>();

        String sql = "select * from cliente order by clie_id";

        Connection cnn = util.Conexao.getConexao();
        Statement stm = cnn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        Cliente objeto;

        while (rs.next()) {
            objeto = new Cliente();
            objeto.setCodigo(rs.getInt("clie_id"));
            objeto.setNome(rs.getString("clie_nome"));
            objeto.setRg(rs.getString("clie_rg"));
            objeto.setCpf(rs.getString("clie_cpf"));
            objeto.setDataNascimento(rs.getDate("clie_data_nascimento"));
            objeto.setTelefone(rs.getString("clie_telefone"));
            objeto.setBairro(rs.getString("clie_bairro"));
            objeto.setCep(rs.getString("clie_cep"));
            objeto.setLogradouro(rs.getString("clie_logradouro"));
            objeto.setNumero(rs.getString("clie_numero"));
            objeto.setComplemento(rs.getString("clie_complemento"));
            
            listaEspecie.add(objeto);
        }

        rs.close();
        cnn.close();

        return listaEspecie;
    }
    
}

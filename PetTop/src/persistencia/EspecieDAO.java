/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Especie;
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
public class EspecieDAO implements CRUD{

    @Override
    public void incluir(Object objeto) throws Exception {
        Especie objEspecie = (Especie)(objeto);
        
        String sql = "insert into especie (espe_descricao) VALUES (?);";

        Connection cnn = util.Conexao.getConexao();

        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setString(1, objEspecie.getDescricao());


        //Executa o comando no banco de dados
        prd.execute();

        //cria o sql para recuperar o codigo gerado
        String sql2 = "select currval('especie_espe_id_seq') as espe_id";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql2);

        if (rs.next()) {
            int codigo = rs.getInt("espe_id");
            objEspecie.setCodigo(codigo);
        }

        rs.close();
        cnn.close();
    }

    @Override
    public void excluir(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Object objeto, String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> listar() throws Exception {
        
        ArrayList<Object> listaEspecie = new ArrayList<>();

        String sql = "select * from especie order by espe_id";

        Connection cnn = util.Conexao.getConexao();
        Statement stm = cnn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        Especie objeto;

        while (rs.next()) {
            objeto = new Especie();
            objeto.setCodigo(rs.getInt("espe_id"));
            objeto.setDescricao(rs.getString("espe_descricao"));
            listaEspecie.add(objeto);
        }

        rs.close();
        cnn.close();

        return listaEspecie;
    }
    
}

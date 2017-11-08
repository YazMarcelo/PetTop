/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Animal;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import negocio.NCliente;
import negocio.NEspecie;

/**
 *
 * @author Thaina
 */
public class AnimalDAO implements CRUD {//aqui dava arro pois pedia pra implementar todos os metodos abstratos

    @Override
    public void incluir(Object objeto) throws Exception {
        Animal objAnimal = (Animal) (objeto);
        
        //os atributos do sql tem que ser na mesma ordem dos set que voce passou
        //por exemplo o primeiro atributo aqui deveria ser o rga(anim_rga)
        String sql = "insert into animal (anim_nome, anim_rga, anim_raca,"
                + " anim_porte_animal, anim_clie_id, anim_espe_id) VALUES (?, ?, ?, ?, ?, ?);";

        Connection cnn = util.Conexao.getConexao();

        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        
        prd.setString(1, objAnimal.getNome());//<--
        prd.setString(2, objAnimal.getRga());
        prd.setString(3, objAnimal.getRaca());
        prd.setString(4, objAnimal.getPorteDoAnimal());
        prd.setInt(5, objAnimal.getCliente().getCodigo());
        prd.setInt(6, objAnimal.getEspecie().getCodigo());

        prd.execute();
        
                //cria o sql para recuperar o codigo gerado
        String sql2 = "select currval('animal_anim_id_seq') as anim_id";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql2);

        if (rs.next()) {
            int codigo = rs.getInt("anim_id");
            objAnimal.setCodigo(codigo);
        }

        rs.close();
        cnn.close();

    }//<--

    @Override//aqui dava erro pois faltava fechar o metodo acima
    public void alterar(Object objeto) throws Exception {
        Animal objAnimal = (Animal) (objeto);

        //Cria a instrução SQL para a inserção no banco
        String sql ="update animal set "
                + "anim_nome = ?, "
                + "anim_rga = ?, "
                + "anim_raca = ?, "
                + "anim_porte_animal = ?, "
                + "anim_espe_id = ?, "
                + "anim_clie_id = ? "
                + " where anim_id = ?;";

        Connection cnn = util.Conexao.getConexao();

        //Cria o procedimento armazenado a partir da conexão
        //e string sql
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setString(1, objAnimal.getNome());
        prd.setString(2, objAnimal.getRga());
        prd.setString(3, objAnimal.getRaca());
        prd.setString(4, objAnimal.getPorteDoAnimal());
        prd.setInt(5, objAnimal.getEspecie().getCodigo());
        prd.setInt(6, objAnimal.getCliente().getCodigo());
        prd.setInt(7, objAnimal.getCodigo());
               

        prd.execute();

        prd.close();
        cnn.close();
    }

    @Override
    public void excluir(String id) throws Exception {
    
    //Cria a instrução SQL para a inserção no banco
        String sql = "delete from animal where anim_id = ?;";

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
    public Object consultar(String id) throws Exception {

        String sql = "select * from animal where anim_id = ?;";

        Connection cnn = util.Conexao.getConexao();

        //Cria o procedimento armazenado a partir da conexão
        //e string sql
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores para o procedimento
        prd.setInt(1, Integer.parseInt(id));

        ResultSet rs = prd.executeQuery();

        Animal objeto = new Animal();

        if (rs.next()) {
            objeto.setCodigo(rs.getInt("anim_id"));
            objeto.setNome(rs.getString("anim_nome"));
            objeto.setRga(rs.getString("anim_rga"));
            objeto.setRaca(rs.getString("anim_raca"));
            objeto.setPorteDoAnimal(rs.getString("anim_porte_animal"));
            objeto.setCliente(new NCliente().consultar(String.valueOf(rs.getInt("anim_clie_id"))));
            objeto.setEspecie(new NEspecie().consultar(String.valueOf(rs.getInt("anim_espe_id"))));

        }

        prd.execute();

        prd.close();
        cnn.close();

        return objeto;    
}

   @Override
    public ArrayList<Object> listar() throws Exception {
        
        ArrayList<Object> listaEspecie = new ArrayList<>();

        String sql = "select * from animal order by anim_id";

        Connection cnn = util.Conexao.getConexao();
        Statement stm = cnn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        Animal objeto;

        while (rs.next()) {
            objeto = new Animal();
            objeto.setCodigo(rs.getInt("anim_id"));
            objeto.setNome(rs.getString("anim_nome"));
            objeto.setRga(rs.getString("anim_rga"));
            objeto.setRaca(rs.getString("anim_raca"));
            objeto.setPorteDoAnimal(rs.getString("anim_porte_animal"));
            objeto.setCliente(new NCliente().consultar(String.valueOf(rs.getInt("anim_clie_id"))));
            objeto.setEspecie(new NEspecie().consultar(String.valueOf(rs.getInt("anim_espe_id"))));
            listaEspecie.add(objeto);
        }

        rs.close();
        cnn.close();

        return listaEspecie;
    }
    
    public ArrayList<Object> listarPorCliente(String idCliente) throws Exception {
        ArrayList<Object> listaAnimal = new ArrayList<>();
        
        String sql = "select * from animal where anim_clie_id = "+idCliente+" order by anim_id;";

        Connection cnn = util.Conexao.getConexao();
        Statement stm = cnn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        
        Animal objeto;

        while (rs.next()) {
        objeto = new Animal();
            objeto.setCodigo(rs.getInt("anim_id"));
            objeto.setNome(rs.getString("anim_nome"));
            objeto.setRga(rs.getString("anim_rga"));
            objeto.setRaca(rs.getString("anim_raca"));
            objeto.setPorteDoAnimal(rs.getString("anim_porte_animal"));
            objeto.setCliente(new NCliente().consultar(String.valueOf(rs.getInt("anim_clie_id"))));
            objeto.setEspecie(new NEspecie().consultar(String.valueOf(rs.getInt("anim_espe_id"))));
            listaAnimal.add(objeto);
        }


        rs.close();
        cnn.close();

        return listaAnimal;  
        
    }
}

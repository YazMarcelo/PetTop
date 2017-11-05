/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Thaina
 */
public class Animal {
    private int codigo = 0;
    private String rga = "";
    private String nome = "";
    private String raca = "";
    private String porteDoAnimal = "";
    private Cliente cliente = null;
    private Especie especie = null;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the rga
     */
    public String getRga() {
        return rga;
    }

    /**
     * @param rga the rga to set
     */
    public void setRga(String rga) {
        this.rga = rga;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the porteDoAnimal
     */
    public String getPorteDoAnimal() {
        return porteDoAnimal;
    }

    /**
     * @param porteDoAnimal the porteDoAnimal to set
     */
    public void setPorteDoAnimal(String porteDoAnimal) {
        this.porteDoAnimal = porteDoAnimal;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the especie
     */
    public Especie getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
    
    
    
    
}

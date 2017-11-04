/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author aluno
 */
public class Produto {
    
    private int codigo;
    private String descricao;
    private double valor;
    private int saldoEstoque;

    public Produto(int codigo, String descricao, double valor, int saldoEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.saldoEstoque = saldoEstoque;
    }


    public Produto() {
       
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getSaldoEstoque() {
        return saldoEstoque;
    }

    public void setSaldoEstoque(int saldoEstoque) {
        this.saldoEstoque = saldoEstoque;
    } 

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + ", saldoEstoque=" + saldoEstoque + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.modelo.treino;

/**
 *
 * @author lucas
 */
public class Modalidades {

    //  Scanner b = new Scanner(System.in);
    private String nome;
    private String descricao;

    public Modalidades(String nome) {
        this.nome = nome;
    }

    public Modalidades(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Modalidades{" + "nome=" + nome + ", descricao=" + descricao + '}';
    }
}

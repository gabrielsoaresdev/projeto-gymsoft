/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.modelo.usuario;

import java.util.Date;

/**
 *
 * @author lucas
 */
public abstract class Pessoa {
    
    private String nome;
    private String cpf;
    private Date data_nascimento;
    private String telefone;

    public Pessoa(String nome, String cpf, Date data_nascimento, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", data_nascimento=" + data_nascimento + ", telefone=" + telefone + '}';
    }
    
}

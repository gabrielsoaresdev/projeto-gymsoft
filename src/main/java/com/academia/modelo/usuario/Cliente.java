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
public class Cliente extends Pessoa {
    
    private String matricula;
    private String altura;
    private String peso;
    
    public Cliente(String matricula, String altura, String peso, String nome, String cpf, Date data_nascimento, String telefone){
        super (nome, cpf, data_nascimento, telefone);
        this.matricula = matricula;
        this.altura = altura;
        this.peso = peso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Cliente{" + "matricula=" + matricula + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
    
}

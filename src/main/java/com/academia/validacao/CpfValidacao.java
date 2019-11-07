/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.validacao;

/**
 *
 * @author jytaloramon
 */
public class CpfValidacao {

    private final String cpf;

    public CpfValidacao(String cpf) {
        this.cpf = cpf;
    }

    public boolean check() {
        if (this.cpf == null) {
            return false;
        }

        return true;
    }

}

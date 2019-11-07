/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.servico.treino;

import com.academia.dao.treino.ModalidadesDAO;
import com.academia.dao.usuario.ClienteDAO;
import com.academia.modelo.treino.Modalidades;
import com.academia.modelo.usuario.Cliente;
import com.academia.validacao.CpfValidacao;
import java.sql.SQLException;
import javax.management.RuntimeErrorException;

/**
 *
 * @author jytaloramon
 */
public class ModalidadeServico {

    private ModalidadesDAO modalidadesDAO;

    public ModalidadeServico(ModalidadesDAO modalidadesDAO) {
        this.modalidadesDAO = modalidadesDAO;
    }

    public boolean salvar(Modalidades modalidades) throws Exception {
        if (modalidades == null) {
            throw new Exception("Modalidade não pode ser nulo");
        }

        //return getClienteDAO().adicionar(cliente);
        return true;
    }

   
}

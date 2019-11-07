/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.servico.usuario;

import com.academia.dao.usuario.ClienteDAO;
import com.academia.modelo.usuario.Cliente;
import com.academia.validacao.CpfValidacao;
import java.sql.SQLException;

/**
 *
 * @author jytaloramon
 */
public class ClienteServico {

    private ClienteDAO clienteDAO;

    public ClienteServico(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public boolean salvar(Cliente cliente) throws SQLException, Exception {
        if (cliente == null) {
            throw new RuntimeException("Cliente não pode ser nulo");
        }

        CpfValidacao cpfValidacao = new CpfValidacao(cliente.getCpf());
        if (!cpfValidacao.check()) {
            throw new Exception("CPF inválido");
        }

        //return getClienteDAO().adicionar(cliente);
        return true;
    }

    public ClienteDAO getClienteDAO() {
        return clienteDAO;
    }

    public void setClienteDAO(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
}

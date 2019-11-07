/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.dao.usuario;

import com.academia.modelo.usuario.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class ClienteDAO {

    private Connection conexao;

    public ClienteDAO(Connection conexa) {
        this.conexao = conexa;
    }

    public boolean adicionar(Cliente c) throws SQLException {
        String insercao = "insert into cliente (matricula, altura, peso, nome, cpf, data_nascimento, telefone) values (?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = conexao.prepareStatement(insercao);
        stmt.setString(1, c.getMatricula());
        stmt.setString(2, c.getAltura());
        stmt.setString(3, c.getPeso());
        stmt.setString(4, c.getNome());
        stmt.setString(5, c.getCpf());
        stmt.setDate(6, (Date) c.getData_nascimento());
        stmt.setString(7, c.getTelefone());
        
        return stmt.executeUpdate() > 0;
    }

    public ArrayList<Cliente> consultarCliente() {
        ArrayList<Cliente> cliente = new ArrayList<>();
        String consulta = "select * from cliente";
        try {
            PreparedStatement stmt = conexao.prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente(rs.getString("matrícula"), rs.getString("altura"), rs.getString("peso"), rs.getString("nome"), rs.getString("cpf"), rs.getDate("data_nascimento"), rs.getString("telefone"));
                cliente.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Erro na consulta dos dados: " + e);
        }
        return cliente;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.dependecia.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jytaloramon
 */
public class FabricaConexao {

    private final String URL = "jdbc:mysql://localhost:3306/projeto_ginsoft";
    private final String USER = "root";
    private final String SENHA = "mysql3306";
    private final Connection CONNECTION;

    public FabricaConexao() throws SQLException {
        this.CONNECTION = DriverManager.getConnection(URL, USER, SENHA);
    }

    public Connection getConnection() {
        return CONNECTION;
    }

}

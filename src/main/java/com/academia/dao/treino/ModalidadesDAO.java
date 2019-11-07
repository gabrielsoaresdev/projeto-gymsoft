/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.dao.treino;

import com.academia.modelo.treino.Modalidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class ModalidadesDAO {
    
    private Connection conexao = null;

    public ModalidadesDAO() {
        String url = "jdbc:mysql://localhost/projeto_ginsoft";
        String usuario = "root";
        String senha = "";

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao com o banco de dados realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o banco: " + e);
        }
    }
    
    public void adicionar(Modalidades m) {
        String insercao = "insert into modalide (nome, desc) values (?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = conexao.prepareStatement(insercao);
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getDescricao());
            stmt.execute();
            System.out.println("Modalidade cadastrada com sucesso.");

        } catch (SQLException e) {
            System.out.println("Erro na insercao dos dados: " + e);
            e.printStackTrace();
        }
    }        public ArrayList<Modalidades> consultarModalidade(){
        ArrayList<Modalidades> modalidade = new ArrayList<>();
        String consulta = "select * from modalidades";
        try{
            PreparedStatement stmt = conexao.prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Modalidades m = new Modalidades(rs.getString("nome"), rs.getString("descricao"));               modalidade.add(m);
                modalidade.add(m);
            }

        }catch(SQLException e){
            System.out.println("Erro na consulta dos dados: "+e);
        }
        return modalidade;
    }
}

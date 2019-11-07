/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.dao;

import com.academia.dependecia.bd.FabricaConexao;
import java.io.InputStream;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.ext.mysql.MySqlDataTypeFactory;
import org.dbunit.operation.DatabaseOperation;

/**
 *
 * @author jytaloramon
 */
public class DbUnit {

    private DatabaseConnection conexaoDBUnit;
    private String xmlFolder;

    public DbUnit(String xmlFolder) {
        this.xmlFolder = xmlFolder;

        try {
            conexaoDBUnit = new DatabaseConnection((new FabricaConexao()).getConnection());
            DatabaseConfig config = conexaoDBUnit.getConfig();
            config.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new MySqlDataTypeFactory());
        } catch (Exception e) {
            throw new RuntimeException("Erro inicializando DBUnit", e);
        }
    }

    public void execute(DatabaseOperation operation, String xml) {
        try {
            InputStream is = getClass().getResourceAsStream("/" + xmlFolder + "/" + xml);
            FlatXmlDataSetBuilder builder = new FlatXmlDataSetBuilder();
            IDataSet dataSet = builder.build(is);

            operation.execute(conexaoDBUnit, dataSet);
        } catch (Exception e) {
            throw new RuntimeException("Erro executando DbUnit", e);
        }
    }

}

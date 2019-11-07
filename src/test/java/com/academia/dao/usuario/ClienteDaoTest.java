/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.dao.usuario;

import com.academia.dao.DbUnit;
import com.academia.dependecia.bd.FabricaConexao;
import com.academia.modelo.usuario.Cliente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.sql.Date;
import java.sql.SQLException;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jytaloramon
 */
public class ClienteDaoTest {

    private static DbUnit dbUnit;
    private ClienteDAO clienteDAO;

    @BeforeClass
    public static void initClass() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws SQLException, DatabaseUnitException, MalformedURLException, FileNotFoundException {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void select() throws SQLException {
        ClienteDAO clienteDAO = new ClienteDAO((new FabricaConexao()).getConnection());
        assertEquals(clienteDAO.consultarCliente().size(), 0);
    }

    @Test
    public void insert1() throws SQLException {
        ClienteDAO clienteDAO = new ClienteDAO((new FabricaConexao()).getConnection());
        clienteDAO.adicionar(new Cliente("", "", "", "", "", new Date(2000, 01, 01), ""));
        
        assertEquals(clienteDAO.consultarCliente().size(), 1);
    }

    @Test
    public void insertN() throws FileNotFoundException, SQLException, DataSetException, DatabaseUnitException {
        IDataSet dataset = new FlatXmlDataSetBuilder().build(new FileInputStream("/home/jytaloramon/NetBeansProjects/Ginsoft/src/test/java/resources/Cliente.xml"));;
        DatabaseConnection database = new DatabaseConnection((new FabricaConexao()).getConnection());
        DatabaseOperation.CLEAN_INSERT.execute(database, dataset);
        
        ClienteDAO clienteDAO = new ClienteDAO((new FabricaConexao()).getConnection());
        assertEquals(clienteDAO.consultarCliente().size(), 7);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

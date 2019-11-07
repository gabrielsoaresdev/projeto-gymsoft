/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.servico.usuario;

import com.academia.modelo.usuario.Cliente;
import java.sql.SQLException;
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
public class ClienteServicoTest {
    
    public ClienteServicoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test(expected = RuntimeException.class)
    public void salvarNulo() throws SQLException, Exception {
        ClienteServico clienteServico = new ClienteServico(null);
        clienteServico.salvar(null);
    }
    
    @Test(expected = Exception.class)
    public void salvarCpfNulo() throws Exception {
        ClienteServico clienteServico = new ClienteServico(null);
        Cliente cliente = new Cliente(null, null, null, null, null, null, null);
        clienteServico.salvar(null);
    }
    
    @Test
    public void salvarValido() throws Exception {
        ClienteServico clienteServico = new ClienteServico(null);
        Cliente cliente = new Cliente(null, null, null, null, "33434", null, null);
        assertTrue(clienteServico.salvar(cliente));
    }
}

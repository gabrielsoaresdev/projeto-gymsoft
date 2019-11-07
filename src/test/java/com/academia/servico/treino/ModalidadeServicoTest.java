/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.servico.treino;

import com.academia.modelo.treino.Modalidades;
import javax.management.RuntimeErrorException;
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
public class ModalidadeServicoTest {
    
    public ModalidadeServicoTest() {
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
    @Test(expected = Exception.class)
    public void salvarNulo() throws Exception {
        ModalidadeServico modalidadeServico = new ModalidadeServico(null);
        modalidadeServico.salvar(null);
    }
    
    @Test
    public void salvarValido() throws Exception {
        ModalidadeServico modalidadeServico = new ModalidadeServico(null);
        
        Modalidades modalidades = new Modalidades("", "");
        
        assertTrue(modalidadeServico.salvar(modalidades));
    }
}

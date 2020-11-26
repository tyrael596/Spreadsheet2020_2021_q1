/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.archsoft.spreadsheet.server.chess.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class BishopTest {
    
    public BishopTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.print("Començem els testejos");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.print("Acabem els testejos");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        Bishop bis = new Bishop();
        bis.color=0;
        
    }

    @org.junit.Test
    public void testSomeMethod() {
        System.out.println("Test");
        Assert.assertEquals(0,this.instance.getColor);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

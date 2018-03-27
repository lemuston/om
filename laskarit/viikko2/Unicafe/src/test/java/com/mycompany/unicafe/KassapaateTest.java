/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unicafe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laura
 */
public class KassapaateTest {
    
    Kassapaate kassapaate;
    Maksukortti kortti;
    
    public KassapaateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        kassapaate = new Kassapaate();
        
        
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void lounaitaMyytyNolla() {
        assertEquals("kassassa rahaa 10000", kassapaate.toString());
    }
    
    @Test
    public void edullisenLounaaHintaKassaan() {
        kassapaate.syoEdullisesti(250);
        assertEquals("kassassa rahaa 10250", kassapaate.toString());
    }
    
    @Test
    public void maukkaanLounaanHintaKassaan() {
        kassapaate.syoMaukkaasti(400);
        assertEquals("kassassa rahaa 10400", kassapaate.toString());
    }
    
    @Test
    public void maukkaanLounaanMyyntiKasvattaaMyyntimaaraa() {
        kassapaate.syoMaukkaasti(400);
        kassapaate.maukkaitaLounaitaMyyty();
    }
    
    
    }


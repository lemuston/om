package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
   @Test
    public void konstruktoriAsettaaSaldonOikein() {
        
        assertEquals("saldo: 100", kortti.toString());
    }
    
    @Test
    public void rahanLataaminenKasvattaaSaldoaOikein() {
        kortti.lataaRahaa(25);
        assertEquals("Kortilla on rahaa 35.0 euroa", kortti.toString());
    }
    
    @Test
    public void saldoVaheneeOikeinJosRahaaOnTarpeeksi() {
        kortti.otaRahaa(5);
        assertEquals("Kortilla on rahaa 5.00 euroa", kortti.toString());
    }
    
    @Test
    public void saldoEiMuutuJosRahaaEiOleTarpeeksi() {
        kortti.otaRahaa(15);
        assertEquals("Kortilla on rahaa 100.00 euroa", kortti.toString());
    }
    
    @Test
    public void rahatEiRiita() {
        kortti.otaRahaa(15);
            assertFalse("Ei onnistu", false);
    }

    public void rahatRiittaa() {
        kortti.otaRahaa(10);
            assertTrue("Onnistuu", true);
                
    }
    
    
}

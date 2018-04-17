/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubivisaUi;

import pubivisa.domain.Question;
import pubivisa.dao.QuestionDao;

/**
 *
 * @author laura
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Question eka = new Question("mikä on Angolan pääkaupunki?", "Luanda");
        Question toka = new Question("mikä on maailman korkein rakennus?", "Burj Khalifa");
        eka.getContent();
        eka.getAnswer();
        
        toka.getContent();
        toka.getAnswer();
    }
    
}

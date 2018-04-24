package pubivisaapp.ui;

import java.sql.*;
import pubivisa.domain.Database;
import pubivisa.dao.QuestionDao;
import pubivisa.domain.Pubivisa;

public class PubivisaUi {

    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Database database = new Database("jdbc:sqlite:pubivisa.db");
        
        Pubivisa pubivisa = new Pubivisa();
        pubivisa.start();
        
        QuestionDao questions = new QuestionDao(database);
        System.out.println(questions.findAllQuestions().toString());
   
    }

    }

  
    


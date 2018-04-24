/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubivisa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.*;
import pubivisa.domain.Database;
import pubivisa.domain.*;

/**
 *
 * @author laura
 */
public class QuestionDao {
    private Database database;
    
    public QuestionDao(Database database) {
        this.database = database;
    }

    public List findAllQuestions() throws SQLException {
        List<Question> questions = new ArrayList<>();

        try (Connection conn = database.getConnection();
            ResultSet result = conn.prepareStatement("SELECT id, questionContent, answerContent FROM Question").executeQuery()) {

            while (result.next()) {
                questions.add(new Question(result.getInt("id"), result.getString("questionContent"), result.getString("answerContent")));
            }
        }

        return questions;
    
    }
}

   


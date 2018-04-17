/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubivisa.domain;

/**
 *
 * @author laura
 */
public class Question {
    String content;
    String answer;
    


    public Question (String content, String answer) {
        this.content = content;
        this.answer = answer;       
}
    public String getContent() {
        return content;
}
    public String getAnswer() {
        return answer;
    }
}

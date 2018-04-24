package pubivisa.domain;


public class Question {
    private Integer id;
    private String questionContent;
    private String answerContent;
  
    public Question (Integer id, String questionContent, String answerContent) {
        this.id = id;
        this.questionContent = questionContent;
        this.answerContent = answerContent;
        
    }
    
    public String getQuestionContent() {
        return questionContent;
    }
}

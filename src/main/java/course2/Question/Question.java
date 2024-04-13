package course2.Question;

import java.util.Objects;

public class Question {
    String qustion;
    String answer;

    public Question(String answer,String qustion) {
        this.answer = answer;
        this.qustion=qustion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQustion() {
        return qustion;
    }

    public void setQustion(String qustion) {
        this.qustion = qustion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(qustion, question.qustion) && Objects.equals(answer, question.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qustion, answer);
    }

    @Override
    public String toString() {
        return "Question{" +
                "qustion='" + qustion + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}

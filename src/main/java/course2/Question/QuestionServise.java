package course2.Question;

import java.util.Collection;

public interface QuestionServise {
    public Question add(String answer, String question);

    public Question add(Question question);

    public Question remove(Question question);

    public Collection<Question> getAll();

    public Question getRandomeQuestation();
}

package course2.Question;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 */
@Service
public class ExaminerServisImpl implements ExaminerServis {

    private  QuestionServise questionServise;

    public ExaminerServisImpl(QuestionServise questionServise) {

        this.questionServise = questionServise;
    }

    @Override
    public  Collection<Question> getQuestion(int amourt) {
        var question = questionServise.getAll().size();
        Set<Question> questions = new HashSet<>();
        if (amourt > question) {
            throw new ListOverflowException();
        }
        while (questions.size() <= amourt) {
            questions.add(questionServise.getRandomeQuestation());
        }


        return questions;


    }
}

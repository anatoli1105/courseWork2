package course2.Question;

import org.springframework.stereotype.Service;

import java.util.*;

import static java.util.Collections.*;

@Service
public class JavaQuestationServise implements QuestionServise{
    private final Set<Question>questions=new HashSet<>();
    private final Random random=new Random();
    @Override
    public Question add(String answer, String question){
return add(new Question(answer,question));
    }
    @Override
    public Question add(Question question){
         questions.add(question);
         return question;
    }
    @Override
    public  Question remove(Question question){
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll(){
        return unmodifiableSet(questions);
    }

    @Override
    public Question getRandomeQuestation(){
        var randomNumber=random.nextInt(questions.size());
        var count=0;
        for (Question question : questions) {
           count++;
           if(count==randomNumber){
               return question;
           }

        }
        return null;
    }
}

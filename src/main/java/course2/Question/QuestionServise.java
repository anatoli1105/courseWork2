package course2.Question;

import java.util.Collection;

public interface QuestionServise {
   public default Question add(String answer, String question){
        return null;
    }
    public default Question add(Question question){
       return null;
    }
    public default Question remove(Question question){
       return null;
    }
    public default Collection<Question> getAll(){
       return null;
    }
    public default Question getRandomeQuestation(){
      return null;
    }
}

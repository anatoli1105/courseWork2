package course2.Question;

import java.util.Collection;

public interface ExaminerServis {
    default Collection<Question> getQuestion(int amourt) {
        return null;
    }
}

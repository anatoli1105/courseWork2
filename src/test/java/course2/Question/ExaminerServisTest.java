package course2.Question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class ExaminerServisTest {
    @Mock
    JavaQuestationServise javaQuestationServise;
    @InjectMocks
    ExaminerServisImpl examinerServis;

    @BeforeEach
    void setUp() {
        List<Question> list = new ArrayList<>();
        list.add(new Question("ffffff", "ddddddd"));
        list.add(new Question("12345", "12345"));
        when(javaQuestationServise.getAll()).thenReturn(list);

    }




    @Test
    void randomAmourtTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                examinerServis.getQuestion(javaQuestationServise.getAll().size() + 2));
    }


}

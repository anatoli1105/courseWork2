package course2.Question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.servlet.tags.form.SelectTag;

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
        list.add(new Question("1234", "23454"));
        list.add(new Question("fff", "ggg"));
        when(javaQuestationServise.getAll()).thenReturn(list);

    }

    @Test
    void randomTest() {
        javaQuestationServise.add("ffffff", "ddddddd");
        javaQuestationServise.add("12345", "12345");
        javaQuestationServise.add("654321", "654321");
        Set<Question>actual=new HashSet<>();
        actual.add(new Question("12345", "12345"));
        actual.add(new Question("ffffff", "ddddddd"));
        assertThat(javaQuestationServise.getAll(), containsExactlyInAnyOrder(actual));


    }

    @Test
    void randomAmourtTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                examinerServis.getQuestion(javaQuestationServise.getAll().size() + 2));
    }


}

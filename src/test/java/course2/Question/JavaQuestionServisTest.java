package course2.Question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class JavaQuestionServisTest {
    JavaQuestationServise javaQuestationServise = new JavaQuestationServise();


    @Test
    void addTest() {
        javaQuestationServise.add("ffffff", "ddddddd");
        javaQuestationServise.add("12345", "12345");
        javaQuestationServise.add("654321", "654321");

        assertThat(javaQuestationServise.getAll(), containsExactlyInAnyOrder(new Question("ffffff", "ddddddd"),
           new Question("12345", "12345"), new Question("654321", "654321")));


    }
    @Test

    void duplicatingElement(){
        javaQuestationServise.add("ffffff", "ddddddd");
        javaQuestationServise.add("12345", "12345");
        javaQuestationServise.add("654321", "654321");
        assertThat(javaQuestationServise.getAll().doesNotHaveDuplicates();
    }

    @Test
    void removeTest() {
        javaQuestationServise.add("ffffff", "ddddddd");
        javaQuestationServise.add("12345", "12345");
        javaQuestationServise.add("654321", "654321");
        javaQuestationServise.remove(new Question("12345", "12345"));

        Assertions.assertEquals(javaQuestationServise.getAll().size(), 2);
        Assertions.assertEquals(javaQuestationServise.remove(new Question("654321", "654321")),
                new Question("654321", "654321"));

    }
    @Test
    void random(){
        javaQuestationServise.add("ffffff", "ddddddd");
        javaQuestationServise.add("12345", "12345");
        javaQuestationServise.add("654321", "654321");

        assertThat(javaQuestationServise.getAll(), containsExactlyInAnyOrderOf(new Question("ffffff", "ddddddd"),
                new Question("12345", "12345"), new Question("654321", "654321")));

    }

}

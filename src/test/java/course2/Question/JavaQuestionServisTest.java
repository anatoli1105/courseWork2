package course2.Question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaQuestionServisTest {
    JavaQuestationServise javaQuestationServise = new JavaQuestationServise();


    @Test
    void addTest() {
        javaQuestationServise.add("ffffff", "ddddddd");
        javaQuestationServise.add("12345", "12345");
        javaQuestationServise.add("654321", "654321");


        Set<Question> questions = new HashSet<>();
        questions.add(new Question("ffffff", "ddddddd"));
        questions.add(new Question("12345", "12345"));
        questions.add(new Question("654321", "654321"));

        assertEquals(questions, javaQuestationServise.getAll());


    }


    @Test
    void removeTest() {
        javaQuestationServise.add("ffffff", "ddddddd");
        javaQuestationServise.add("12345", "12345");
        javaQuestationServise.add("654321", "654321");
        javaQuestationServise.remove(new Question("12345", "12345"));

        assertEquals(javaQuestationServise.getAll().size(), 2);
        assertEquals(javaQuestationServise.remove(new Question("ffffff", "ddddddd")),
                new Question("ffffff", "ddddddd"));

    }

    @Test
    void random() {
        javaQuestationServise.add("ffffff", "ddddddd");
        javaQuestationServise.add("12345", "12345");
        javaQuestationServise.add("654321", "654321");


        assertThat(javaQuestationServise.getAll(), hasItems(new Question("ffffff", "ddddddd")));
    }



}

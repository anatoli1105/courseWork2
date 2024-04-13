package course2.Question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping (path = "/exam/java")
public class javQuestionController {
    private final JavaQuestationServise javaQuestationServise;

    public javQuestionController( JavaQuestationServise javaQuestationServise) {
        this.javaQuestationServise = javaQuestationServise;

    }
    @GetMapping(path = "/add")
    public Question add(@RequestParam String question,String answer){
        return javaQuestationServise.add(question,answer);
    }
    @GetMapping(path = "/remove")
    public Question remove(@RequestParam Question question){
        return javaQuestationServise.remove(question);
    }
    @GetMapping()
    public Collection<Question>getAll(){
        return javaQuestationServise.getAll();
    }
}

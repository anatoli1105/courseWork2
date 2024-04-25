package course2.Question;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/exam")
public class ExamController {
    private final ExaminerServis examinerServis;
    public ExamController(ExaminerServis examinerServis) {
        this.examinerServis = examinerServis;
    }
    @GetMapping(path = "/amourt")
    public Collection<Question> exam(@RequestParam int amourt){
       return examinerServis.getQuestion(amourt);
    }


}

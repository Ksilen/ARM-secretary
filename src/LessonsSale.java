import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LessonsSale extends CurrentData {
    // Список предметов и цен
    List<LessonSale> lessonsList = new ArrayList<>();

    LessonsSale() {
        // select Lessons : какие предметы и их цена?
        // this.lessonsList = "select * from..."
    }

    void editLessonsSale(Map<String, Integer> lessons) {
        // update Lessons
    }

    void newLessonsSale(Map<String, Integer> lessons) {

    }

    @Override
    public FormOutput getForm() {
        FormOutput output = null;//= ответ на запрос к БД
        return output;
    }

    @Override
    public void create() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}

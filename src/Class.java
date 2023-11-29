import java.util.Date;

public class Class extends CurrentData{
    // Время проведения предмета из распиания
    LessonSale lesson;
    int classRoom;
    Date date;
    Teacher teacher;
    ClassGrade lessonGrade;

    public void setLessonGrade(ClassGrade lessonGrade) {
        this.lessonGrade = lessonGrade;//??????????????????????????????????????????????????
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

    @Override
    public FormOutput getForm() {
        return null;
    }
}

import java.util.List;

public class Teacher extends CurrentData {
    String name;
    String surname;
    int teacherID;
    String phoneNumber;
    List<LessonSale> specialization;//

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

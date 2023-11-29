import java.util.Map;

public class ClassGrade extends CurrentData {
    //   Предмет, Оценки за урок, домашнее задание
    Class aClass;
    Map<Student, Byte> StudentGrade;
    String homeWork;

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

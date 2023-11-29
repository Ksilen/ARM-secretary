import java.util.List;

public class Requests {
    static class ReportCard implements GetForm {
        // табель успеваемости
        Group group;
        LessonsSale lessonsSale;

        public ReportCard(Group group, LessonsSale lessonsSale) {
            this.group = group;
            this.lessonsSale = lessonsSale;
        }

        @Override
        public FormOutput getForm() {
            // "Select * from where group = {grooup} and lesson = {lessonSale}....."
            return null;
        }
    }

    static class AverageRating implements GetForm {
        // Средняя оценка
        @Override
        public FormOutput getForm() {
            return null;
        }
    }

    static class StudentsOnGroup implements GetForm {
        //Кол-во студентов по группам
        Group group;
        Course course;
        List<Student> studentList;

        @Override
        public FormOutput getForm() {
            return null;
        }
    }

    static class GoofyStudents implements GetForm {
        // неуспевающие студенты
        List<Student> studentList;
        @Override
        public FormOutput getForm() {
            // studentBob.getProgress();
            return null;
        }
    }
}

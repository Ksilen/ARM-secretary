public class Main {
    public static void main(String[] args) {

        ChangeOutput changeOutput = new ChangeOutput();
        changeOutput.visualizationForm(new LessonsSale());

        ChangeClasses changeClasses = new ChangeClasses();
        changeClasses.create(new Student());
        LessonsSale lessonsSale = new LessonsSale();
        changeClasses.setCurrentData(lessonsSale);
        changeClasses.delete();

        changeOutput.visualizationForm(changeClasses.currentData);

        Requests.ReportCard requests = new Requests.ReportCard(new Group(),new LessonsSale());
        changeOutput.visualizationForm(requests);

        new FreeRequest().oldDataToArchive();
    }
}
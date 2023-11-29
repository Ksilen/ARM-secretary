public class Author implements GetForm {
    String author = "I'm Author";
    String program = "«АРМ секретаря деканата вуза»";
    class About extends FormOutput{
        static Forms forms = Forms.AUTHOR;
    }

    @Override
    public FormOutput getForm() {
        FormOutput formOutput = new About();
        formOutput.output[0]  = author;
        formOutput.output[1]  = program;
        formOutput.form = About.forms;
        return formOutput;
    }
}

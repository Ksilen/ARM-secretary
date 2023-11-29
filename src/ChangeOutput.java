public class ChangeOutput {
    GetForm form;

    void visualizationForm(GetForm form){
        this.form = form;
        form.getForm();
        //отобразить данные
    }
    void printForm(){
        System.out.println(this.form);
    }
}

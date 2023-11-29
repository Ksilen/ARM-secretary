import java.util.ArrayList;

public class ClassTable extends CurrentData {
    // Расписание
    ArrayList<Class> table;

    public ClassTable() {
        // this.table = "select * ..."
    }

    public ArrayList<Class> getTable() {
        return table;
    }

    public void setTable(ArrayList<Class> table) {
        this.table = table;
        //
    }

    @Override
    public FormOutput getForm() {
        return null;
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

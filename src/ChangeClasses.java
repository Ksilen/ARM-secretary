public class ChangeClasses {
    ChangeClasses(){
    }
    ChangeClasses(CurrentData currentData){
        this.currentData = currentData;
    }
    CurrentData currentData;

    public void setCurrentData(CurrentData currentData) {
        this.currentData = currentData;
    }

    void create(){
        currentData.create();
    }
    void create(CurrentData currentData){
        currentData.create();
    }

    void update(){
        currentData.update();
    }
    void update(CurrentData currentData){
        currentData.update();
    }

    void delete(){
        currentData.delete();
    }
    void delete(CurrentData currentData){
        currentData.delete();
    }
}

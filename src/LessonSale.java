public class LessonSale extends CurrentData {
    // Наименование и цена одного урока
    String name;
    int price = 0;
    static byte averageGrade;

    public LessonSale(String name) {
        this.name = name;
    }

    public LessonSale(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public void create() {
// Создать новую запись
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

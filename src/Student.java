import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class Student extends CurrentData {
    String name;
    String surName;
    Date birthday;
    String location;
    String group;
    byte course;
    int studentID;
    Map<LessonSale, Byte> progress;

    Student() {
    }

    public Student(String name, String surName, Date birthday, String location, String group, byte course, int studentID) {
        this.name = name;
        this.surName = surName;
        this.birthday = birthday;
        this.location = location;
        this.group = group;
        this.course = course;
        this.studentID = studentID;
    }

    public FormOutput getStudentInformation() {
        return new FormOutput() {
            @Override
            public FormOutput getForm() {
                return null;
            }
        };
    }

    public String getStudentData() {
        return surName + " " + name + " " + course + " " + group + " " + studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", birthday=" + birthday +
                ", location='" + location + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", studentID=" + studentID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    public void setName(String name) {
        this.name = name;
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

//    public void setSurName(String surName) {
//        this.surName = surName;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }
//
//    public void setCourse(byte course) {
//        this.course = course;
//    }
//
//    public void setStudentID(int studentID) {
//        this.studentID = studentID;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSurName() {
//        return surName;
//    }
//
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public byte getCourse() {
//        return course;
//    }
//
//    public int getStudentID() {
//        return studentID;
//    }
}

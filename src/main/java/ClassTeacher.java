
public class ClassTeacher {

    private ClassTeacher() {};
    private static ClassTeacher instace = new ClassTeacher();
    public static ClassTeacher getInstance(){
        return instace;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    private String nameTeacher;
    private String nameClass;

}
public class student {
    private String name = "John";
    private String classes = "c12";
    public student (){
    }
    public student(String name, String classes){
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    //    public String setName(String name1) {
//        return name = name1;
//    }
//
//    public String setClasses(String classes1) {
//       return classes = classes1;
//    }

}

package Lesson2_labs.prob2A;

public class Student {
    private String name;
    private GradeReport gradeReport;

    /**
     * @param name: name of student
     */
    public Student(String name){
        this.name = name;
        gradeReport = new GradeReport(this);
    }

    public String getName(){
        return name;
    }

    public GradeReport getGradeReport(){
        return gradeReport;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name  +
                ", gradeReport=" + gradeReport +
                '}';
    }
}

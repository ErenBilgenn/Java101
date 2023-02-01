package Classes;

public class Course {
    Teacher teacher;
    String name;
    String performance;
    String code;
    String prefix;
    int performanceGrade;
    int note ;

    Course(String name,String performance,String code,String prefix){
        this.name = name;
        this.performance = performance;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int performanceGrade = 0;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }

    }

}

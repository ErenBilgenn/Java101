package Classes;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali Hoca","054612...","TRH");
        Teacher t2 = new Teacher("Mahmut Hoca","054124..","FZK");
        Teacher t3 = new Teacher("Ahmet Hoca","055423...","MAT");

        Course tarih = new Course("Tarih","Tarih Sözlü","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","Tarih Sözlü","102","FZK");
        fizik.addTeacher(t2);

        Course mat = new Course("Matematik","Tarih Sözlü","103","MAT");
        mat.addTeacher(t3);

        Student s1 = new Student("Eren","674","2",tarih,fizik,mat);
        s1.addBulkExamNote(100,50,75);
        s1.addPerformanceGrade(70,40,50);
        s1.isPass();

        Student s2 = new Student("Can","333","2",tarih,fizik,mat);
        s2.addBulkExamNote(55,75,45);
        s2.addPerformanceGrade(100,100,100);
        s2.isPass();

        Student s3 = new Student("Hüseyin","444","2",tarih,fizik,mat);
        s3.addBulkExamNote(60,10,100);
        s3.addPerformanceGrade(40,60,80);
        s3.isPass();


    }
}

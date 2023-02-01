package Classes;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addPerformanceGrade(int perf1, int perf2, int perf3) {
        if (perf1 >= 0 && perf1 <= 100) {
            this.c1.performanceGrade = perf1;
        }
        if (perf2 >= 0 && perf2 <= 100) {
            this.c2.performanceGrade = perf2;
        }
        if (perf3 >= 0 && perf3 <= 100) {
            this.c3.performanceGrade = perf3;
        }
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void isPass() {
        System.out.println("============");
        this.avarage = ((this.c1.performanceGrade * 0.20 + this.c1.note * 0.80) + (this.c2.performanceGrade * 0.20 + this.c2.note * 0.80) + (this.c3.performanceGrade * 0.20 + this.c3.note * 0.80))/3.00;
        if (this.avarage >= 60) {
            System.out.println("Sınıfı geçti.");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu : " + this.c1.note);
        System.out.println(this.c1.performance + " Notu : " + this.c1.performanceGrade);
        System.out.println(this.c2.name + " Notu : " + this.c2.note);
        System.out.println(this.c2.performance + " Notu : " + this.c2.performanceGrade);
        System.out.println(this.c3.name + " Notu : " + this.c3.note);
        System.out.println(this.c3.performance + " Notu : " + this.c3.performanceGrade);
        System.out.println("Ortalamanız : " + this.avarage);
    }
}

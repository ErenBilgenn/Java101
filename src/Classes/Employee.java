package Classes;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax = 0;
        if (this.salary > 1000) {
            tax = this.salary * 0.03;
        }
        return tax;
    }

    int bonus() {
        int bonus = 0;
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;
    }

    double raiseSalary() {
        double raise = 0;
        int yearsOfService = 2021 - this.hireYear;
        if (yearsOfService < 10) {
            raise = this.salary * 0.05;
        } else if (yearsOfService >= 10 && yearsOfService < 20) {
            raise = this.salary * 0.1;
        } else if (yearsOfService >= 20) {
            raise = this.salary * 0.15;
        }
        return raise;
    }

    double newSalary() {
        double newSalary = 0;
        newSalary = (this.salary - this.tax()) + this.bonus();
        return newSalary;
    }

    public String toString() {
        return "Adı : " + this.name + "\nMaaşı : " + this.salary + "\nÇalışma saati : " + this.workHours + "\nBaşlangıç Yılı : " + this.hireYear + "\nVergi : " + this.tax() + "\nBonus : " + this.bonus() + "\nMaaş Artışı : " + this.raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş : " + this.newSalary() + "\nToplam Maaş : " + (this.salary + this.raiseSalary());
    }
}

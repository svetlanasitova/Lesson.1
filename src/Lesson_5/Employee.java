package Lesson_5;

public class Employee {
    String name ;
    String profession;
    String email ;
    String phone ;
    double salary;
    int age ;

    public  double getBonus() {
        return salary * 1.5;
    }
    public Employee(String name, String profession, String email,String phone, double salary, int age){
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        System.out.println("Сотрудник " + this.name + " зарегистрирован.");
    }
}

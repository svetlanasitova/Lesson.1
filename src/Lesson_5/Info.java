package Lesson_5;

public class Info{
    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов Вова", "Frontend",
                "vova@mail.com", "811111", 200000, 38);

        Employee employee2 = new Employee("Сидоров Ян", "QA Engineer",
                "yn@mail.com", "822222", 150000, 27);


        Employee employee3 = new Employee("Петрова Зоя", "Engineer",
                "zoy@mail.com", "833333", 300000, 40);


        Employee employee4 = new Employee("Троян Кирил", "Frontend",
                "kir@mail.com", "844444", 400000, 43);


        Employee employee5 = new Employee("Курская Анна", "Director",
                "ann@mail.com", "855555", 500000, 37);


        Employee[] employee = {employee1, employee2, employee3, employee4, employee5};
        for (int i = 0; i < employee.length; i++) {
            if(employee[i].age >= 40){
                System.out.println("Возраст сотрудника больше 40! " + employee[i].name);
            }
            System.out.println( " Имя " + employee[i].name +  "Профессия - " + employee[i].profession + "Email : " + employee[i].email + " Телефон " + employee[i].phone + " Возраст " + employee[i].age);

        }
    }

}

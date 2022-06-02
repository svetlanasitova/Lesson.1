package Lesson_6;

import java.util.concurrent.Callable;

class Cat extends Animal{
    public Cat(String name, int age, double swim, double run){
        super(name, age, swim, run);
    }

}
class Dog extends Animal{
     public Dog(String name, int age, double swim, double run){
         super(name, age, swim, run);
     }
}




public class Main {
    public static void main(String[] args){

        Cat cat1 = new Cat("Самсон", 5, 3.1, 200);

        Cat cat2 = new Cat("Босс", 9, 0, 10.5);

        Dog dog1 = new Dog("Арчи", 7, 20.7, 300);

        Dog dog2 = new Dog("Магнат", 5, 50.5, 550);

        Cat[] cats = {cat1, cat2};
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Всего котов : " + cats.length);
            if (cats[i].getSwim() > 0) {
                System.out.println("Оооо кот " + cats[i].getName() + " умеет плавать! Он проплыл - " + cats[i].getSwim());
            } else {
                System.out.println("Кот - "+ cats[i].getName() + " боится воды)) ");
            }
            System.out.println("Кот - " + cats[i].getName() + " - который пробежал - " + cats[i].getRun());
         }  System.out.println();

        Dog[] dogs = {dog1, dog2};
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Всего собак : " + dogs.length);

            System.out.println("Пёс - " + dogs[i].getName() + " -  пробежал - " + dogs[i].getRun() + " - проплыл - " + dogs[i].getSwim());

        }System.out. println();

    }
}



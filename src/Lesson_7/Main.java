package Lesson_7;

public class Main {
    public static void main(String[] args){
        Cat cat1 = new Cat("Барсик", 80);
        Cat cat2 = new Cat("Лексус", 130);
        Cat cat3 = new Cat("Самсон", 85);

        Plate plate = new Plate(250);
        plate.setFood(300);
        Cat[] cats = {cat1, cat2, cat3};


        for (int i = 0; i < cats.length; i++) {
                if(cats[i].getAppetit() < plate.getFood()) {
                    cats[i].eat(plate);
                    System.out.println(cats[i].name + " сыт.");
                    System.out.println();
                }else if (cats[i].getAppetit() > plate.getFood()) {
                     cats[i].eat(plate);
                    System.out.println(cats[i].name + " остался голодный! Дать ещё корма.");
                    cats[i].eat(new Plate(85)) ;
                    System.out.println();
            }
        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        System.out.println();}

    }
}

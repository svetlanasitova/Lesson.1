package Lesson_7;

public class Cat {
    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;

    }

    public String name;
    private int appetit;
    private boolean eat = false;

    public int getAppetit() {
        return appetit;
    }
    public void info(){
        System.out.println("Кот " + name + " аппетитом " + appetit + " не голоден? - " + eat);
    }
    public void eat(Plate plate){
        if(plate.getFood() > appetit) {
            plate.decreaseFood(appetit);
            eat = true;
        }else if(plate.getFood() < appetit){
            plate.setFood(plate.food);
        }
    }
}


package Lesson_7;

public class Plate {

    public int food;

    public Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetit){
        food -= appetit;
    }
//    public void addFood(int meat){
//      food += meat ;
//    }

    public void info(){
        System.out.println("В тарелке осталось " + food + " грамм корма.");
    }
}

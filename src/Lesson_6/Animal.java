package Lesson_6;

public  abstract class Animal {
//    abstract class Animal{
        private String name;
        private int age;
        private double swim;
        private  double run;
        public static int count = 0;

        public String getName(){return name;}

        public double getSwim(){return swim;}

        public double getRun(){return run;}

    public int getCount() {
        return count;
    }

    public Animal(String name, int age, double swim, double run){
            this.name = name;
            this.age = age;
            this.swim = swim;
            this.run = run;
            count++;
            System.out.println("Всего животных - " + getCount());
        System.out.println();
        }

    }
//}

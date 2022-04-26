package Home;

public class HomeWork {

        public static void main(String[] args) {
            System.out.println("Вывод printThreeWords");
            printThreeWords();
            System.out.println("Вывод checkSumSing");
            checkSumSing();
            System.out.println("Вывод printColor");
            printColor();
            System.out.println("Вывод compareNumbers");
            compareNumbers();
        }

        public static void printThreeWords(){
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        public static void checkSumSing(){
            int a, b;
            a = 3;
            b = a - 10;
            if (a + b >= 0){
                System.out.println("Сумма положительная");
            }else {
                System.out.println("Сумма отрицательная");
            }
        }
        public static void printColor(){
            int value = 0;
            if(value <= 0){
                System.out.println("Красный");
            }
            if (value > 0 && value <= 100){
                System.out.println("Жёлтый");
            }
            if (value > 100){
                System.out.println("Зелёный");
            }
        }
        public static void compareNumbers() {
            int a, b;
            a = 1;
            b = 9;
            if (a >= b) {
                System.out.println(" a>=b");
            } else {
                System.out.println("a<b");
            }
        }
}

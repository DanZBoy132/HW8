import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int[] array = new int[10];
        Random rand = new Random();

        System.out.println("Веса 10 людей: ");
        for (int i = 0; i < array.length; i++){
            array[i] = 40 + rand.nextInt(61);
            System.out.println("Человек: " + (i + 1) + ": " + array[i] + " кг.");
        }

        System.out.println("\n=== Результат");

        averageWeight(array);
        sums(array);
    }

    public static void averageWeight(int[]array){
        int sum = 0;
        for (int arrays : array){
            sum += arrays;
        }

        double averageWeight = (double) sum / array.length;
        System.out.printf("Средний вес всех людей: %.2f кг\n", averageWeight);
    }

    public static void sums(int[]array){
        int countInRange = 0;

        for (int arrays : array){
            if (arrays >= 60 && arrays >= 80){
                countInRange++;
            }
        }

        System.out.println("Количество людей с весом от 60 до 80 кг: " + countInRange);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
1. Создать список случайных чисел.
Используя Stream Api подсчитать среднее арифиметическое квадратов этих чисел.
**/

public class HomeTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        int N = 5;
        List<Double> randArr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            randArr.add((double) random.nextInt(10));
        }
        System.out.println("Generated array:\n" + randArr);
        System.out.println("The result:\n" + randArr.stream().mapToDouble(s -> s * s).average().getAsDouble());
    }
}

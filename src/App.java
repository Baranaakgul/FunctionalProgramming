
import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<String> myList = List.of("Cat", "Dog");
        getList(myList);
        List<Integer> numbers = List.of(1, 3, 4, 5);
        getNumberCalculator(numbers);

    }

    private static int getNumberCalculator(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
            System.out.println(sum);
        }
        return sum;

    }

    private static void getList(List<String> myList) {
        myList.stream().forEach(element -> System.out.println(element));
    }

}

import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> numbers = new ArrayList<>();

    private static void addNumber(int i) {
        numbers.add(Integer.valueOf(i));
        System.out.println(numbers);
    }

    public static int getTotal() {
        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        return total;
    }

    public static boolean isFound(int target) {
        return numbers.contains(Integer.valueOf(target));
    }

    public static void removeNumber(int target) {
        if (numbers.contains(Integer.valueOf(target))) {
            int index = numbers.indexOf(Integer.valueOf(target));
            numbers.remove(index);
        }
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        System.out.println("Adding numbers to the list");
        addNumber(3);
        addNumber(8);
        addNumber(24);
        System.out.println("The total is: " + getTotal());
        System.out.println("8 in the list : " + isFound(8) );
        System.out.println("5 in the list : " + isFound(5) );
        removeNumber(8);
        System.out.println("The total is: " + getTotal());
    }

}
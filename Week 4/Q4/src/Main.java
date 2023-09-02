public class Main {

    public static void describe(String color, Priority priority) {
        System.out.println(color + " indicates " + priority.toString().toLowerCase() + " priority");
    }

    public static void main(String[] args) {
        describe("Red", Priority.HIGH);
        describe("Orange", Priority.MEDIUM);
        describe("Blue", Priority.MEDIUM);
        describe("Green", Priority.LOW);
    }
}
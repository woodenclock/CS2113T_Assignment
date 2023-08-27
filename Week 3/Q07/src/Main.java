public class Main {

    public static void printPrice(String item) {
        // TODO: add your code here
        int foodIndexEnd = item.indexOf("--") - 1;
        int dollarIndexStart = item.indexOf('$') + 1;
        int dollarIndexEnd = item.indexOf('/');
        int centIndexStart = item.indexOf('/') + 1;

        String food = item.substring(0, foodIndexEnd);
        String dollar = item.substring(dollarIndexStart, dollarIndexEnd);
        String cent = item.substring(centIndexStart, centIndexStart+2);

        System.out.println(food.trim().toUpperCase() + ": " + dollar + "." + cent);
    }

    public static void main(String[] args) {
        printPrice("sandwich  --$4/50");
        printPrice("  soda --$10/00");
        printPrice("  fries --$0/50");
    }
}
public class Main {

    public static void printTotalScore(String[] values) {
        // TODO: add your code here
        int totalScore = 0;

        if (values != null) {
            for (int i = 0; i < values.length; i++) {
                totalScore += Integer.parseInt(values[i]);
            }
        }
        System.out.println(totalScore);
    }

    public static void main(String[] args) {
        printTotalScore(new String[]{});
        printTotalScore(new String[]{"0", "124", "-15"});
    }
}
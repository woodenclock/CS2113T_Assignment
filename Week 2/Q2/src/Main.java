// Do this exercise on your own computer. When you are happy with the code, copy-paste it here and submit.
// Note that Coursemology does not check the correctness of this particular exercise
public class Main {
    public static void main(String[] args) {
        //Less than 2 Inputs
        if (args.length < 2) {
            System.out.println("Please provide 2 inputs");
            return;
        }

        String first = args[0];
        String second = args[1];
        System.out.println("Words given: " + first + ", " + second);

        boolean isSame = first.equals(second);

        System.out.println("They are the same: " + isSame);
    }
}
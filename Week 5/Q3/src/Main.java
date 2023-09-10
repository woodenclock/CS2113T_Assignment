public class Main {

    public static void printArea(String descriptor) {
        try {
            System.out.println(descriptor + "=" + calculateArea(descriptor));
        } catch (NumberFormatException exception) {
            System.out.println("WIDTH or HEIGHT is not a number: " + descriptor);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("WIDTH or HEIGHT is missing: " + descriptor);
        } catch (IllegalShapeException exception) {
            System.out.println("Too many dimensions: " + descriptor);
        }

    }

    private static int calculateArea(String descriptor) throws IllegalShapeException {
        String[] dimensions = descriptor.split("x");
        if (dimensions.length > 2) {    //More than 2 dimensions
            throw new IllegalShapeException();
        }
        return Integer.parseInt(dimensions[0]) * Integer.parseInt(dimensions[1]);
    }

    public static void main(String[] args) {
        printArea("3x4");
        printArea("5x5");

        printArea("3xy");
        printArea("3x");
        printArea("3");
        printArea("3x4x5");
    }
}


//        String trimmedDescriptor = descriptor.trim();
//        Scanner trimmedDescriptorScanner = new Scanner(trimmedDescriptor);
//        int positionOfX = trimmedDescriptor.indexOf("x");   //Position of 'x'
//        String width = trimmedDescriptor.substring(0, positionOfX);
//        String height = trimmedDescriptor.substring(positionOfX+1, trimmedDescriptor.length()-1);
//
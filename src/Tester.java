/**
 * @author Drumstyle92
 * class that contains the main.
 */
public class Tester {
    /**
     *
     * @param args main parameter.
     * main method which contains string arrays, string methods and printouts.
     */
    public static void main(String[] args) {
        // creating string arrays
        String[] array1 = new String[]{" I want "," to learn "," how to code! "};
        String[] array2 = new String[]{array1[0].trim(), array1[1].trim(), array1[2].trim()};
        // first comparison
        int statement1 = array1[0].compareTo("I want");
        // second comparison
        int statement2 = array2[1].compareToIgnoreCase("to learn");

        boolean out = !(statement1 > statement2);

        System.out.println("---------------Result-----------------");
        System.out.println(out);

    }
}

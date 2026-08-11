import java.util.ArrayList;

public class ArrayListShuffle {

    // Define the Class
    public static void main(String[] args) {

        // Initialize the ArrayList
        ArrayList<String> list = new ArrayList<>();

        list.add("Persimmon");
        list.add("Blackberry");
        list.add("Strawberry");
        list.add("Apricot");

        // Call the Shuffle Method
        shuffle(list);

        // Print the Shuffled List
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // Define the Shuffle Method
    public static void shuffle(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {

            int randomIndex = (int) (Math.random() * list.size());

            String savedString = list.get(i);

            list.set(i, list.get(randomIndex));
            list.set(randomIndex, savedString);
        }
    }
}
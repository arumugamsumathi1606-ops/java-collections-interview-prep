import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Display the ArrayList
       System.out.println("Fruits: " + fruits);
       System.out.println("Fruits: " + fruits.get(2));
       System.out.println("Fruits: " + fruits.size());
       System.out.println("Fruits: " + fruits.contains("Apple"));
       System.out.println("Fruits: " + fruits.remove("Banana"));
       System.out.println("Fruits: " + fruits.set(1, "Blueberry"));

        }
    }


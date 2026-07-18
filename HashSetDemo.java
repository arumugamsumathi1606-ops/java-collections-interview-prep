import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> fruits = new HashSet<>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");
        fruits.add("Date");

        // Display the HashSet
        System.out.println("Fruits: " + fruits);
    
    }
    
}

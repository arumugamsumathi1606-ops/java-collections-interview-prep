import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashMap<Integer, String> emp = new HashMap<>();

        // Add elements to the HashSet
        emp.put(1, "John");
        emp.put(2, "Jane");   
        emp.put(1, "Jansi");
        emp.put(4, "Janaki");
        System.out.println("Employees: " + emp);
    
}
}

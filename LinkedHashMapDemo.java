import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        LinkedHashMap<Integer, String> emp = new LinkedHashMap<>();

        // Add elements to the HashSet
        emp.put(4, "John");
        emp.put(3, "Jane");   
        emp.put(2, "Jansi");
        emp.put(1, "Janaki");
        System.out.println("Employees: " + emp);
    
    
}
}

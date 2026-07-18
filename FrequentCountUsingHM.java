import java.util.HashMap;

public class FrequentCountUsingHM {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        HashMap<Integer, Integer> frequentCountMap = new HashMap<>();
        for (int i=0 ; i<arr.length ; i++)
        {
            if(frequentCountMap.containsKey(arr[i]))
            {
                int Count =  frequentCountMap.get(arr[i]); //1->1
                frequentCountMap.put(arr[i], Count + 1);// add +1, if the same number is already present in the map
                
           }
            else{
                frequentCountMap.put(arr[i], 1);// 1st time then just add 1 in the map
            }
        }
        System.out.println("Frequent Count: " + frequentCountMap);
    }
}

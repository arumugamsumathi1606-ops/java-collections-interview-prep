import java.util.HashMap;

public class FrequentCountDemo {
    public static void main(String[] args) {
       String str = "aaabbbcccddeee";
       HashMap<Character, Integer> freqCount = new HashMap<>();
       for (int i=0 ; i<str.length(); i++)
       {
        char ch = str.charAt(i); // Get the character at index i /Dont forget
        if(freqCount.containsKey(ch))
        {
            freqCount.put(ch, freqCount.get(ch)+1);
        }
            else
            {
                freqCount.put(ch, 1);
            }
        }
        System.out.println("Frequency of characters in the string: " + freqCount);
       
       }

        
    }
    


import java.util.HashMap;
import java.util.Map;

public class CountingOccurrences {

    public static void main(String [] args){
        countOccurrences(new int[] {1,2,3,2,1,3,4,7,1});
    }

    public static void countOccurrences(int [] numbers){

        //map = elements with key and value

        Map<Integer,Integer> occurences = new HashMap<>();

        //Integer is an object and int is a type
        // for (int i=0;i<numbers.length;i++)

        for (int number : numbers) {
            if (occurences.containsKey(number)) {

                Integer value = occurences.get(number);
                occurences.put(number, value + 1);

            } else {
                occurences.put(number, 1);

            }
        }

        for(Integer key: occurences.keySet()) {
            System.out.println("Number " + key + " occurs " + occurences.get(key) + " times");
        }
    }

}

import java.util.*;

public class lang {
    /**
     * Returns all even numbers in the given list.
     *
     * @param nums A list of integers to filter.
     * @return A list containing only the even numbers.
     */
    public static List<Integer> evenNumbers(List<Integer> nums){
        List<Integer> even_nums = new ArrayList<>();
        for(int num: nums){
            if(num % 2 == 0){
                even_nums.add(num);
            }
        }
        return even_nums;
    }

    /**
     * Converts all characters in a string to uppercase.
     *
     * @param string The string to convert.
     * @return A string with all uppercase characters.
     */
    public static String upperCase(String string){
        return string.toUpperCase();
    }
    // public static String longestString(List<String> strings){
    //     String long_string = "";
        
    //     for(String string: strings){
    //         if(string.length() > long_string.length()){
    //             long_string = string;
    //         }
    //     }
    //     return long_string;
    // }
}

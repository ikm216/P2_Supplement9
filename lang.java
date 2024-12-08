import java.util.*;

public class lang {
    public static List<Integer> evenNumbers(List<Integer> nums){
        List<Integer> even_nums = new ArrayList<>();
        for(int num: nums){
            if(num % 2 == 0){
                even_nums.add(num);
            }
        }
        return even_nums;
    }
}

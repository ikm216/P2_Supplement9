import org.junit.*;
import java.util.*;

public class test{
    @Test
    public void test_should_return_even_numbers(){
        List<Integer> nums = Arrays.asList(1, 2, 4, 7, 8);
        nums = lang.evenNumbers(nums);
        List<Integer> test = Arrays.asList(2, 4, 8);
        Assert.assertEquals(test, nums);
    }
}
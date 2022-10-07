package In_Class_Demo;

import static com.google.common.primitives.Ints.min;
import static org.testng.Assert.assertEquals;

public class Test {
    @org.testng.annotations.Test
    public void testMin(){
        int [] arr ={2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int result = min(arr);
        assertEquals(-22, result);
    }
}

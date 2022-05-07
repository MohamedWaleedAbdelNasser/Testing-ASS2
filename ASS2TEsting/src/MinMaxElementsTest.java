import static org.junit.Assert.*;
import org.junit.Test;
public class MinMaxElementsTest {
    @Test
    public void testcase1(){
        MinMaxElements y = new MinMaxElements(); int[] x = {21,20,3,24,-4,256,17,80,15};
        assertEquals(-4,y.Min(x)); assertEquals(256, y.Max(x));
    }
    @Test
    public void testcase2(){
        MinMaxElements y = new MinMaxElements(); int[] x = {11,12,13,14,0,15,167,998,1000};
        assertEquals(0,y.Min(x)); assertEquals(1000, y.Max(x));
    }
    @Test
    public void testcase3(){
        MinMaxElements y = new MinMaxElements();
        int[] x = {5,9}; assertEquals(5,y.Min(x)); assertEquals(9, y.Max(x));
    }
    @Test
    public void testcase4(){
        MinMaxElements y = new MinMaxElements(); int[] x = {1}; assertEquals(1,y.Min(x)); assertEquals(1, y.Max(x));
    }
    @Test
    public void testcase5(){
        MinMaxElements y = new MinMaxElements(); int[] x = {95, 8, 61, 606, 800, 11, 2010, -10};
        assertEquals(-10,y.Min(x)); assertEquals(2010, y.Max(x));
    }
}

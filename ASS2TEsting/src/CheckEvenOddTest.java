import static org.junit.Assert.*;
import org.junit.Test;
public class CheckEvenOddTest {
    @Test
    public void even1(){
        CheckEvenOdd x = new CheckEvenOdd(); int n = 6; assertEquals("Even",x.check(n));
    }
    @Test
    public void even2(){
        CheckEvenOdd x = new CheckEvenOdd(); int n = 30; assertEquals("Even",x.check(n));
    }
    @Test
    public void odd1(){
        CheckEvenOdd x = new CheckEvenOdd(); int n = 9; assertEquals("Odd",x.check(n));
    }
    @Test
    public void odd2(){
        CheckEvenOdd x = new CheckEvenOdd(); int n = 21; assertEquals("Odd",x.check(n));
    }
    @Test
    public void zero(){
        CheckEvenOdd x = new CheckEvenOdd();
        int n = 0;
        assertEquals("Even",x.check(n));
    }
    @Test(expected = IllegalArgumentException.class) public void negative(){
        CheckEvenOdd x = new CheckEvenOdd(); int n = -6;
        x.check(n);
    }
}

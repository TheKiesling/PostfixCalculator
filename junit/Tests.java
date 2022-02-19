import static org.junit.jupiter.api.Assertions.*;

public class Tests{
	@Test
    public void PushTest(){
        Stack<String> stack = new Stack<String>();
        stack.push("Jose");
        assertEquals("Jose", stack.peek());
        assertEquals(1, stack.count());
        stack.push("Kiesling");
        assertEquals("Kiesling", stack.peek());
        assertEquals(2, stack.count());
    }

    @Test
    public void PullTest(){
        Stack<Boolean> stack = new Stack<Boolean>();
        stack.push(true);
        assertEquals(1, stack.count());
        assertEquals(true, stack.pull());
        assertEquals(0, stack.count());
        assertEquals(null, stack.pull());
    }

    @Test
    public void PeekTest(){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(21581);
        assertEquals(1, stack.count());
        assertEquals(21581, stack.peek());
        assertEquals(1, stack.count());
    }

    @Test
    public void CountTest(){
        Stack<Double> stack = new Stack<Double>();
        assertEquals(0, stack.count());
        stack.push(3.141592653589);
        assertEquals(1, stack.count());
        stack.pull();
        assertEquals(0, stack.count());
    }

    @Test
    public void IsEmpyTest(){
        Stack<Object> stack = new Stack<Object>();
        assertEquals(true, stack.isEmpty());
        stack.push(stack);
        assertEquals(false, stack.isEmpty());
        stack.pull();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void CasioTest(){
        Calculator calculator = new Calculator();
        assertEquals(55, calculator.Evaluate("1 2 + 4 * 1 - 5 *"));
        assertEquals(-1, calculator.Evaluate("4 5 -"));
        assertEquals(-7, calculator.Evaluate("9 6 5 * - 3 /"));
    }
}

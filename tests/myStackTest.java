import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: diezu_000
 * Date: 09.09.13
 * Time: 23:00
 * To change this template use File | Settings | File Templates.
 */
public class myStackTest {
    private myStack st = new myStack();

    @Test
    public void testPop() throws Exception
    {
        st.Push(3);
        Assert.assertEquals(3, (Object) st.Pop());
    }
}

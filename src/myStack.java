import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: diezu_000
 * Date: 09.09.13
 * Time: 22:22
 * To change this template use File | Settings | File Templates.
 */
public class myStack
{
    private Integer maxSize;
    private LinkedList<Integer> data;

    public myStack()
    {
        this.maxSize = 5;
        this.data = new LinkedList<Integer>();
    }

    public myStack(Integer maxSize)
    {
        this.maxSize = maxSize;
        this.data = new LinkedList<Integer>();
    }

    public void Push(Integer aValue)
    {
        if (data.size() < maxSize)
            data.push(aValue);
        else
            throw new IllegalStateException("stack overflow");
    }

    public Integer Pop()
    {
        if (data.isEmpty())
            throw new IllegalStateException("stack is empty");
        else
            return data.pop();
    }
}


public class Stack {
	int stack[];
	int top;
	int size;
	Stack(int size)	{
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	boolean isFull()	{
		if(top >= size-1)
			return true;
		return false;
	}
	boolean isEmpty()	{
		if(top < 0)	
			return true;
		return false;
	}
	void push(int element)	throws OverFlowException{
		if(this.isFull())	{
			throw new OverFlowException("Over Flow");
		}
		stack[++top] = element;
	}
	int pop()	throws UnderFlowException{
		if(this.isEmpty())	{
			throw new UnderFlowException("Under Flow");
		}
		return stack[top--];
	}
	void showStack()	{
		for(int i = 0; i <= top; i++)	{
			System.out.println(stack[i] + ",");
		}
	}
}

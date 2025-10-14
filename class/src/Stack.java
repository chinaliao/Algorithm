import java.util.EmptyStackException;

/**
 * ClassName:Stack
 * Description:
 */
public class Stack {
    private int[] data;
    private int top;
    public Stack(){
        data = new int[10];
        top = -1;
    }
    public boolean isEmpty(){
        return top ==-1;
    }
    public boolean isFull(){
        return top == data.length;
    }
    public void push(int e){
        if (isFull()) {
            int[] temp = new int[data.length*2];
            System.arraycopy(data,0,temp,0,top);
            data = temp;
        }
        data[++top] = e;
    }
    public int pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
            return data[top--];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        int num = 65;
        while (num>0) {
            stack.push(num%2);
            num/=2;
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
        }
    }
}

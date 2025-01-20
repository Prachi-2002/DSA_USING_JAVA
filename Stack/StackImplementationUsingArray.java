package Stack;

class Stack {

    int [] arr;
    int size ;
    int top ;

    Stack(int size){
        this.size=  size;
        this.top = -1;
        this.arr = new int [size];
    }

    public boolean isFull () {
        return top == size-1;
    }

    public void push(int data){
        if(isFull()){
            System.out.print("Stack overflow");
            return;
        }

        arr[++top] = data;
        System.out.println(top + "  Pushed element  " + data);

    }

    public int pop (){
        if(isEmpty()){
            return -1;
        }
      return arr[top--];
    }

    public int peek (){
        if(isEmpty()){
            return -1;
        }
        // int peekElement = arr[top];
        return arr[top];
    }

    public boolean isEmpty () {

        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    public int size(){
        return top +1;
    }

}

public class StackImplementationUsingArray {

    public static void main (String [] args){
        Stack stack = new Stack(5); // Create a stack with a capacity of 5

        // Perform stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());

        stack.pop();
        stack.pop();

        System.out.println("Stack size after popping: " + stack.size());
    }
}
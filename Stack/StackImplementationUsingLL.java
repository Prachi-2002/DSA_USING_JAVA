package Stack;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node (int data , Node next){
        this.data = data;
        this.next = next;
    }
}

class LLStack {
    Node head;

    public LLStack() {
        this.head = null;
    }

    public int push(int data){
        Node newNode =  new Node(data);
        if( head == null){
            this.head = newNode;
        }else{
            newNode.next = this.head;
            this.head = newNode;
        }
        return head.data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.print("Stack is empty");
            return -1;
        }
            int poppedData = head.data;
            this.head = this.head.next;
            return poppedData;
    }

    public int peek(){
        if(head == null){
            return -1;
        }
        else{
            return head.data;
        }
    } 

    public boolean isEmpty(){
        return head == null;
    }

}

public class StackImplementationUsingLL {
    public static void main(String[] args) {
        
        LLStack st = new LLStack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Top element: " + st.peek());
        st.pop();
        st.pop();
        System.out.println("Is stack empty? " + st.isEmpty());
        st.pop();
        System.out.println("Is stack empty? " + st.isEmpty());
    }
    
}
package Queue;

import java.util.LinkedList;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

class CustomQueue{
     LinkedList <Integer> ll;
     Node rear;
     Node front;
     int size;

    CustomQueue(){
        this.rear = null;
        this.front = null;
        this.size = 0;
        this.ll = new LinkedList<>();
    }

}

public class QueueUsingLinkedList {

    
}
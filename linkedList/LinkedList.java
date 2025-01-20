class Node {

    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    }
    Node (int data, Node next){
        this.data = data;
        this.next = next;
    }

}


class LinkedList {
    Node head;

    void addFirst(int data){

        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;

    }
    void addLast(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head= newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
             
        }
    }
    void addAt(int data, int pos){
        if(pos == 1 || head == null){
            addFirst(data);
        }
        else{
            Node newNode = new Node(data);
            Node temp = head;
            for(int i=1;i<pos-1;i++){
                if(temp == null){
                    return;
                }
                temp = temp.next;
            }
            if(temp != null){
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }
    void display(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next; 
        }
        System.out.println();
    }
    void printList (){
        Node currNode = this.head;
        while (currNode != null) {

            System.out.print(currNode.data+ " ");
            currNode = currNode.next;
            
        }

        System.out.println();
    }

    void removeFirst(){
        if(this.head == null){
            return;
        }
        this.head = this.head.next;
    }

    void removeLast(){
        if(this.head ==null){
            return;
        }
        if(this.head.next == null){
            this.head =  null;
            return;
            // return null;
        }
        Node temp = this.head;
        while(temp.next != null && temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    void removeAt(int pos){
        if(pos <= 0){
            return ;
        }
        if(head == null){
            return;
        }
        if(head.next == null){
            this.head = null;
        }
        Node temp = head;
        for(int i = 1;i< pos -1 ;i++){
            if(temp == null){
                return ;
            }
            temp= temp.next;
        }
        if(temp != null && temp.next != null){
            temp.next = temp.next.next;
        }

    }

    void getFirst(){
        if(head == null){
            return ;
        }
        else{
            System.out.println(this.head.data);
        }
    }
    void getLast(){
        if(head == null){
            return ;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    void getAt(int pos){

        if(pos <= 0){
            return ;
        }
        if(head  == null){
            return;
        }
        Node temp = head;

        for(int i= 0;i<pos-1;i++){
            if(temp== null){
                return;
            }
            temp = temp.next;
        }
        if(temp != null){
            System.out.println(temp.data);
        }
    }

    void kthFromLast(int pos){
        if(pos <= 0){
            return ;
        }
        if(head == null){
            return;
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            if(temp == null){
                return ;
            }
            temp = temp.next;
        }
        if(temp != null){
            System.out.println(temp.data);
        }
    }
}

 class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printList();
        ll.addAt(9, 7);
        ll.display();
        ll.removeFirst();
        ll.display();
        ll.removeLast();
        ll.removeAt(6);
        ll.display();
        // ll.getFirst();
        // ll.getLast();
        // ll.getAt(3);
        ll.kthFromLast(4);
    }

    
}
package ArrayList;

class UserDefinedArrayList{
    int arr[];
    int capacity;
    double threshhold = 0.7;
    int currentSize = 0;

    UserDefinedArrayList (int n){
        this.arr = new int[n];
        this.capacity = n;
    }

    UserDefinedArrayList (){
        this.arr = new int[10];
        this.capacity = 10;
    }

    void addElementInArrayList (int data){
        
        if((double)(currentSize/this.capacity)  > this.threshhold){
            
            int [] newArray = new int[2* this.capacity]; 
            this.capacity = 2 * this.capacity;
            
            for(int i=0;i< this.currentSize;i++){
                newArray[i] = this.arr[i];
            }
            newArray[currentSize] = data;
            this.arr = newArray;
            
        }else{
            this.arr[currentSize] = data;
        }
        this.currentSize++;

    }
}
public class ArrayListImplementation {

    public static void main(String[] args) {
        
        UserDefinedArrayList arrq = new UserDefinedArrayList();
        arrq.addElementInArrayList(4);
        arrq.addElementInArrayList(4);
        arrq.addElementInArrayList(4);
        arrq.addElementInArrayList(4);

        System.out.println(arrq);

    }
    

}
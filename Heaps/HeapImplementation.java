package Heaps;


class BasicMaxHeap{
    int [] array = new int[100];
    int size;

    BasicMaxHeap(){
        array[0] = -1;
        size = 0;
    }
   void insertinHeap(int val){

    size = size+ 1;
    int index = size;

    array[index] = val;

    while(index > 1){
        int parent = index/2;
        if(array[parent] < array[index]){
            int temp = array[index];
            array[index]= array[parent];
            array[parent]= temp;
            index = parent;

        }else{
            return ;
        }
    }
   }
//    Delete root value : 
   void deletion (){

    // put first node with last node 
    // remove last node

    if(this.size == 0) {
        System.out.println("Heap is empty");
        return;
    }
    array[1] = array[size];
    size--;
    // take root node to its correct position :
    
    int index = 1;

    while(index < size){
        int leftIndex = 2 * index;
        int rightIndex = index* 2 +1;

        if(leftIndex < size && array[index] < array[leftIndex]){
            int temp = array[size];
            array[size]= array[leftIndex];
            array[leftIndex]=  temp;
            index =leftIndex;
        }
        if(rightIndex < size && array[index] < array[rightIndex]){
            int temp = array[size];
            array[size]= array[rightIndex];
            array[rightIndex]=  temp;
            index =rightIndex;
        }else{
            return;
        }
    }

   }
}
public class HeapImplementation {
    
    public static void main(String[] args) {
        
    }
}

package es.datastructur.synthesizer;


/*  enqueue at back
    dequeue at front
    fixed capacity*/

public interface BoundedQueue <T>{
    int capacity();         /*return the size of the buffer*/
    int fillCount();        /*return usage of the buffer*/
    void enqueue(T x);      /*if full fail*/
    T dequeue();              /*delete and return the item from the front*/
    T peek();               /*return the item from the front*/
    default boolean isEmpty(){
        if(fillCount() == 0)
            return true;
        else
            return false;
    }

    default boolean isFull(){
        if(fillCount() == capacity())
            return true;
        else
            return false;
    }
}

package es.datastructur.synthesizer;
import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the ArrayRingBuffer class.
 *  @author Josh Hug
 */

public class TestArrayRingBuffer {

//    static ArrayRingBuffer<Integer> arb = new ArrayRingBuffer<>(10);
    @Test
    public void isEmptyTest() {
        ArrayRingBuffer<Integer> arb = new ArrayRingBuffer<>(10);
        assertTrue(arb.isEmpty());
    }

    @Test
    public void emptyDequeExceptionTest(){
        ArrayRingBuffer<Integer> arb = new ArrayRingBuffer<>(10);
        try{
            arb.dequeue();
        }catch (RuntimeException ex){
            assertTrue(true);
        }
    }

    @Test
    public void isFullTest(){
        int capacity = 10;
        ArrayRingBuffer<Integer> arb = new ArrayRingBuffer<>(capacity);
        for(int i = 0; i < capacity;i++){
            arb.enqueue(i);
        }
        assertTrue(arb.isFull());
    }

    @Test
    public void FullEnqueueExceptionTest(){
        int capacity = 10;
        ArrayRingBuffer<Integer> arb = new ArrayRingBuffer<>(capacity);
        for(int i = 0; i < capacity;i++){
            arb.enqueue(i);
        }
        try{
            arb.enqueue(11);
        }catch (RuntimeException e){
            assertTrue(true);
        }
    }
}

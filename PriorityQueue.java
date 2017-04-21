// Team Mexico City: Jasper Cheung, Kelly Wang, Jake Zaia
// APCS2 p1
// LAB #03: RUVIP?
// 2017-04-24

public interface PriorityQueue<T> {

    //Adds an item to this priority queue.
    public void add(T x);
    
    //Returns true if this stack is empty, otherwise returns false.
    public boolean isEmpty();
    
    //Returns the smallest item stored in this priority queue without removing it.
    public T peekMin();
 
    //Removes and returns the smallest item stored in this priority queue.
    public T removeMin();
    
}

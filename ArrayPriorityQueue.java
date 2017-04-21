// Team Mexico City: Jasper Cheung, Kelly Wang, Jake Zaia
// APCS2 p1
// LAB #03: RUVIP?
// 2017-04-24

import java.util.ArrayList;

public class ArrayPriorityQueue<T> implements PriorityQueue<T> {
    ArrayList<T> _data;

    public ArrayPriorityQueue(){
	_data = new ArrayList<T>();
    }

    //Adds an item to this priority queue. Type MUST be Comparable
    public void add(T x){
	if (isEmpty())
	    _data.add(x);
	else {
	    int i = 0;
	    while (i < _data.size()){
		if (((Comparable) _data.get(i)).compareTo((Comparable) x) < 0){
		    _data.add(i,x);
		    return;
		}
		i++;
	    }
	    _data.add(x);
	} 
    }
    
    //Returns true if this stack is empty, otherwise returns false.
    public boolean isEmpty(){
	return _data.size() == 0;
    }
    
    //Returns the smallest item stored in this priority queue without removing it.
    public T peekMin(){
	return _data.get(_data.size() - 1);
    }
 
    //Removes and returns the smallest item stored in this priority queue.
    public T removeMin(){
	return _data.remove(_data.size() - 1);
    }
    
    public static void main(String [] args){
	ArrayPriorityQueue<Integer> printer = new ArrayPriorityQueue<>();
	printer.add(1);
	printer.add(2);
	printer.add(3);
	printer.add(2);
	printer.add(1);
	while (! printer.isEmpty()) {
	    System.out.println(printer.removeMin());
	}
    }

}

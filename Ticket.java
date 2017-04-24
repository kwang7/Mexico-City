// Team Mexico City: Jasper Cheung, Kelly Wang, Jake Zaia
// APCS2 p1
// LAB #03: RUVIP?
// 2017-04-24

public class Ticket implements Comparable {

    private int _priority;
    private final int _ID;
    private String _userName;
    private String _desc;

    public Ticket(String userName, String desc, int ID, int priority  ){
	_userName = userName;
	_desc = desc;
	_ID = ID;
	_priority = priority; 
    }
    
    public int compareTo( Object t ) {
	if (t instanceof Ticket) 
	    return _priority - ((Ticket)t)._priority;
	else throw new ClassCastException();
    }

    public String toString(){
	String ret = "";
	ret+= _ID + ": " + _userName + "\n\n";
	ret+= _desc;
	return ret;
    }

    
    //accessors 
    public int getPriority(){ return _priority; }
    public int getID(){ return _ID; }
    public String getUserName(){ return _userName; } 
    public String getDesc(){ return _desc; }

    //mutators
    public int setPriority(int priority){
	int ret = _priority;
	_priority = priority;
	return ret; }
    public String setUserName(String name){
	String ret = _userName;
	_userName = name;
	return ret; }
    public String setDesc(String desc){
	String ret = _desc;
	_desc = desc;    
	return ret; }

    public static void main(String [] args){
	Ticket t = new Ticket("Tic Ket", "My name sounds like KitKat", 1337420, 0);
	System.out.println(t);
    }
}

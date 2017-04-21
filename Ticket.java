public class Ticket implements Comparable {

    private int _priority;
    private int _ID;
    private String _userName;
    private String _desc;

    public Ticket(String userName, String desc, int ID, int priority  ){
	_userName = userName;
	_desc = desc;
	_ID = ID;
	_priority = priority; 
    }
    public int compareTo( Ticket it ){
	return this._priority - it._priority; 
    }
    //accessors 
    public int getPriority(){
	return _priority;
    }
    public int getID(){
	return _ID;
    }
    public String getUserName(){
	return _userName;
    }
 
    public String getDesc(){
	return _desc;
    }
    ///FINiSHed!
    //mutators
    public int setPriority(int jasper){
	int ret = _priority;
	_priority = jasper;
	return ret;
    }
    public String setUserName(String jasper){
	String ret = _userName;
	_userName = jasper;
	return ret;
    }
    public String setDesc(String jasper){
	String ret = _desc;
	_desc = jasper;    
	return ret;
    }

}

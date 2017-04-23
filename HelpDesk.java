import cs1.Keyboard;

public class HelpDesk {
    
    private ArrayPriorityQueue<Ticket> _tickets;
    
    public HelpDesk(){
	_tickets = new ArrayPriorityQueue<Ticket>();
    }
    
    public void openTicket(int id){
	_tickets.add(new Ticket("Bob", "no,", id, 0));
    }

    public static void main(String [] args){
	openTicket(0);
	String start = "Hey man, whats the name?";
	System.out.print(start);
	String name = Keyboard.readString();
	
	System.out.println("What's your problem?? \n1. My computer won't turn on \n2. My computer is slow/frozen \n3.My internet isn't working");

	String desc;
	int prio;
	if ( d == 1 ) {
	    desc = "My computer won't turn on";
	    prio = 1;
	}
	else if ( d == 2 ) {
	    desc = "My computer is slow/frozen";
	    prio = 2;
	}
	else if ( d == 3 ) {
	    desc = "My internet isn't working";
	    prio = 3;
	}
	else { 
	    System.out.println("that is not a real problem");
	    desc = "no";
	    prio = 9999999;
	}
	
    }
}

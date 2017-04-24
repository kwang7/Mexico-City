/*
  Team Mexico City: Kelly Wang, Jake Zaia, Jasper Cheung
  APCS1 pd1
  LAB #03: RUVIP?
  2017-04-24
*/

import cs1.Keyboard;

public class HelpDesk {
    
    private static ArrayPriorityQueue<Ticket> _tickets;
    private static int _count = 0;
    
    public HelpDesk(){
	_tickets = new ArrayPriorityQueue<Ticket>();
    }

    //keep track of ID nums
    public void counter() {
	_count++;
    }
    
    public static void openTicket(){
	
	String start = "HELLO WHAT IS YOUR NAME";
	System.out.print(start);
	String name = Keyboard.readString();
	
	System.out.println("HELLO WHAT IS YOUR PROBLEM?? \n1. My computer won't turn on \n2. My computer is slow/frozen \n3.My internet isn't working");
	int d = Keyboard.readInt();
	String desc;
	int prio;
	if (  d == 1 ) {
	    desc = "I can't turn on my computer";
	    prio = 1;
	}
	else if ( d == 2 ) {
	    desc = "My computer is frozen";
	    prio = 2;
	}
	else if ( d == 3 ) {
	    desc = "My internet isn't working";
	    prio = 3;
	}
	else { 
	    System.out.println("SHUT UP! that is not a real problem. don't come asking for our help next time you need us.");
	    desc = "no";
	    prio = 9999999;
	}
	System.out.println("OK, " + name + " NOW WE WILL HELP YOU.");
	_tickets.add(new Ticket(name, desc, _count, prio));
    }

    public void close(){
	Ticket kelly = _tickets.removeMin();
	if ( (kelly.getDesc()).equals("I can't turn on my computer" )) {
	    System.out.println("Oh dear, " + kelly.getUserName() + ". I know how that feels. It happened with my first wife back in 2009. Sometimes, the love that you have just dies. Maybe seek marriage counseling instead?");
	}
	else if ( (kelly.getDesc()).equals("My computer is frozen" )) {
	    System.out.println("Try removing it from the freezer, " + kelly.getUserName() + "! If you let it thaw out, it'll be like it was never there!");
	}
	else if ( (kelly.getDesc()).equals("My internet isn't working") ) {
	    System.out.println("Silly " + kelly.getUserName() + "!. That only happens if you forget to pay your bill. Register for a free Bank of America account to set up monthly payments to your internet company!");
	}
	else if ( (kelly.getDesc()).equals("no")) {
	    System.out.println("you FOOL! thanks for wasting our time with your INVALID PROBLEM. THIS IS WHY nobody likes to work in customer service. Whoever came up with that saying about the customer always being right was probably some imbecile like you.");
	}
    }
    
    public static void main(String [] args){
	openTicket();
	openTicket();
    }
}

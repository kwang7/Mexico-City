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
    }
}

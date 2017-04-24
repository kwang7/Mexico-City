# Mexico-City
## Help Desk
### Kelly Wang, Jake Zaia, Jasper Cheung

### Design 
  Help Desk conists of 3 files: an ArrayPriorityQueue, Ticket, and HelpDesk. 
  
  HelpDesk is the driver file. In HelpDesk an ArrayPriorityQueue is the underlying data structure to simulate how a real life help desk would answer to issues, taking priority into account. While running it utlizes keyboard to take in user inputs and open tickets. Opening a ticket would instantite Ticket and would add it to an ArrayPriorityQueue according to its priority. 
  
  Each instance of Ticket would have variables like username, id, description of the issue, and a priority. CompareTo() is overwritten so when you are comparing tickets it compares the priority. 
  
  When a user first opens a ticket, they will input their name then select their problem from a list. If they enter anything that isn't on the list, the program will not help them. 
  



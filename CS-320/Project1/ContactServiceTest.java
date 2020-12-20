public class ContactServiceTest 
{
	 public static void main(String[] args) throws InvalidCheck 
	 {
	       //add user
		   Contact contact1 = new Contact("1","Tyler","Bullock","7278675309","Florida");
	       //use contact service to edit added user
		   ContactService contactService = new ContactService();
	      
		   //print results to verify
	       System.out.println(contactService.addContact(contact1));
	       System.out.println(contactService.updateContact("1","Tyler","Bullock","7278675309","Florida"));
	       System.out.println(contactService.deleteContact("1"));
	   }
}

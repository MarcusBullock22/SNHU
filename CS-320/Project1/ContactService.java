import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactService 
{
//setting unique id's to store up to 10,000 values.
   private static int uniqueId=10000;
   private static Map<Integer, Contact> contacts = new HashMap<>();

 //creating map object so that we can insert and delete or even update contact information as needed.
   public Map<Integer, Contact> addContact(Contact contact) 
   {
       uniqueId++;
       contacts.put(uniqueId, contact);
       return contacts;
   }
  

   public Map<Integer, Contact> deleteContact(String contactID) 
   {

       Iterator itr = contacts.entrySet().iterator();

       while (itr.hasNext()) 
       {
           Map.Entry<Integer, Contact> entry = (Map.Entry<Integer, Contact>) itr.next();
           if (entry.getValue().getContactID() == contactID) 
           {
               itr.remove();
           }
       }

       return contacts;

   }
  
   public Map<Integer, Contact> updateContact(String contactID, String firstName, String lastName, String number,
           String address) 
   {

       Iterator itr = contacts.entrySet().iterator();

       while (itr.hasNext()) 
       {
           Map.Entry<Integer, Contact> entry = (Map.Entry<Integer, Contact>) itr.next();

           if (entry.getValue().getContactID() == contactID)
           {
               entry.getValue().setFirstName(firstName);
               entry.getValue().setLastName(lastName);
               entry.getValue().setPhone(number);
               entry.getValue().setAddress(address);
           }

       }

       return contacts;

   }
}
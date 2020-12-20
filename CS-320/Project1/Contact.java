public class Contact 
{

   private String contactID;
   private String firstName;
   private String lastName;
   private String phone;
   private String address;

   public Contact(String contactID,String firstName,String lastName,String phone,String address) throws InvalidCheck
   {
       if(isValidInput(contactID))
       {
           this.contactID=contactID;
       }
       else
       {
           throw new InvalidCheck(contactID);
       }
       if(isValidInput(firstName))
       {
           this.firstName=firstName;
       }
       else
       {
           throw new InvalidCheck(firstName);
       }
       if(isValidInput(lastName))
       {
           this.lastName=lastName;
       }
       else
       {
           throw new InvalidCheck(lastName);
       }
      
       if(phone!=null&&phone.length()==10)
       {
           this.phone=phone;
       }
       else
       {
           throw new InvalidCheck(phone);
       }
       if(address!=null&&address.length()<=30)
       {
           this.address=address;
       }
       else
       {
           throw new InvalidCheck(address);
       }
      
   }

   //validate lengths of each inputted variable
   private boolean isValidInput(String input) 
   {
	      
       return input!=null&&input.length()<=10;
      
   }

   
   //begin grabbing variables from user
   public String getFirstName() 
   {
       return firstName;
   }
   
   public void setFirstName(String firstName) 
   {
       this.firstName = firstName;
   }
   
   public String getLastName() 
   {
       return lastName;
   }
   
   public void setLastName(String lastName) 
   {
       this.lastName = lastName;
   }

   public String getPhone() 
   {
       return phone;
   }
   
   public void setPhone(String phone) 
   {
       this.phone = phone;
   }
  

   public String getAddress() 
   {
       return address;
   }
   public void setAddress(String address) 
   {
       this.address = address;
   }
  

   public String getContactID() 
   {
       return contactID;
   }
  
   //return all gathered information into 1 string.
   public String toString()
   {
       return "["+contactID+","+firstName+","+lastName+","+phone+","+address+"]";
   }
  

}

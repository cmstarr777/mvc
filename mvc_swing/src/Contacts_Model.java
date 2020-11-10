import java.util.ArrayList;

//package mvc_demo;

public class Contacts_Model implements Comparable <Contacts_Model> {
		
	    private String firstname;
	    private String lastname;
	    private String homeaddr;
	    private String phonenumber;
	    private int id;
	    
	    Contacts_Model (String firstName, String lastName, String homeAddr, String phoneNumber )
	    {
	    	this.firstname = firstName;
	    	this.lastname = lastName;
	    	this.homeaddr = homeAddr;
	    	this.phonenumber = phoneNumber;
	    }
	    
	    Contacts_Model () 
	    {
	    	this.firstname = "firstName";
	    	this.lastname = "lastName";
	    	this.homeaddr = "homeAddr";
	    	this.phonenumber = "phoneNumber";
	    }
	       
	       
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getFirstname() {
	        return firstname;
	    }
	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }
	    public String getLastname() {
	        return lastname;
	    }
	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }
	    public String gethomeAddress() {
	        return homeaddr;
	    }
	    public void sethomeAddress(String homeAddr) {
	        this.homeaddr = homeAddr;
	    }
	    public String getphoneNumber() {
	        return phonenumber;
	    }
	    public void setphoneNumber(String phoneNumber) {
	        this.phonenumber = phoneNumber;
	    }
	      
	    @Override
	    public int compareTo(Contacts_Model other)
	    {
	      return this.firstname.compareTo(other.firstname);
	    }
	    
	    public static ArrayList<Contacts_Model> sortContacts( ArrayList<Contacts_Model> contacts)
	    {
	    	Contacts_Model tempContact= new Contacts_Model();
		 
			 int size = contacts.size(); 
	 
			 if (contacts.size()>1)
			 {
				for(int i = 0; i<size-1; i++)   
				{ 
					
					for (int j = i+1; j<contacts.size(); j++)   
					{  
						//compares each elements of the array to all the remaining elements  
						int result =contacts.get(i).getFirstname().compareTo(contacts.get(j).getFirstname());
						System.out.println("result: " + result );
						if(result>=1)   
						{  
							//swapping array elements
							tempContact = contacts.get(i); 
							contacts.set(i,contacts.get(j));
							contacts.set(j,tempContact);							
						}  
					}  
				} 
			 }   	
	    	 return contacts;
	    }
	 
	    public static ArrayList<Contacts_Model> contactsRemoveDups( ArrayList<Contacts_Model> contacts)
	    {			 
	    	int size = contacts.size();
	    	 for(int i = 0; i<size-1; i++)   
			 { 
					
				for (int j = i+1; j<contacts.size(); j++)   
				{  
					//compares each elements string value to all the remaining elements string values  

					int result0 =contacts.get(i).getFirstname().compareTo(contacts.get(j).getFirstname());
					System.out.println("result0: " + result0 );
					int result1 =contacts.get(i).getLastname().compareTo(contacts.get(j).getLastname());
					System.out.println("result1: " + result1 );
					int result2 =contacts.get(i).gethomeAddress().compareTo(contacts.get(j).gethomeAddress());
					System.out.println("result2: " + result2 );
					int result3 =contacts.get(i).getphoneNumber().compareTo(contacts.get(j).getphoneNumber());
					System.out.println("resul3t: " + result3 );
					if(result0==0 && result1==0 && result2==0 && result3==0)   
					{  
						//Remove duplicate element						
						contacts.remove(j); ;							
					} 
				}  
			}
	    	 return contacts;
	    }	
}

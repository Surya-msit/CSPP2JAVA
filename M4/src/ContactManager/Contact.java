/**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar
 */

//  Your code goes here... For Contact class
package ContactManager;
class Contact {
	private String Name;
	private String Email;
	private String PhoneNumber;
 //cons
	public Contact(String n,String e,String p) {
		Name=n;
		Email=e;
		PhoneNumber=p;
	
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String toString()
	{
		return "{ Name ="+Name+", Email = "+Email+ ", PhoneNumber= "+PhoneNumber+" }";
	}

}
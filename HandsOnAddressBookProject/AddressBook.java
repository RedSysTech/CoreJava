package HandsOnAddressBookProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AddressBook {

	private String addrBookName;
	private String addrBookType;
	
	private ArrayList<Contact>  myAddrBook;
	
	AddressBook(){
		
	}
	
	public AddressBook(String addrBookName, String addrBookType) {
		super();
		this.addrBookName = addrBookName;
		this.addrBookType = addrBookType;
		this.myAddrBook = new ArrayList<Contact>();
	}

	public String getAddrBookName() {
		return addrBookName;
	}

	public void setAddrBookName(String addrBookName) {
		this.addrBookName = addrBookName;
	}

	public String getAddrBookType() {
		return addrBookType;
	}

	public void setAddrBookType(String addrBookType) {
		this.addrBookType = addrBookType;
	}
	
	
	//add contact to the address book
	public List addContact(String name, String address, int phoneNumb){
		
		if(searchContact(phoneNumb) == null) {
			System.out.println("Adding the new contact");
			this.myAddrBook.add(new Contact(name, phoneNumb, address));
		}
		else {
			System.out.println("this phone number already exists!!");
			return null;
		}
		return myAddrBook;
	}
	
	//search contact in the address book
		public Contact searchContact(int phoneNumb)
		{
			for(Contact c:myAddrBook) {
				
				if(c.getPhoneNumber() == phoneNumb)
				{
					return c;
				}
			}
			return null;
		}
	
	
		//update the existing contact details to the address book
		public List updateContact(Contact c,String name, String address, int phoneNumb) {
			if(searchContact(c.getPhoneNumber())!=null)
			{
				System.out.println("updating the contact now....");
				Contact existingContact = searchContact(c.getPhoneNumber());
				existingContact.setName(name);
				existingContact.setAddress(address);
				existingContact.setPhoneNumber(phoneNumb);
				return myAddrBook;
			}
			return null;
		}
		
		//read all the contacts from the address book
		public List readContacts() {
			return this.myAddrBook;
		}
		
		//delete a contact from the address book
		public List deleteContact(int phoneNumb) {
			if(searchContact(phoneNumb)!=null) {
				Contact existingContact = searchContact(phoneNumb);
				this.myAddrBook.remove(existingContact);
			}
			return null;
		}
		
		
		//sort the contacts in the address book by Name ASC - jdk 1.7 version
		public List sortAddressBookByNameASC() {
			if(this.myAddrBook.size()>0) {
				Collections.sort(myAddrBook,new MyASCComparator());
			}
			return null;
		}
		
		//sort the contacts in the address book by Name DESC - jdk 1.8 Lambda
		public List sortAddressBookByNameDESC() {
			if(this.myAddrBook.size()>0) {
				Collections.sort(myAddrBook,(Object addingObj, Object existingObj) -> {
					Contact addingContact = (Contact) addingObj;
					Contact existingContact = (Contact) existingObj;
					return - addingContact.getName().compareTo(existingContact.getName());
				});
			}
			return null;
		}
}

class MyASCComparator implements Comparator{

	@Override
	public int compare(Object addingObj, Object existingObj) {
		Contact addingContact = (Contact) addingObj;
		Contact existingContact = (Contact) existingObj;
		return addingContact.getName().compareTo(existingContact.getName());
	}
	
}

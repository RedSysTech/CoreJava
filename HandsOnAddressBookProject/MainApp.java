package HandsOnAddressBookProject;

/*
 * Address book - Create
 * 				  Read
 * 				  Update
 * 				  Delete
 * 				  Sort
 */
public class MainApp {

	public static void main(String[] args) {
		
		/*
		 * addOperation()
		 * updateOperation()
		 * listOperation()
		 * deleteOperation()
		 * sortOperation()
		 */
		
		 AddressBook ab = null;
		 ab= addOperation();
		 ab=updateOperation(ab);
		 listOperation(ab);
		 ab = deleteOperation(ab);
		 ab = sortByNameASCOperation(ab);
		 ab = sortByNameDESCOperation(ab);
		
	}
	
	public static AddressBook addOperation() {
		// create an addressbook
				AddressBook ab1 = new AddressBook("book1", "Personal");
				ab1.addContact("Karthik", "123 S Road, IL", 111);
				ab1.addContact("Jai", "456 S Road, IL", 222);
				ab1.addContact("Kumar", "456 S Road, IL", 333);
				ab1.addContact("Satish", "456 S Road, IL", 444);
				ab1.addContact("Raja", "456 S Road, IL", 555);
				
				ab1.readContacts().stream().forEachOrdered((i) -> System.out.println(i));
				return ab1;
	}
	
	public static AddressBook updateOperation(AddressBook ab1) {
		System.out.println("=========================");
		Contact c = null;
		try {
			c = ab1.searchContact(0);
		}
		catch(Exception ex) {
			System.out.println("exception happened here: "+ex.getMessage());
		}
		
		if(c!=null)
		ab1.updateContact(c, "San", "789 S Road, IL", 999);
		
		ab1.readContacts().stream().forEachOrdered((i) -> System.out.println(i));
		return ab1;
	}
	
	public static void listOperation(AddressBook ab) {
		ab.readContacts().stream().forEachOrdered((i) -> System.out.println(i));
	}
	
	public static AddressBook deleteOperation(AddressBook ab1) {
		System.out.println("=========================");
		
		ab1.deleteContact(222);
		ab1.readContacts().stream().forEachOrdered((i) -> System.out.println(i));
		return ab1;
	}

	public static AddressBook sortByNameASCOperation(AddressBook ab1) {
		ab1.sortAddressBookByNameASC();
		System.out.println("=========ASC ORDER================");
		ab1.readContacts().stream().forEachOrdered((i) -> System.out.println(i));
		return ab1;
	}
	
	public static AddressBook sortByNameDESCOperation(AddressBook ab1) {
		System.out.println("=========DESC ORDER================");
		ab1.sortAddressBookByNameDESC();
		ab1.readContacts().stream().forEachOrdered(System.out::println);
		return ab1;
	}
}



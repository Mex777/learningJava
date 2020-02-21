package ArrayLists;;
import java.util.ArrayList;

public class cellphone {
    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    public void printContacts() {
        for (int i=0; i<contacts.size(); i++) {
            String name = contacts.get(i).getName();
            System.out.println((i+1)+ "." + name);
        }
    }

    public void addContact(String name, long phoneNum) {
//        if(!checkName(name)) {

            contacts.add(new Contacts(name, phoneNum));
            System.out.println("Contact added.");
//        }
//       else
//            System.out.println("There's a contact with this name already");
    }
    public void removeContact (String name) {
        if(checkName(name))
            contacts.remove(searchMame(name));

    }
    private boolean checkValidity(Contacts contact) {
       return contacts.contains(contact);
    }
    private boolean checkName(String name) {
        for (int i=0; i<contacts.size(); i++) {
            Contacts contact = contacts.get(i);
            if (contact.getName().equals(name))
                return true;
        }
        return false;
    }
    public void modifyName(String name, String newName) {
        if (checkName(name))
            contacts.get(searchMame(name)).setName(newName);
        else
            System.out.println("Invalid name");
    }
    private int getNumber(Contacts contact) {
        int number = contacts.indexOf(contact);
        return number;
    }
    private int searchMame(String name) {
      for (int i=0; i<contacts.size(); i++) {
          Contacts contact = contacts.get(i);
          if (contact.getName().equals(name))
              return i;
      }
      return -1;
    }
}

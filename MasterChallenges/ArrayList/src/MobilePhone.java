import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContact;

    public MobilePhone() {
        this.myContact = new ArrayList<Contact>();
    }

    public ArrayList<Contact> getMyContact() {
        return myContact;
    }

    public void printContacts() {
        for (int i = 0; i < myContact.size(); i++) {
            System.out.println((i + 1) + ". " + myContact.get(i).getName() + " (" + myContact.get(i).getNumber() + ")");
        }
    }

    public boolean addContact(Contact contact) {
        if (checkContactExist(contact) < 0) {
            myContact.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact currentContact, Contact newContact) {
        int position = myContact.indexOf(currentContact);
        if (position >= 0) {
            myContact.set(position, newContact);
            return true;
        }

        return false;
    }


    public boolean removeContact(int position) {
        position -= 1;

        if (position < myContact.size()) {
            myContact.remove(position);
            return true;
        }
        return false;
    }

    public int checkContactExist(Contact contact) {
        return myContact.indexOf(contact);
    }

    public Contact checkContactNameExist(String name) {
        for (int i = 0; i < myContact.size(); i++) {
            if (myContact.get(i).getName().equals(name)) {
                return myContact.get(i);
            }
        }
        return null;
    }

}

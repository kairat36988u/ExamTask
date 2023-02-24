public class Main {
    public static void main(String[] args) {
        while (true) {
            Contact contact1 = new Contact(777447744, "Kairat");
            Contact contact2 = new Contact(555714666, "Eldan");

            Contact[] contacts = {contact1, contact2};


            Phone phone = new Phone("Iphone", "Ipone xs", 2244);
            phone.turnOn(phone.getParol());
            phone.call(contact1.getFullName(), contact1.getPhoneNumber());
            phone.call(contact1.getPhoneNumber(), contact1.getFullName());
            phone.searchContact(contacts);
            phone.updateName(contact1.getFullName());
            phone.getAllContacts(contacts);
            System.out.println();
            System.out.println(phone);
        }
    }
}
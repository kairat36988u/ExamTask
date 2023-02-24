public interface PhoneInterface {
     void turnOn ( int parol);
     void call (String  fullName, int phoneNumber);
     void call(int phoneNumber,String fullName );
     void searchContact(Contact [] contacts);
     void updateName(String fullName);
     void getAllContacts(Contact [] contacts);

}

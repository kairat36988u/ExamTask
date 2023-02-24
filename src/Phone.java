import java.util.Arrays;
import java.util.Scanner;

public class Phone  implements PhoneInterface   {
    private String brand;
    private String name;
    private int parol ;
    private Contact [] contacts;

    public Phone(String brand, String name, int parol) {

        this.brand = brand;
        this.name = name;
        this.parol = parol;


    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParol() {
        return parol;
    }

    public void setParol(int parol) {
        this.parol = parol;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    Scanner sc =new Scanner(System.in);
    @Override
    public void turnOn(int parol) {



        System.out.println("paroldu jazygiz ");

        int par=sc.nextInt();
        if (par==parol){
            System.out.println("telefon jandy ");
            System.out.println();
        }else System.out.println("parol kata ");

    }

    @Override
    public void call(String fullName, int phoneNumber) {
        System.out.println("phoneNumber berigiz");
        int nomer = sc.nextInt();;
        if (nomer==phoneNumber){
            System.out.println(fullName+"{ "+phoneNumber+"}");
            System.out.println();
        }else System.out.println("myndai nomer jok ");

    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void call(int phoneNumber, String fullName) {
        System.out.println("Name berigiz");

        String name = scanner.nextLine();
        if (name.equals(fullName)){
            System.out.println(phoneNumber+"{ "+fullName+"}");
            System.out.println();
        }else System.out.println("myndai cantakt jok ");
    }

    @Override
    public void searchContact(Contact[] contacts) {
        System.out.println("Contaktyn Atynyn jazsagiz ");
        String con =scanner.nextLine();
        for (Contact d:contacts) {
            if (con.equals(d.getFullName())){
                System.out.println(d);
                System.out.println();
                break;
            }else System.out.println(" myndai cantakt jok ");
        }

    }

    @Override
    public void updateName(String fullName) {
        System.out.println("Jady Name berigiz");
        fullName =scanner.nextLine();
        System.out.println(fullName);
        System.out.println();
    }

    @Override
    public void getAllContacts(Contact[] contacts) {
        System.out.println(" Contact \n");
        for (Contact s:contacts) {
            System.out.println(s);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", parol=" + parol +
                ", contacts=" + Arrays.toString(contacts) +
                ", sc=" + sc +
                ", scanner=" + scanner +
                '}';
    }
}

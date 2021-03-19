package Model.data;

public class Teacher {

    private int id;
    private String prefix;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;

    public Teacher(int id, String prefix, String name, String surname, Group group, String phoneNumber, String email, Address address, BankInfo bankInfo) {
        this.id = id;
        this.prefix = prefix;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString(){
        return prefix + " " +
                name + " " +
                surname + " " +
                phoneNumber + " " +
                email;
    }
}

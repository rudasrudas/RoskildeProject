package build.Model.data;

public class Parent {
    private int id;
    private String prefix;
    private String name;
    private String surname;
    private String relationship;
    private String phoneNumber;
    private String email;
    private Address address;

    public Parent(int id,
                  String prefix,
                  String name,
                  String surname,
                  String relationship,
                  String phoneNumber,
                  String email,
                  Address address) {
        this.id = id;
        this.prefix = prefix;
        this.name = name;
        this.surname = surname;
        this.relationship = relationship;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String toString(){
        return prefix + ". " +
                name + " " +
                surname + " (" +
                relationship + ") " +
                phoneNumber + " " +
                email;
    }
    public int getId(){
        return id;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }
}
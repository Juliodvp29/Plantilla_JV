package class_;

public abstract class Persona {
    private String name;
    private String surname;
    private String documet;
    private String phoneNumber;


    public Persona() {

    }


    public Persona(String name, String surname, String documet, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.documet = documet;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDocumet() {
        return documet;
    }

    public void setDocumet(String documet) {
        this.documet = documet;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Persona{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", documet='" + documet + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    Person(){
        name = "";
        address = "";
        phone = "";
        email = "";
    }

    public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public String toString(){
        return  "Name : " + name + 
                "\nAddress : " + address + 
                "\nPhone number : " + phone + 
                "\nEmail address : " + email +
                "\nperson{Name=" + name + ", Address=" + address + ", phoneNumber=" + phone + ", email=" + email + "}";
    }
}

package Practice;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;


    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public void setZipCode(String zipCode) {
//        this.zipCode = zipCode;z
//    }

    @Override
    public String toString(){
        return street+','+city+','+state+','+zipCode;
    }

}

package Filehandling2;

public class Address {
    private String flat_no;
    private String state;
    private String city;
    public String getFlat_no() {
        return flat_no;
    }
    public void setFlat_no(String flat_no) {
        this.flat_no = flat_no;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "Address [flat_no=" + flat_no + ", state=" + state + ", city=" + city + "]";
    }
    public String getCity() {
        return city;
    }
    public Address(String flat_no, String state, String city) {
        this.flat_no = flat_no;
        this.state = state;
        this.city = city;
    }
    public Address() {
    }
    public void setCity(String city) {
        this.city = city;
    }
    
}

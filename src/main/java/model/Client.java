package model;

public class Client {
    private Integer id, addressNumber;
    private String address, location;

    public Client(Integer id, Integer addressNumber, String address, String location) {
        this.id = id;
        this.addressNumber = addressNumber;
        this.address = address;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(Integer addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", addressNumber=" + addressNumber +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

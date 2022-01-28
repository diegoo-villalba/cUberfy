package dto;

public class DriverDTO {

    private String name, lastName;
    private Integer license;
    private Integer daysWorking;

    public DriverDTO(String name, String lastName, Integer license, Integer daysWorking) {
        this.name = name;
        this.lastName = lastName;
        this.license = license;
        this.daysWorking = daysWorking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getLicense() {
        return license;
    }

    public void setLicense(Integer license) {
        this.license = license;
    }

    public Integer getDaysWorking() {
        return daysWorking;
    }

    public void setDaysWorking(Integer daysWorking) {
        this.daysWorking = daysWorking;
    }
}

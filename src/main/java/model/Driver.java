package model;

public class Driver {
    private String name, lastName, email;
    private Integer license, dateOfAdmission, departureDate;
    private Integer daysWorking;

    public Driver(String name, String lastName, String email, Integer license, Integer dateOfAdmission, Integer departureDate, Integer daysWorking) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.license = license;
        this.dateOfAdmission = dateOfAdmission;
        this.departureDate = departureDate;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLicense() {
        return license;
    }

    public void setLicense(Integer license) {
        this.license = license;
    }

    public Integer getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Integer dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public Integer getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Integer departureDate) {
        this.departureDate = departureDate;
    }

    public Integer getDaysWorking() {
        return daysWorking;
    }

    public void setDaysWorking(Integer daysWorking) {
        this.daysWorking = daysWorking;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", license=" + license +
                ", dateOfAdmission=" + dateOfAdmission +
                ", departureDate=" + departureDate +
                ", daysWorking=" + daysWorking +
                '}';
    }
}

package ua.mk.essur.practicetask.weblogic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driverId", nullable = false)
    private Integer id;

    @Column(name = "driverFullName", length = 45)
    private String driverFullName;

    @Column(name = "carName", length = 45)
    private String carName;

    @Column(name = "carNumber", length = 45)
    private String carNumber;

    @Column(name = "numberOfDriverDocuments", length = 45)
    private String numberOfDriverDocuments;

    @Column(name = "company", length = 45)
    private String company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDriverFullName() {
        return driverFullName;
    }

    public void setDriverFullName(String driverFullName) {
        this.driverFullName = driverFullName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getNumberOfDriverDocuments() {
        return numberOfDriverDocuments;
    }

    public void setNumberOfDriverDocuments(String numberOfDriverDocuments) {
        this.numberOfDriverDocuments = numberOfDriverDocuments;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
package ua.mk.essur.practicetask.weblogic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "dispatcher")
public class Dispatcher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dispatcherId", nullable = false)
    private Integer id;

    @Column(name = "dispatcherFullName", length = 45)
    private String dispatcherFullName;

    @Column(name = "company", length = 45)
    private String company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDispatcherFullName() {
        return dispatcherFullName;
    }

    public void setDispatcherFullName(String dispatcherFullName) {
        this.dispatcherFullName = dispatcherFullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
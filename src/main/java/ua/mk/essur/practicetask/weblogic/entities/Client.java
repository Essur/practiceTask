package ua.mk.essur.practicetask.weblogic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientId", nullable = false)
    private Integer id;

    @Column(name = "clientFullName", length = 45)
    private String clientFullName;

    @Column(name = "clientCard", length = 45)
    private String clientCard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientFullName() {
        return clientFullName;
    }

    public void setClientFullName(String clientFullName) {
        this.clientFullName = clientFullName;
    }

    public String getClientCard() {
        return clientCard;
    }

    public void setClientCard(String clientCard) {
        this.clientCard = clientCard;
    }

}
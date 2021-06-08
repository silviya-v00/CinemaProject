package com.pgrss.Cinema.entities;
import org.apache.tomcat.jni.Local;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.Date;

@Entity
@Table(name = "projection")
public class Projection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "available_seats")
    private Integer available_seats;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "projection_client",
            joinColumns = @JoinColumn(name = "projection_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id"))

    private Set<Client> clients = new HashSet<>();

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    //Date date = new Date();

    public Projection(Long id, Integer available_seats) {
        this.id = id;
        this.available_seats = available_seats;
    }

    public Projection() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(Integer available_seats) {
        this.available_seats = available_seats;
    }


}

package com.pgrss.Cinema.entities;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price")
    private Double price;

    @Column(name = "holder_first_name")
    private String holder_first_name;

    @Column(name = "holder_last_name")
    private String holder_last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "count_tickets")
    private Integer count_tickets;

    @Column(name = "date")
    private String date;

    @Column(name = "type")
    private String type;


    public Client() {
    }

    public Client(Long id, Double price, String holder_first_name, String holder_last_name, String email, Integer count_tickets, String date, String type) {
        this.id = id;
        this.price = price;
        this.holder_first_name = holder_first_name;
        this.holder_last_name = holder_last_name;
        this.email = email;
        this.count_tickets = count_tickets;
        this.date=date;
        this.type=type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getHolder_first_name() {
        return holder_first_name;
    }

    public void setHolder_first_name(String holder_first_name) {
        this.holder_first_name = holder_first_name;
    }

    public String getHolder_last_name() {
        return holder_last_name;
    }

    public void setHolder_last_name(String holder_last_name) {
        this.holder_last_name = holder_last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCount_tickets() {
        return count_tickets;
    }

    public void setCount_tickets(Integer count_tickets) {
        this.count_tickets = count_tickets;
    }

    public String getDate() {return date;}
    public void setDate(String date) {this.date=date;}

    public String getType() {return type;}
    public void setType(String type) {this.type=type;}
}

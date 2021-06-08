package com.pgrss.Cinema.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "street_num")
    private Integer street_num;

    @Column(name = "street_name")
    private String street_name;

    @Column(name = "city")
    private String city;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "cinema_film",
            joinColumns = @JoinColumn(name = "cinema_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))

    private Set<Film> films = new HashSet<>();


    public Cinema() {
    }

    public Cinema(Long id, String name, Integer street_num, String street_name, String city) {
        this.id = id;
        this.name = name;
        this.street_num = street_num;
        this.street_name = street_name;
        this.city = city;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStreet_num() {
        return street_num;
    }

    public void setStreet_num(Integer street_num) {
        this.street_num = street_num;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}

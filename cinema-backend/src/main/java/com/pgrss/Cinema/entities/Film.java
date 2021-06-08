package com.pgrss.Cinema.entities;

import javax.persistence.*;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "video_format")
    private String video_format;

    @Column(name = "ticket_price")
    private Double ticket_price;

    @Column(name = "genre")
    private String genre;

    @Column(name ="cover_art")
    private String cover_art;

    @Column(name = "summary")
    private String summary;

    @Column(name = "time")
    private String time;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "film_actors",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actors_id"))

    private Set<Actor> actors = new HashSet<>();

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "film_projection",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "projection_id"))

    private Set<Projection> projections = new HashSet<>();

    public Set<Projection> getProjections() {
        return projections;
    }

    public void setProjections(Set<Projection> projections) {
        this.projections = projections;
    }

    public Film(Long id, String name, String video_format, String genre, Double ticket_price, String cover_art, String summary, String time) {
        this.id = id;
        this.name = name;
        this.video_format = video_format;
        this.genre = genre;
        this.ticket_price=ticket_price;
        this.cover_art = cover_art;
        this.summary=summary;
        this.time=time;
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

    public String getVideo_format() {
        return video_format;
    }

    public void setVideo_format(String video_format) {
        this.video_format = video_format;
    }

    public Double getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(Double ticket_price) {
        this.ticket_price = ticket_price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover_art() {return cover_art;}

    public void setCover_art(String cover_art)  {
        this.cover_art = cover_art;
    }

    public String getSummary() {return summary;}

    public void setSummary(String summary) {this.summary=summary;}

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public Film() {
    }

}

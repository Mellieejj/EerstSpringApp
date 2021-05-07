package com.example.demo.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String naam;
    private int hoogte;
    private int prijs;
    private String leefgebied;

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public void setLeefgebied(String leefgebied) {
        this.leefgebied = leefgebied;
    }

    public String getNaam() {
        return naam;
    }

    public int getHoogte() {
        return hoogte;
    }

    public int getPrijs() {
        return prijs;
    }

    public String getLeefgebied() {
        return leefgebied;
    }


}

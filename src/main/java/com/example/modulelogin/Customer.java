package com.example.modulelogin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;
    private String lastName;
    private String adresName;
    private Integer nr;
    private String cityName;
    private Integer postCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdresName() {
        return adresName;
    }

    public void setAdresName(String adresName) {
        this.adresName = adresName;
    }

    public Integer getNr() {return nr;}

    public void setNr(Integer nr) {this.nr = nr;}

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getPostCode() {return postCode;}

    public void setPostCode(Integer postCode) {this.postCode = postCode;}
}


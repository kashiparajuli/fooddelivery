package com.fdspringboot.fooddelivery.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    private Long addressId;
    private String state;
    private String city;
    private String steet;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long getAddressId() {
        return addressId;
    }
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getSteet() {
        return steet;
    }
    public void setSteet(String steet) {
        this.steet = steet;
    }
}

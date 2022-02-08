package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Address_1")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address_line1;
    private String address_line2;
    private String city;
    private String state;
    private String country;
    private String zipcode;

    public Address() {
    }

    public Address(Long id, String address_line1, String address_line2, String city, String state, String country, String zipcode) {
        this.id = id;
        this.address_line1 = address_line1;
        this.address_line2 = address_line2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(address_line1, address.address_line1) && Objects.equals(address_line2, address.address_line2) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(country, address.country) && Objects.equals(zipcode, address.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address_line1, address_line2, city, state, country, zipcode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address_line1='" + address_line1 + '\'' +
                ", address_line2='" + address_line2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}

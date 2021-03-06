package com.jp.userservice.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Address")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue
    private long addressId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String address2;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String country;
    @Column
    private String zipCode;
    @Column
    private String address1;
}

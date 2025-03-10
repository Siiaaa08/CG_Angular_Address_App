package com.example.AddressBookApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
@Table(name = "addressdata")
public class AddressBookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Fixed: "Id" -> "id"

    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name should contain alphabets and spaces")
    @NotNull(message = "Employee name cannot be null")
    @Column(name = "name")
    private String fullName;


    private String city;
    private String state;
    private long zip;
    private String address;
    @Column(name = "phone")  // Ensure correct field mapping
    private long number;  // Change to match DTO

    public AddressBookModel() {}

    public AddressBookModel(String fullName, long number, String city, String state, long zip, String address) {
        this.fullName = fullName;
        this.number = number; // Fixed: phone -> number
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}

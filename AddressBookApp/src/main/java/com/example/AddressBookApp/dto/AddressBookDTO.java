package com.example.AddressBookApp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.example.AddressBookApp.model.AddressBookModel;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AddressBookDTO {
    private long id;

    @JsonProperty("fullName")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name should contain only alphabets and spaces")
    @NotNull(message = "Name cannot be null")
    private String fullName;

    @JsonProperty("city")
    @NotNull(message = "City cannot be null")
    private String city;

    @JsonProperty("state")
    @NotNull(message = "State cannot be null")
    private String state;

    @JsonProperty("zip")
    @NotNull(message = "ZIP code cannot be null")
    private long zip;

    @JsonProperty("address")
    @NotNull(message = "Address cannot be null")
    private String address;

    @JsonProperty("number")
    @NotNull(message = "Phone number cannot be null")
    private long number;

    public AddressBookDTO() {}

    public AddressBookDTO(AddressBookModel contact) {
        this.id = contact.getId();
        this.fullName = contact.getFullName();
        this.city = contact.getCity();
        this.state = contact.getState();
        this.zip = contact.getZip();
        this.address = contact.getAddress();
        this.number = contact.getNumber();
    }
}

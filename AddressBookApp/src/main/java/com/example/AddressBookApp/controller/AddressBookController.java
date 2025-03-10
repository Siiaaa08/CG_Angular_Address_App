package com.example.AddressBookApp.controller;

import com.example.AddressBookApp.dto.AddressBookDTO;
import com.example.AddressBookApp.model.AddressBookModel;
import com.example.AddressBookApp.servicelayer.AddressBookServiceLayer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class AddressBookController {
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
    @Autowired
    private AddressBookServiceLayer addressBookServiceLayer;
    @PostMapping("/add")
    public ResponseEntity<AddressBookDTO> add(@Valid @RequestBody AddressBookDTO addressBookDTO){
       return addressBookServiceLayer.add(addressBookDTO);}
    @PutMapping("/update/{id}")
    public ResponseEntity<AddressBookDTO> update(@PathVariable Long id,@RequestBody AddressBookDTO addressBookDTO){
       return addressBookServiceLayer.update(id,addressBookDTO); }
    @GetMapping("/all")
    public ResponseEntity<List<AddressBookModel>> all(){
        return addressBookServiceLayer.all();}

    @GetMapping("/check/{id}")
    public Optional<AddressBookModel> check(@PathVariable Long id){
      return addressBookServiceLayer.check(id); }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
      return addressBookServiceLayer.delete(id);
    }
}

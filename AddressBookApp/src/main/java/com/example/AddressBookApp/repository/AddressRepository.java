package com.example.AddressBookApp.repository;

import com.example.AddressBookApp.model.AddressBookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressBookModel,Long> {
}

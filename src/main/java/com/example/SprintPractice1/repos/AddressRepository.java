package com.example.SprintPractice1.repos;

import com.example.SprintPractice1.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    Optional<Address> findByZipAndState(String zip, String state);
    Optional<Address> findById(Long id);
    void deleteById(Long id);
    Address findByIdAndAddress(Long id, String address);
    Address findByIdAndCityAndState(Long id, String city, String state);
}

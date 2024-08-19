package com.example.SprintPractice1.controller;

import com.example.SprintPractice1.entities.Address;
import com.example.SprintPractice1.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/addresses")
@CrossOrigin
public class AddressController {

    @Autowired
    private AddressService addressService;

    // GET all addresses
    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    // GET address by ID
    @GetMapping("/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

    // GET address by ZIP and State
    @GetMapping("/search")
    public Optional<Address> getAddressByZipAndState(@RequestParam String zip, @RequestParam String state) {
        return addressService.getAddressByZipAndState(zip, state);
    }

    // POST to create a new address
    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    // PUT to update an address by ID
    @PutMapping("/{id}")
    public Optional<Address> updateAddress(@PathVariable Long id, @RequestBody Address address) {
        return addressService.updateAddress(id, address);
    }

    // DELETE an address by ID
    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
    }
}

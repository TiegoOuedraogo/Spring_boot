package com.example.SprintPractice1.service;

import com.example.SprintPractice1.entities.Address;
import com.example.SprintPractice1.repos.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepository.findById(id);
    }

    public Optional<Address> getAddressByZipAndState(String zip, String state) {
        return addressRepository.findByZipAndState(zip, state);
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Optional<Address> updateAddress(Long id, Address newAddress) {
        return addressRepository.findById(id).map(address -> {
            address.setAddress(newAddress.getAddress());
            address.setCity(newAddress.getCity());
            address.setState(newAddress.getState());
            address.setZip(newAddress.getZip());
            return addressRepository.save(address);
        });
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}

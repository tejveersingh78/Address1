package com.sunglowsys.service;

import com.sunglowsys.domain.Address;
import com.sunglowsys.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressRepository addressRepository;


    @Override
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address update(Address address, Long id) {
        Address address1 = findById(id);
        if(address.getAddress_line1() != null){
            address1.setAddress_line1(address.getAddress_line1());
        }
        if(address.getAddress_line2() != null){
            address1.setAddress_line2(address.getAddress_line2());
        }
        if(address.getCity() !=null){
            address1.setCity(address.getCity());
        }
        if(address.getState() !=null){
            address1.setState(address.getState());
        }
        if(address.getCountry() !=null){
            address1.setCountry(address.getCountry());
        }
        if(address.getZipcode() !=null){
            address1.setZipcode(address.getZipcode());
        }
        return addressRepository.save(address1);
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address findById(Long id) {
        Optional<Address> optional = addressRepository.findById(id);
        Address address = null;
        if(optional.isPresent()){
            address = optional.get();
        }
        else{
            throw new RuntimeException("Address not found for ID : " + id);
        }
        return address;
    }

    @Override
    public void delete(Long id) {
        addressRepository.deleteById(id);
    }
}

package com.sunglowsys.service;

import com.sunglowsys.domain.Address;

import java.util.List;

public interface AddressService {

    Address createAddress(Address address);

    Address update(Address address, Long id);

    List<Address> findAll();

    Address findById(Long id);

    void delete(Long id);
}

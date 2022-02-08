package com.sunglowsys.resource;

import com.sunglowsys.domain.Address;
import com.sunglowsys.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressResource {

    @Autowired
    private AddressService addressService;

    @PostMapping("/addresses")
    public ResponseEntity<?> create(@RequestBody Address address){
        Address result = addressService.createAddress(address);
        return ResponseEntity.ok().body("Address is Created Successfully : " + result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Address> update(@RequestBody Address address,@PathVariable ("id") Long id ){
        Address result = addressService.update(address,id);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/addresses/{id}")
    public Address getById(@PathVariable("id") Long id){
        return addressService.findById(id);
    }

    @GetMapping
    public List<Address> getAll(){
        List<Address> result1 = addressService.findAll();
        return result1;
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        addressService.delete(id);
        return ResponseEntity.ok().body("Address is deleted Successfully on this Id : " + id);
    }

}

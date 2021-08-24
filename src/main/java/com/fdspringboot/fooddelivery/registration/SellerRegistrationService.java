package com.fdspringboot.fooddelivery.registration;

import com.fdspringboot.fooddelivery.registration.SellerRegistration;
import com.fdspringboot.fooddelivery.registration.SellerRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerRegistrationService {
    @Autowired
    private SellerRegistrationRepository repo;

    public List<SellerRegistration> show(){
        return repo.findAll();
    }
    public void save(SellerRegistration sellerRegistration){
        repo.save(sellerRegistration);
    }
    public SellerRegistration get (long sellerId){
        return repo.findById(sellerId).get();
    }
    public void delete(long sellerId){
     repo.deleteById(sellerId);
    }

}

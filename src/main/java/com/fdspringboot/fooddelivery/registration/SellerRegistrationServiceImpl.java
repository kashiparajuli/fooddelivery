package com.fdspringboot.fooddelivery.registration;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerRegistrationServiceImpl implements SellerRegistrationService{
    private final SellerRegistrationRepository repo;

    public SellerRegistrationServiceImpl(SellerRegistrationRepository repo) {
        this.repo = repo;
    }
    public SellerRegistration showRegistration(long sellerId) {
        return repo.findById(sellerId).orElse(null);
    }
    public List<SellerRegistration> showRegistartions() {
        return (List<SellerRegistration>) repo.findAll();
    }

    public SellerRegistration addRegistration(SellerRegistration sellerRegistration) {
        return repo.save(sellerRegistration);
    }
    public List<SellerRegistration> addAllregistration(List<SellerRegistration> sellerRegistrationList) {
        repo.saveAll(sellerRegistrationList);
        return sellerRegistrationList;
    }
     public SellerRegistration showByName(String ownerName){
        return repo.findByownerName(ownerName);
     }
    public String delete(long sellerId) {
        repo.deleteById(sellerId);
        return "item deleted"+sellerId;
    }
    public SellerRegistration updateSellerRegistration(long id, SellerRegistration sellerRegistration) {
        SellerRegistration existingItem = repo.findById(id).orElse(null);
        existingItem.setOwnerName(sellerRegistration.getOwnerName());
        existingItem.setRestaurantName(sellerRegistration.getRestaurantName());
        existingItem.setContactNumber(sellerRegistration.getContactNumber());
        existingItem.setType(sellerRegistration.getType());
        existingItem.setPassword(sellerRegistration.getPassword());
        return repo.save(existingItem);
    }
}

package com.fdspringboot.fooddelivery.registration;

import java.util.List;

public interface SellerRegistrationService {
    public SellerRegistration showRegistration(long sellerId);
    public List<SellerRegistration> showRegistartions();
    public SellerRegistration addRegistration(SellerRegistration sellerRegistration);
    public List<SellerRegistration> addAllregistration(List<SellerRegistration> sellerRegistrationList);
    public SellerRegistration showByName(String ownerName);
    public String delete(long sellerId);
    public SellerRegistration updateSellerRegistration(long id, SellerRegistration sellerRegistration);
}

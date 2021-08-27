package com.fdspringboot.fooddelivery.registration;

import com.fdspringboot.fooddelivery.registration.SellerRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRegistrationRepository extends JpaRepository<SellerRegistration,Long> {
    SellerRegistration findByownerName(String ownerName);
}


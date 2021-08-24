package com.fdspringboot.fooddelivery.registration;

import com.fdspringboot.fooddelivery.registration.SellerRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SellerRegistrationController {
@Autowired
    private SellerRegistrationService service;
}

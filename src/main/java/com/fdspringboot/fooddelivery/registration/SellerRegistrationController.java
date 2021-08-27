package com.fdspringboot.fooddelivery.registration;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/registration/seller")
public class SellerRegistrationController {

    private final SellerRegistrationService sRservice;

    public SellerRegistrationController(SellerRegistrationService sRservice) {
        this.sRservice = sRservice;
    }

    @PostMapping("/save")
    public SellerRegistration saveRegistration(@RequestBody SellerRegistration sellerRegistration) {
        return sRservice.addRegistration(sellerRegistration);

    }
    @PostMapping("/saveall")
    public List<SellerRegistration> saveRegistrations(@RequestBody List<SellerRegistration> sellerRegistrationList) {
        return sRservice.addAllregistration(sellerRegistrationList);
    }
    @GetMapping("/all")
    public List<SellerRegistration> getSellerRegistrations() {
        return sRservice.showRegistartions();
    }

    @GetMapping("/{id}")
    public SellerRegistration findById(@PathVariable (value = "id") long id) {
        return sRservice.showRegistration(id);
    }
    @GetMapping("/byownername")
            public SellerRegistration findByName(@RequestParam String ownerName){
        return sRservice.showByName(ownerName);
    }

    @PutMapping("/update/{id}")
    public SellerRegistration updateSellerRegistration(@PathVariable long id, @RequestBody SellerRegistration sellerRegistration) {
        return sRservice.updateSellerRegistration(id, sellerRegistration);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable long id) {
        sRservice.delete(id);
    }


}

package org.MrDigital.customer_config.controller;

import org.MrDigital.customer_config.dao.CustomerDAO;
import org.MrDigital.customer_config.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("customer")
@RefreshScope //pour env une req post pour actualie les donne sans redemare mon serveur
public class CustomerController {
    private CustomerDAO customerDAO;

    public CustomerController(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @GetMapping("")
    public List<Customer> getAll(){
        return customerDAO.findAll();
    }

}

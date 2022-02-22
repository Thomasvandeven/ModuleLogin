package com.example.modulelogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/add")
    public String addCustomer(@RequestParam String first, @RequestParam String last, @RequestParam String adres, @RequestParam Integer nr, @RequestParam String city, @RequestParam Integer code) {
        Customer customer = new Customer();
        customer.setFirstName(first);
        customer.setLastName(last);
        customer.setNr(nr);
        customer.setCityName(city);
        customer.setPostCode(code);
        customerRepository.save(customer);
        return "dear" + String.format(" *- %s," + "\n" + " your profile has succesfully been created", first);
    }

    @GetMapping("/list")
    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Customer findCustomerById(@PathVariable Integer id) {
        return customerRepository.findCustomerById(id);
    }

    //

    @GetMapping("/findname/{first}")
    public Customer findCustomerByFirst(@PathVariable String first) {
        return customerRepository.findCustomerByFirstName(first);}

    @GetMapping("/findfamilyname/{last}")
    public Customer findCustomerByLast(@PathVariable String last) {
        return customerRepository.findCustomerByLastName(last);}

    @GetMapping("/find2/{nr}")
    public Customer findCustomerByNr(@PathVariable Integer nr) {
        return customerRepository.findCustomerByNr(nr);}


}
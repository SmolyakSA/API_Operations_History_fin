package ru.netology.smolyak.controller;


import org.springframework.web.bind.annotation.*;
import ru.netology.smolyak.domain.Customer;
import ru.netology.smolyak.domain.Operation;
import ru.netology.smolyak.service.CustomerService;

import java.util.ArrayList;

import static ru.netology.smolyak.service.CustomerService.customers;
import static ru.netology.smolyak.service.StatementService.storage;

@RestController
@RequestMapping(path = "api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

@GetMapping
public ArrayList<Customer> getCustomers() {

return CustomerService.getCustomers();

}

@PostMapping
 public void Arraylist (@RequestBody ArrayList<Customer> customer){

   CustomerService.setCustomers(customer);
    }

    @DeleteMapping
    public void deleteCustomer(@RequestBody Customer customer){
        customers.remove(customer);
    }

//@GetMapping
//    public ArrayList<Customer> getCustomers() {
//    customers.add(0, new Customer(6, "Gosha", 1994, 69));
//    customers.add(1, new Customer(5, "Sergey", 1993, 65));
//    return customers;
//}
//
//@PostMapping
// public void setCustomerService(@RequestBody Customer customer){
//    Customer customer1 = new Customer();
//    customers.add(customer1);
//
//    }


    //@RequestBody Customer customer

}

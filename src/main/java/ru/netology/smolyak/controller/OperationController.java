package ru.netology.smolyak.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.smolyak.domain.Customer;
import ru.netology.smolyak.domain.Operation;
import ru.netology.smolyak.service.CustomerService;
import ru.netology.smolyak.service.OperationService;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "api/operations")
public class OperationController {

    private OperationService operationService;

    public OperationController(CustomerService customerService) {
        this.operationService = operationService;
    }

    @GetMapping
    public ArrayList<Operation> getOperations() {

        return OperationService.getOperations();

    }

    @PostMapping
    public void Arraylist(@RequestBody ArrayList<Customer> operation) {

        OperationService.setOperations(operation);
    }
}
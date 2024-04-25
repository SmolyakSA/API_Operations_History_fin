package ru.netology.smolyak.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.smolyak.domain.Customer;
import ru.netology.smolyak.domain.Operation;
import ru.netology.smolyak.service.AsyncInputOperationService;
import ru.netology.smolyak.service.CustomerService;
import ru.netology.smolyak.service.OperationService;

import java.util.ArrayList;

import static ru.netology.smolyak.service.AsyncInputOperationService.*;
import static ru.netology.smolyak.service.OperationService.operations;
import static ru.netology.smolyak.service.StatementService.storage;


@RestController
@RequestMapping(path = "api/operations")
public class OperationController {

    private OperationService operationService;

    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    @GetMapping
    public ArrayList<Operation> getOperations() {

        return OperationService.getOperations();

    }

    @PostMapping
    public void Arraylist(@RequestBody Operation operation) {

        OperationService.setOperations(operation);
        AsyncInputOperationService.offerOperation(operation);

    }

    @DeleteMapping
    public void deleteOperation(@RequestBody Operation operation){
        operations.remove(operation);
    }
}
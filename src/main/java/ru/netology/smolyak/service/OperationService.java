package ru.netology.smolyak.service;

import org.springframework.stereotype.Service;
import ru.netology.smolyak.domain.Customer;
import ru.netology.smolyak.domain.Operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.Scanner;

import static ru.netology.smolyak.service.AsyncInputOperationService.scanner;
import static ru.netology.smolyak.service.StatementService.storage;

@Service
public class OperationService {


    public static ArrayList<Operation> operations = new ArrayList<Operation>();


    public OperationService(){

        operations.add(0, new Operation(14,45656, "Perevod", "14.08.2022"));
        operations.add(1, new Operation(14,45656, "Oplata", "12.02.2024"));
    }

    public static ArrayList<Operation> getOperations() {
        return operations;
    }

    public static void setOperations(ArrayList<Customer> customers) {
        OperationService.operations = operations;
    }



    public static void addOperation(Operation operation){

        System.out.println("Введите id клиента");

        int clientId = scanner.nextInt();

        storage.computeIfAbsent(clientId, k -> new ArrayList<>()).add(operation);

        System.out.println(storage);

    }





}
package ru.netology.smolyak.service;

import org.springframework.stereotype.Service;
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

    public static void addOperation(Operation operation){

        System.out.println("Введите id клиента");

        int clientId = scanner.nextInt();

        storage.computeIfAbsent(clientId, k -> new ArrayList<>()).add(operation);

        System.out.println(storage);

    }





}
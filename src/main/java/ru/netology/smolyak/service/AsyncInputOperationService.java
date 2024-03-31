package ru.netology.smolyak.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.smolyak.domain.Operation;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

@Service
public class AsyncInputOperationService {

    private final static Queue<Operation> queue = new LinkedList<>();
    public static Scanner scanner;
@Autowired
private StatementService statementService;

    @PostConstruct
    public void init() {
        this.startAsyncOperationProcessing();
    }

    public static boolean offerOperation() throws InputMismatchException{

        int j = 0;

        while (true) {
            try {
                System.out.println("Введите данные по операциии клиента через пробел: int id, long amount, String name, String date");
                Operation operation = new Operation(scanner.nextInt(), scanner.nextLong(), scanner.nextLine(), scanner.nextLine());
                queue.offer(operation);
                System.out.print("ведите в консоль 0, если хотите прервать заполнение данных; введите 1, если хотите продолжить");
                int proceed = scanner.nextInt();
                if (proceed == 0) {
                    break;
                }
                j = +1;
            }
            catch (InputMismatchException e) {System.out.println("Введенные данные не совпадают с объявленными типами");}
        }


        return false;
    }


    public void processQueue() {
        while (true) {
            Operation operation = queue.poll();
            if (operation == null) {
                try {
                    System.out.println("Waiting for next operation in queue");
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Processing operation");
                OperationService.addOperation(operation);
            }
        }
    }


    public void startAsyncOperationProcessing() {
        Thread t = new Thread() {
            @Override
            public void run() {
                processQueue();
            }
        };
        t.start();
    }




}


package ru.netology.smolyak.service;

import org.springframework.stereotype.Service;
import ru.netology.smolyak.domain.Customer;

import java.util.ArrayList;

@Service
public class CustomerService {

    public static ArrayList<Customer> customers = new ArrayList<>();

    public CustomerService(){

        customers.add(0, new Customer(6, "Gosha", 1994, 69));
        customers.add(1, new Customer(5, "Sergey", 1993, 65));
    }

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static void setCustomers(ArrayList<Customer> customers) {
        CustomerService.customers = customers;
    }

//    public void saveCustomer() {
//        try {
//            int i = 0;
//            while (true) {
//                System.out.println("Введите данные по клиентам через пробел: customerId, String customerName, int birthY, short region");
//                customers.add(new Customer(scanner.nextInt(), scanner.nextLine(), scanner.nextInt(), scanner.nextShort()));
//                System.out.print("ведите в консоль 0, если хотите прервать заполнение данных, введите 1, если хотите продолжить");
//                int proceed = scanner.nextInt();
//                if (proceed == 0) {
//                    break;
//                }
//                i = +1;
//            }
//        } catch (InputMismatchException e) {
//            throw new RuntimeException(e);
//        }
//    }



}

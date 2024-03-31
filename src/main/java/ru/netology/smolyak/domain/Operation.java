package ru.netology.smolyak.domain;

import java.io.Serializable;
import java.util.ArrayList;


public class Operation extends ArrayList<Operation> implements Serializable {

    private int id;

    private long amount;

    private String name;

    private String date;

//    public static Operation[] operations = new Operation[1000];
//    public static int[][] statement = new int[1000][1000];

    public Operation(int id, long amount, String name, String date) {
        super();
        this.id = id;
        this.amount = amount;
        this.name = name;
        this.date = date;
    } // конструктор со всеми аргументами

    public Operation() {
    } // конструктор пустой

    public String toString() {
        return "Операция [id операции:" + id
                + ", Размер операции:" + amount
                + ", Название операции:" + name
                + ", Дата операции:" + date + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String name) {
        this.date = date;
    }

}
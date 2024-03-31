package ru.netology.smolyak.domain;

import java.io.Serializable;
import java.util.InputMismatchException;


public class Customer implements Serializable {
    private String customerName;

    private int birthY;

    private short region;

    private int customerId;

    public Customer (int customerId, String customerName, int birthY, short region){
        super();
        this.customerName = customerName;
        this.birthY = birthY;
        this.region = region;
        this.customerId = customerId;
    } // конструктор с аргументами

    public Customer (){
        super();
    } // конструктор пустой

    public String toString(){
        return "Клиент [ Id клиента:" + customerId + "ФИО клиента:" + customerName
                + ", Год рожденья:"+ birthY
                + ", Ргион проживания:" + region
                + "]";
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBirthY() {
        return birthY;
    }

    public void setBirthY(int BirthY) {
        this.birthY = birthY;
    }

    public short getRegion() {
        return region;
    }

    public void setRegion(short name) {
        this.region = region;
    }

    public int getCustomerId () {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }



}
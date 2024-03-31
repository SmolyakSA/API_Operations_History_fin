package ru.netology.smolyak.domain;

import java.io.Serializable;


public class Customer implements Serializable {
    public String customerName;

    public int birthY;

    public short region;

    public int customerId;



//    public Customer (int customerId, String customerName, int birthY, short region){
//        super();
//        this.customerName = customerName;
//        this.birthY = birthY;
//        this.region = region;
//        this.customerId = customerId;
//    } // конструктор с аргументами

    public Customer (int customerId, String sergey, int birthY, int region){
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
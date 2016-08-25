package com.company;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by St on 24.08.2016.
 */
public class Customer {

    public static int count;
    public static int countList;

    private int id;
    private  String surname;
    private  String name;
    private  String secondname;
    private  String cardNum;
    private  String accountBankNum;
    public static Customer[] customerList = new Customer[count + 1];


    public Customer(int id, String surname, String name, String secondname, String cardNum, String accountBankNum)
    {

        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondname = secondname;
        this.cardNum = cardNum;
        this.accountBankNum = accountBankNum;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getCardNum() {
        return cardNum;
    }

    public String getAccountBankNum() {
        return accountBankNum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public void setAccountBankNum(String accountBankNum) {
        this.accountBankNum = accountBankNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondname='" + secondname + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", accountBankNum='" + accountBankNum + '\'' +
                '}';
    }


    public Customer[] addToArray(Customer[] customerList)
    {
        customerList[countList] = this;
        countList++;
        return customerList;

    }

    static Comparator<Customer> snorderer = new Comparator<Customer>()
    {
        public int compare(Customer o1, Customer o2)
        {
            return o1.surname.compareTo(o2.surname);
        }

    };
}
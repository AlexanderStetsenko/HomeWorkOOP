package com.company;

import java.lang.reflect.Array;
import java.security.Provider;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
//2. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, номер банковского счета.
    public static void main(String[] args)
    {
        ServiceClass serviceClass = new ServiceClass();


        Customer customer = new Customer(1, "bvanov", "Ivan", "avanovich", "4000300020001000", "4000300020001000");
        Customer customer1 = new Customer(1, "avanov", "Ivan", "4vanovich", "4000300020001000", "4000300020001000");
        Customer customer2 = new Customer(1, "cvanov", "Ivan", "4vanovich", "4000300020001000", "4000300020001000");

        Customer customerList[] = new Customer[Customer.count];

        customer.addToArray(customerList);
        customer1.addToArray(customerList);
        customer2.addToArray(customerList);
               

        Arrays.sort(customerList, Customer.snorderer);

        for (Customer customer123 : customerList)
        {
            System.out.println(customer123);
        }





    }
}

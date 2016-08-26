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
        Books sortBook = new Books();

       Books book1 = new Books(1, "Его пленница", "Бейтс Ноэль", "Fabric", 1999, 567, 55.66, "type");
       Books book3 = new Books(1, "Вынужденный брак", "Мори Триш", "Fabric1", 2005, 567, 55.66, "type");
       Books book4 = new Books(1, "Отважная провинциалка", "Филдинг Лиз", "Fabric0", 1999, 567, 55.66, "type");
       Books book5 = new Books(1, "Милая лгунья", "Кэрри Томас", "Fabric", 1999, 567, 55.66, "type");
       Books book6 = new Books(1, "Надо верить", "Кэрри Томас", "Fabric1", 1999, 567, 55.66, "type");

        Books[] booksList = new Books[Books.count];

        book1.addToArray(booksList);
        book3.addToArray(booksList);
        book4.addToArray(booksList);
        book5.addToArray(booksList);
        book6.addToArray(booksList);


        sortBook.sortByAutor("Бейтс Ноэль", booksList);
        sortBook.sortByFabric("Fabric", booksList);
        sortBook.sortByReleaseYear(200, booksList);



    }
}

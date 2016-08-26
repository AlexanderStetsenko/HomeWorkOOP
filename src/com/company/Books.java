package com.company;

import java.util.ArrayList;

/**
 * Created by Александр on 26.08.2016.
 */
public class Books {
    private  int id;
    private  String bookName;
    private  String autorName;
    private  String fabric;
    private  int releseDate;
    private  int pageNum;
    private  double cost;
    private  String type;
    public static int count;
    private static int countList;

    public Books() {
    }

    public Books(int id, String bookName, String autorName, String fabric, int releseDate, int pageNum, double cost, String type) {
        this.id = id;
        this.bookName = bookName;
        this.autorName = autorName;
        this.fabric = fabric;
        this.releseDate = releseDate;
        this.pageNum = pageNum;
        this.cost = cost;
        this.type = type;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAutorName() {
        return autorName;
    }

    public String getFabric() {
        return fabric;
    }

    public int getReleseDate() {
        return releseDate;
    }

    public int getPageNum() {
        return pageNum;
    }

    public double getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return  "Book Name: " + this.bookName.toUpperCase() + "\nWrite by: " + this.autorName + "\nRelease year: " + this.releseDate + "\nReleased by: " + this.fabric + "\n" ;

    }

    public void addToArray(Books[] bookList)
    {
        bookList[countList] = this;
        countList++;
    };

    public  ArrayList<Books> sortByAutor (String autorName, Books[] booksList)
    {
        ArrayList<Books> booksListByAutor = new ArrayList<>();

        for(Books book : booksList)
        {
            if (book.getAutorName().equals(autorName))
            {
                booksListByAutor.add(book);
            }
        }
        if(booksList.length >= 0 ) {
            System.out.println("\nBooks are written by " + autorName +  "\n" );
            for ( Books sortBook : booksListByAutor)
                {
                    System.out.println(sortBook);
                }
            }



        return booksListByAutor;
    }


    public ArrayList<Books> sortByFabric(String fabric, Books[] booksList)
    {
        ArrayList<Books> booksListByFabric = new ArrayList<>();

        for(Books book : booksList)
        {
            if (book.getFabric().equals(fabric))
            {
                booksListByFabric.add(book);
            }
        }

        if(booksList.length >= 0 ) {
            System.out.println("\nBooks are released by " + fabric +  "\n" );
            for ( Books sortBook : booksListByFabric)
            {
                System.out.println(sortBook);
            }
        }
        return booksListByFabric;
    }

    public ArrayList<Books> sortByReleaseYear(int releaseYear, Books[] booksList)
    {

        ArrayList<Books> booksListByReleasedYear = new ArrayList<>();

        for(Books book : booksList)
        {
            if (book.getReleseDate() > releaseYear)
            {
                booksListByReleasedYear.add(book);
            }
        }


        if(booksList.length >= 0 )
        {
            System.out.println("\nBooks are released after " + releaseYear + "\n");
            for (Books sortBook : booksListByReleasedYear)
            {
                System.out.println(sortBook);
            }
        }

        return booksListByReleasedYear;

    }
}

package com.exc.service;


import java.util.List;

public class Library {

    private String libraryName;
    private List<Book> books;


    public Library(List<Book> books) {
        this.books = books;
    }


    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void displayLibrary() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(" - " + book);
        }
    }
}

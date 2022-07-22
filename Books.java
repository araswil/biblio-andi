package ch.stegmann.bookshelf.bookshelfapp.data;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Books extends DataObjects{

    private ArrayList<Book> books;

    public Books(){
        this.books = new ArrayList<>();
    }
    @Override
    public void readAll() {

    }

    @Override
    public void readById() {

    }
}

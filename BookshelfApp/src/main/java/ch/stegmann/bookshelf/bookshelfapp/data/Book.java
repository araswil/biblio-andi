package ch.stegmann.bookshelf.bookshelfapp.data;

public class Book extends DataObject{

    public enum rating{
        NICE,
        GOOD,
        DONTLIKE
    }

    public enum readingState{
        NOTREAD,
        READ
    }

    public enum shelfState{
        LENDOUT,
        BORROW,
        INSHELF
    }

    public enum medium{
        BOOK,
        EBOOK
    }
    private String title;
    private String description;
    private String author;
    private String notice;
    private int year;
    private String isbn;
    private Person person;

    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}

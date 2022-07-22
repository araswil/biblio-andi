package ch.stegmann.bookshelf.bookshelfapp.data;

public abstract class DataObject {

    protected int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void save();
    public abstract void update();
    public abstract void delete();
}

package pjatk;

public class Book {

    String title ;
    int catNo ;




    public Book(String title, int catNo) {
        this.title = title;
        this.catNo = catNo;
    }


    public String getTitle() {
        return title;
    }

    public int getCatNo() {
        return catNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCatNo(int catNo) {
        this.catNo = catNo;
    }

    public String toString() {
        return title;
    }

}

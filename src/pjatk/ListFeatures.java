package pjatk;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListFeatures {


    public List<Book> findAllBooks() {

        return this.cat1;
    }

    public List<Book> getCat1() {
        return this.cat1;
    }

    private List<Book> cat1 = new ArrayList<>();


    public ListFeatures() {
        this.cat1 = cat1;
    }


    public void catAddPos(String title, int catNo) {

        Book b1 = new Book(title, catNo);
        cat1.add(b1);

    }


        public void SimpleIteration(){
        Iterator<Book> it = cat1.iterator();
        while (it.hasNext()) {
            Book b1 = it.next();
            System.out.print("  " + it.next());
        }
    }


}
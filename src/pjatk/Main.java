package pjatk;

import java.lang.reflect.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListFeatures lf1 = new ListFeatures();

        lf1.catAddPos("book", 1);
        lf1.catAddPos("book", 2);
        lf1.catAddPos("book", 3);
        lf1.catAddPos("book", 4);
        lf1.catAddPos("book", 5);
//            lf1.catAddPos("S1");
//            lf1.catAddPos(5);
        System.out.println(lf1.findAllBooks());
        System.out.println(lf1.getCat1());

        try {

            lf1.SimpleIteration();
        } catch (RuntimeException e) {
            System.out.println("Catched, but I dont know why");
        }


    }
}


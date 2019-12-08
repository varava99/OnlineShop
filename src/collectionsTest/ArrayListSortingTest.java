package collectionsTest;


import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListSortingTest {
    private List<Contact> list;

    @Before
    public void setup() {
        list = new ArrayList<>();
        list.add(new Contact("Inna", LocalDate.of(1973, 2, 12), "07999999999"));
        list.add(new Contact("Andrei", LocalDate.of(1993, 12, 12), "079523379"));
        list.add(new Contact("I", LocalDate.of(1893, 9, 2), "87888523379"));
        list.add(new Contact("Dima", LocalDate.of(1993, 11, 12), "0779523379"));

    }

    @Test
    public void sortByName() {
        System.out.println(list);
        list.sort(new ContactByName());

        Iterator<Contact> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    @Test
    public void sortByDOB() {
        System.out.println(list);
        list.sort(new ContactByDOB());

        Iterator<Contact> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    @Test
    public void sortByPhone() {
        System.out.println(list);
        list.sort(new ContactByPhone());

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i).toString());
        }
    }

    @Test
    public void setItemTest() {
        System.out.println(list);

       Contact replaced =  list.set(1,new Contact("Naz", LocalDate.of(1990, 7, 30), "0682864864"));

        System.out.println(list);
        System.out.println(replaced);
    }

    @Test
    public void addItemTest() {
        System.out.println(list);

        list.add(1,new Contact("Naz", LocalDate.of(1990, 7, 30), "0682864864"));

        System.out.println(list);

    }



}

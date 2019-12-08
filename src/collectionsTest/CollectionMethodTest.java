package collectionsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionMethodTest {
    private Collection<String> data;
    private Collection<String> data2;

    @Before
    public void setup() {
        data = new ArrayList<>();
        data.add("Sara");
        data.add("Nick");
        data.add("John");

        data2 = new ArrayList<>();
        data2.add("Sara");
        data2.add("Nick");
        data2.add("John");


    }

    @Test
    public void iteratorTest() {
        Iterator<String> iterator = data.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void equalsTest() {
        Assert.assertTrue(data.equals(data2));
        data2.add("Den");
        Assert.assertFalse(data.equals(data2));
    }

    @Test
    public void containsTest() {
        data2.add("Den");
        Assert.assertFalse(data.contains(data2));
    }

    @Test
    public void addAllTest() {
        data2.add("Den");
        data.addAll(data2);
        Iterator<String> iterator = data.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void removeAllTest() {
        data2.add("Den");
        data2.removeAll(data);

        Iterator<String> iterator = data2.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void retainAllTest() {
        data2.add("Den");
        data2.retainAll(data);

        Iterator<String> iterator = data2.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}

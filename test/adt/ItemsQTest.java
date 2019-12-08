package adt;

import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.containsString;
import org.hamcrest.Matcher;
import org.junit.Before;

import org.junit.Test;


import java.util.ArrayList;


import static java.util.EnumSet.allOf;
import static javax.management.Query.not;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.Every.everyItem;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.*;

public class ItemsQTest {

    private  Queue<String> list;
    private ArrayList<String > data = new ArrayList<>();

    @Before
    public void init(){
        list= new ItemsQ<>(5);
        list.enqueue("Sara");
        list.enqueue("Gray");
        list.enqueue("Andrei");
        list.enqueue("david");

    }

    @Test
    public void size() {

       assertThat(list.size(),CoreMatchers.is(4));


    }

    @Test
    public void enqueueToFreeSpace() {

        assertTrue(list.enqueue("steve"));

    }
    @Test
    public void enqueueToEmptySpace(){
        list.enqueue("dd");
        assertFalse(list.enqueue("cc"));
    }

    @Test
    public void dequeue() {

        ArrayList<String> st= new ArrayList<>();
        while(list.size()>0){
            String temp = list.dequeue();
            st.add(temp);
        }
        System.out.println(st);
        assertThat(st, CoreMatchers.hasItems("Sara","Gray","Andrei","david"));
    }

    @Test
    public void leaveExistingPosition() throws NoSuchPositionException {
        list.leave(2);
        assertThat(list.size(),CoreMatchers.is(3));

    }

    @Test(expected = NoSuchPositionException.class)
    public void leaveNonExistingPosition() throws NoSuchPositionException{

        list.leave(5);

    }

    @Test
    public void NotSameObject(){
       assertNotSame("should Not be Same","Sara","sara");

    }
    @Test
    public void testAssertNotSame(){
        String list1= new String();
        assertNotSame("not same list",list1,list);

    }

    @Test
    public void testAssertThatBothContainsString() {
        assertThat("Andrei", both(containsString("A")).and(containsString("r")));
    }

    @Test
    public void testAssertThatEveryItemContainsString() throws NoSuchPositionException {

        ArrayList<String> st= new ArrayList<>();
        while(list.size()>0){
            list.leave(2);

            String temp = list.dequeue();
            st.add(temp);
        }
        assertThat(st,everyItem(containsString("a")));

    }

    @Test
    public void testAssertThat() {

       // assertThat("Andrei", allOf(equalTo("Andrei"), startsWith("Andrei")));


    }
}
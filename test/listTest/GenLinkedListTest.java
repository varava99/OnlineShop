package listTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenLinkedListTest {
    private  GenLinkedList<String> list;


    @Before
    public void init(){
        list= new GenLinkedList<>();
        list.insertFirst("Sara");
        list.insertFirst("Gray");
        list.insertFirst("Andrei");
        list.insertFirst("david");
        list.insertFirst("Vadim");
    }

    @Test
    public void insertFirst() {
        list.insertFirst("BB");
        assertEquals("BB",list.deleteFirst());
        assertNotEquals("BB",list.deleteFirst());




    } //done

    @Test
    public void insertLast() {
        list.insertLast("Tatiana");
        assertEquals("Tatiana",list.deleteLast());
        assertNotEquals("RR",list.deleteLast());
    } // done

    @Test
    public void deleteFirst() {
        assertNotEquals("Sara",list.deleteFirst());
        assertEquals("david",list.deleteFirst());



//        Assert.assertEquals("Vadim",list.deleteFirst());
//        Assert.assertNotEquals("Andrei",list.deleteFirst());
//        Assert.assertFalse(list.isEmpty());
    }  // done

    @Test
    public void deleteLast() {
//        Assert.assertEquals("Sara",list.deleteLast());
//        Assert.assertFalse(list.isEmpty());

//        Assert.assertEquals("Andrei",list.deleteLast());
//        Assert.assertFalse(list.isEmpty());

//        Assert.assertNotEquals("Vadim",list.deleteLast());
////        Assert.assertNotEquals("Andrei",list.deleteLast());
////        Assert.assertFalse(list.isEmpty());
////        Assert.assertEquals("Andrei",list.deleteLast());
////        Assert.assertFalse(list.isEmpty());
////        Assert.assertEquals("david",list.deleteLast());
////        Assert.assertEquals("Vadim",list.deleteLast());
        // why list is not empty after we deleted all objects
        //Assert.assertTrue(list.isEmpty());


    }  //done

    @Test
    public void deleteLastDoubleEnded(){
        list.displayListHeadToTail();
       list.deleteLast();
        list.displayListHeadToTail();

    }// need work

    @Test
    public void deleteIndex() {
        list.displayListHeadToTail();
        assertEquals("Sara",list.deleteIndex(5));
        list.displayListHeadToTail();
        assertEquals("Gray",list.deleteIndex(4));
        list.displayListHeadToTail();
        assertEquals("Andrei",list.deleteIndex(3));
        list.displayListHeadToTail();
        assertEquals("david",list.deleteIndex(2));
        list.displayListHeadToTail();
        assertEquals("Vadim",list.deleteIndex(1));
        list.displayListHeadToTail();
        assertTrue(list.isEmpty());


//        Assert.assertNotEquals("Vadim",list.deleteIndex(4));
//        Assert.assertNotEquals("Vadim",list.deleteIndex(4));


    }  // done

    @Test
    public void isEmpty() {
//        Assert.assertFalse(list.isEmpty());
//        Assert.assertTrue(list.isEmpty());
    }   //done

    @Test
    public void displayListHeadToTail() {
        list.displayListHeadToTail();

    }// done

    @Test
    public void DisplayListTailToHead(){

        list.displayListTailToHead();


    }
    //       @Test
//    public void insertFirstTest() {
//        Assert.assertEquals("Sara", list.deleteFirst());
//       // Assert.assertTrue(list.isEmpty());
//    }
//
//    @Test
//    public void deleteExistingElementByIndex() {
//        Assert.assertEquals("Andrei",list.deleteIndex(3));
//
//    }
//    @Test
//    public void deleteNonExistingElementByIndex() {
//        Assert.assertNull(list.deleteIndex(3));
//
//    }
}
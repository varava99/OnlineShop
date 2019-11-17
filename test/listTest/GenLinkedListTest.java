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
    public void insertFirstTest() {

       // Assert.assertEquals("Sara", list.deleteFirst());
        Assert.assertTrue(list.isEmpty());

    }


    @Test
    public void deleteExistingElementByIndex() {

        Assert.assertEquals("Andrei",list.deleteIndex(3));



    }
    @Test
    public void deleteNonExistingElementByIndex() {

        Assert.assertNull(list.deleteIndex(3));



    }
}
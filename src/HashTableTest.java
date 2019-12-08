import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashTableTest {
    private Set <String> friends ;

    @Before
    public void init (){
        friends= new HashSet<>();
//        friends.add("Dan");
//        friends.add("Benn");
//        friends.add("Emilly");
//        friends.add("Benjamin");
        friends.add("was");
        friends.add("zas");
        friends.add("ras");
        friends.add("sas");
    }

    @Test
    public void printSetTest(){
        Iterator<String> it = friends.iterator();
        while(it.hasNext()){
            String item= it.next();
            System.out.println("item = " + item + " Hash code " + item.hashCode());
        }
    }
}

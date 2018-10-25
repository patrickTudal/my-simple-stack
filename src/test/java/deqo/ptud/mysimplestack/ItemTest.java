package deqo.ptud.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    private Item item;

    @Before
    public void init(){
        item = new Item(4);
    }

    @Test
    public void getMonNum() {
        assertTrue(item.getMonNum()==4);
    }

    @Test
    public void setMonNum() {
        item.setMonNum(8);
        assertTrue(item.getMonNum()==8);
    }
}
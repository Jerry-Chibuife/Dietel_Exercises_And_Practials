package Chapter7.Practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JerryListTest {


    @Test
    public void anInstanceOfJerryListCanBeCreated(){
        JerryList<String> store = new JerryList<>();
    }


    @Test
    public void canCheckCapacityOfJerryListObject(){
        JerryList<String> store = new JerryList<>();
        assertEquals(0, store.getCapacity());
    }


    @Test
    public void canCheckSizeOfJerryList(){
        JerryList<String> store = new JerryList<>();
        assertEquals(0, store.getSize());
    }

    @Test
    public void canAddStringsToJerryListObject(){
        JerryList<String> store = new JerryList<>();
        store.add("Capsule");
        assertEquals(1, store.getSize());
        store.add("Container");
        assertEquals(2, store.getSize());
        store.add("Coffee");
        assertEquals(3, store.getSize());
        assertEquals(3, store.getCapacity());
    }

    @Test
    public void capacityGrowsWithGrowingList(){
        JerryList<String> store = new JerryList<>();
        for(int i = 1; i <= 5; i++)
            store.add("Booklet");
        assertEquals(5, store.getSize());
        store.add("Cone");
        assertEquals(6, store.getSize());
        store.add("Room");
        assertEquals(7, store.getSize());
        assertEquals(7, store.getCapacity());
        for(int i = 1; i <= 7; i++)
            store.add("Yeti");
        assertEquals(14, store.getSize());
        assertEquals(14, store.getCapacity());
    }

    @Test
    public void canDeleteStringsFromJerryListObject(){
        JerryList<String> store = new JerryList<>();
        for(int i = 1; i <= 5; i++)
            store.add("Booklet");
        assertEquals(5, store.getSize());
        store.delete();
        assertEquals(4, store.getSize());
        assertEquals(4, store.getCapacity());
    }

    @Test
    public void canGetListOfAllValuesInJerryListObject(){
        JerryList<String> store = new JerryList<>();
        store.add("Apple");
        store.add("Book");
        store.add("Candy");
        store.add("Dandelion");
        store.add("Emitter");
        assertEquals(5, store.getSize());
        assertEquals(5, store.getCapacity());
        String result = store.printListValues();
        System.out.println(result);
    }

    @Test
    public void hasAnOverloadedMethodAddThatCanPlaceNewValuesAtSpecificIndices(){
        JerryList<String> store = new JerryList<>();
        store.add("Apple");
        store.add("Book");
        store.add("Candy");
        store.add("Dandelion");
        store.add("Emitter");
        assertEquals(5, store.getSize());
        assertEquals(5, store.getCapacity());
        store.add("Health", 2);
        store.add("Blueprint", 4);
        assertEquals(7, store.getSize());
    }

    @Test
    public void hasAnOverloadedDeleteMethodThatCanRemoveValuesFromSpecificIndexes(){
        JerryList<String> store = new JerryList<>();
        store.add("Apple");
        store.add("Book");
        store.add("Candy");
        store.add("Dandelion");
        store.add("Emitter");
        assertEquals(5, store.getSize());
        assertEquals(5, store.getCapacity());
        store.delete(3);
        assertEquals(4, store.getSize());
        assertEquals(4, store.getCapacity());
        System.out.println(store.printListValues());
    }

    @Test
    public void canDeleteSpecificValuesFromJerryListObject(){
        JerryList<String> store = new JerryList<>();
        store.add("Apple");
        store.add("Book");
        store.add("Candy");
        store.add("Dandelion");
        store.add("Emitter");
        assertEquals(5, store.getSize());
        assertEquals(5, store.getCapacity());
        store.delete("Candy");
        assertEquals(4, store.getSize());
        assertEquals(4, store.getCapacity());
        System.out.println(store.printListValues());
    }
}
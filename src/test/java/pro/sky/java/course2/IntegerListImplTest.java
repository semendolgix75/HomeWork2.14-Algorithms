package pro.sky.java.course2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class IntegerListImplTest {
    IntegerListImpl integerList;

    @BeforeEach
    public void init() {
        this.integerList = new IntegerListImpl(4);
    }

    @Test
    void shouldAddValueInArray() {
        //given
        Integer expected = 1;
        //when
        Integer actual = integerList.add(1);
        //then
        assertEquals(expected, actual);
    }


    @Test
    void shouldItemBinarySearch() {
        Integer[] array = {2, 3, 4, 10, 40};
        Integer target = 10;
        assertTrue(integerList.binarySearch(array,target));
    }

    @Test
    void set() {
    }

    @Test
    void remove() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void contains() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void lastIndexOf() {
    }

    @Test
    void get() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void clear() {
    }

    @Test
    void toArray() {
    }

    @Test
    void sort() {

    }

    @Test
    void grow() {
    }
}
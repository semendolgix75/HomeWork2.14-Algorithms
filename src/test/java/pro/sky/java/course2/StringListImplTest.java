package pro.sky.java.course2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.exception.ErrorIndexOutOfBoundsException;
import pro.sky.java.course2.exception.ErrorNullPointerException;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {
    StringListImpl stringList;

    @BeforeEach
    public void init() {
        this.stringList = new StringListImpl(4);
    }


    @Test
    void shouldAddValueInArray() {
        //given
        String expected = "test";
        //when
        String actual=stringList.add("test");
        //then
        assertEquals(expected, actual);
    }
    @Test
    void shouldAddValueIndexInArray() {
        //given
        String expected = "test";
        //when
        String actual=stringList.add(0,"test");
        //then
        assertEquals(expected, actual);
    }
    @Test
    void shouldSetValue() {
        //given
        String expected = "test";
        //when
        String actual=stringList.set(0,"test");
        //then
        assertEquals(expected, actual);
    }
    @Test
    void shouldRemoveValue() {
        //given

        //when
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        stringList.remove("test1");
        //then
        assertEquals("test2", stringList.get(0));
    }
    @Test
    void shouldContainValueTrue() {
        //given
        String expected = "test";
        //when
        stringList.add(expected);
        //then
        assertTrue(stringList.contains(expected));
    }
    @Test
    void shouldContainValueFalse() {
        //given
        //when
        stringList.add("test2");
        boolean b=stringList.contains("Test3");
        //then
        assertFalse(stringList.contains("Test3"));
    }
    @Test
    void shouldReturnIndexOf() {
        //given

        //when
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        //then
        assertEquals(1, stringList.indexOf("test2"));
    }
    @Test
    void shouldReturnLastIndexOf() {
        //given

        //when
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        stringList.add("test4");
        //then
        assertEquals(1, stringList.lastIndexOf("test2"));
    }

    @Test
    void shouldThrowExceptionIfValueEqualNull() {
        //given
        String expected = null;
        //when
        //then
        Assertions.assertThrows(NullItemException.class,()->stringList.add(expected));
    }
    @Test
    void shouldThrowExceptionIfIndexOutRange() {
        //given
        int expected = stringList.size()+1;
        //when
        //then
                Assertions.assertThrows(InvalidIndexException.class,()->stringList.get(expected));
    }

    @Test
    void shouldSetValueByIndex() {
        //given
        String expected = stringList.add("Test");
        //when
        String actual=stringList.get(0);
        //then
        Assertions.assertEquals(expected,actual);
    }

}
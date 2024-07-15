package pro.sky.java.course2;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.exception.ErrorIndexOutOfBoundsException;
import pro.sky.java.course2.exception.ErrorNullPointerException;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
        ArrayList arrayList = new ArrayList();
    @BeforeEach
    public void clear() {
        ArrayList arrayList = new ArrayList();

    }

        @Test
        void shouldAddValueInArray() {
            //given
            String expected = "test";
            //when
            arrayList.add("test");
            String actual = arrayList.get(0);

            //then
            assertEquals(1,arrayList.size());
            assertEquals(expected, actual);
        }
    @Test
    void shouldThrowExceptionIfValueEqualNull() {
        //given
        String expected = null;
        //when
        //then
        Assertions.assertThrows(ErrorNullPointerException.class,()->arrayList.add(expected));
    }
    @Test
    void shouldThrowExceptionIfIndexOutRange() {
        //given
        int expected = arrayList.size()+1;
        //when
        //then
        Assertions.assertThrows(ErrorIndexOutOfBoundsException.class,()->arrayList.get(expected));
    }

    @Test
    void shouldSetValueByIndex() {
        //given
        String expected = arrayList.add("Test");
        //when
        String actual=arrayList.get(0);
        //then
        Assertions.assertEquals(expected,actual);
    }
}
package pro.sky.java.course2;

import pro.sky.java.course2.exception.ErrorIndexOutOfBoundsException;
import pro.sky.java.course2.exception.ErrorNullPointerException;
import pro.sky.java.course2.exception.ErrorValueNotFoundInArray;

import java.sql.Array;

public class ArrayList implements StringList {

    private String[] array = new String[1];
    private int size = 1;

    public void setArray(String[] array) {
        this.array = array;
    }

    private void increaseCapacity() {
        String[] newArray = new String[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        size++;
    }

    // Добавление элемента.
    // Вернуть добавленный элемент в качестве результата выполнения.
    @Override
    public String add(String value) {
        if (size == array.length) {
            increaseCapacity();
        }
        if (value == null) {
            throw new ErrorNullPointerException("Список не должен добавлять или хранить в себе null");
        }

        array[size - 1] = value;
        return value;
    }

    // Добавление элемента
    // на определенную позицию списка.
    // Если выходит за пределы фактического
    // количества элементов или массива,
    // выбросить исключение.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    @Override
    public String add(int index, String item) {
        if (index == size || index < 0) {
            throw new ErrorIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == array.length) {
            increaseCapacity();
        }
        if (item == null) {
            throw new ErrorNullPointerException("Список не должен добавлять или хранить в себе null");
        }
        for (int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;

        return item;
    }

    // Установить элемент на определенную позицию, затерев существующий.
    // Выбросить исключение, если индекс больше фактического количества элементов или выходит за пределы массива.
    @Override
    public String set(int index, String item) {
        if (index > size || index < 0) {
            throw new ErrorIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (size == array.length) {
            increaseCapacity();
        }
        if (item == null) {
            throw new ErrorNullPointerException("Список не должен добавлять или хранить в себе null");
        }
        array[index] = item;
        return item;
    }

    // Удаление элемента.
    // Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    @Override

    public String remove(String item) {
        int numRemove = 0;
        int indexRemove = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                numRemove++;
                indexRemove = i
                ;
            }
        }
        String[] resultArray = new String[size - numRemove];
        if (indexRemove == 0) {
            throw new ErrorValueNotFoundInArray("Нет такого элемента");
        }
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != item) {
                resultArray[newIndex++] = array[i];
            }
        }
        array = resultArray;
        size = -indexRemove;
        return item;

    }

    @Override
    public String remove(int index) {
        return null;
    }
//        public String get ( int index)
//        {
//            if (index >= size || index < 0) {
//                throw new ErrorIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//            }
//            return array[index];
//        }
//    }
//
//    @Override
//    public boolean equals(StringList otherList) {
//        return false;
//    }
//
//
//
//


    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }


    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
}



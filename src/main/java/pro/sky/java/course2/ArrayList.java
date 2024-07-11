package pro.sky.java.course2;

import pro.sky.java.course2.exception.ErrorIndexOutOfBoundsException;
import pro.sky.java.course2.exception.ErrorNullPointerException;
import pro.sky.java.course2.exception.ErrorValueNotFoundInArray;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayList implements StringList {

    private String[] array;
    private int size = 1;

    public ArrayList(String[] array) {
    this.array=array;
    }
    public ArrayList() {
        array=new String[1];;
    }
    public void setArray(String[] array) {
        this.array = array;
    }

    private void increaseCapacity() {
        String[] newArray = new String[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        size++;
    }

    public void validateValue(String value) {
        if (value == null) {
            throw new ErrorNullPointerException("Список не должен добавлять или хранить в себе null");
        }
    }

    public void validateIndex(int index) {
        if (index > size || index < 0) {
            throw new ErrorIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }


    // Добавление элемента.
    // Вернуть добавленный элемент в качестве результата выполнения.
    @Override
    public String add(String value) {
        validateValue(value);
        if (size == array.length && array [size-1]!=null) {
            increaseCapacity();
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

        validateValue(item);
        validateIndex(index);
        if (size == array.length) {
            increaseCapacity();
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
        validateIndex(index);
        validateValue(item);

        if (size == array.length) {
            increaseCapacity();
        }
        array[index] = item;
        return item;
    }

    // Удаление элемента.
    // Вернуть удаленный элемент или исключение, если подобный элемент отсутствует в списке.
    @Override

    public String remove(String item) {
        validateValue(item);
        int numRemove = 0;
        int indexRemove = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                numRemove++;
      //         indexRemove = i;
                ;
            }
        }
        String[] resultArray = new String[size - numRemove];
        if (numRemove == 0) {
            throw new ErrorValueNotFoundInArray("Нет такого элемента");
        }
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != item) {
                resultArray[newIndex++] = array[i];
            }
        }
        array = resultArray;
        size = size-numRemove;
        return item;

    }

    // Удаление элемента по индексу.
    // Вернуть удаленный элемент или исключение, если подобный  элемент отсутствует в списке.
    @Override
    public String remove(int index) {
        validateIndex(index);

        String result = array[index];
        String[] resultArray = new String[size - 1];
        for (int i = 0; i < index; i++) {
            resultArray[i] = array[i];
        }
        for (int i = index+1; i < array.length; i++) {
            resultArray[i-1] = array[i];

        }
        array=resultArray;
        return result;
    }


// Проверка на существование элемента.
 // Вернуть true/false;
@Override
public boolean contains(String item) {
    validateValue(item);
    for (int i = 0; i < array.length; i++) {
        if (array[i] == item) return true;
    }

    return false;
}
    // Поиск элемента.
    // Вернуть индекс элемента или -1 в случае отсутствия.
@Override
public int indexOf(String item) {
    validateValue(item);
    for (int i = 0; i < array.length; i++) {
        if (array[i] == item) return i;
    }

    return -1;
}
    // Поиск элемента с конца.
    // Вернуть индекс элемента или -1 в случае отсутствия.
@Override
public int lastIndexOf(String item) {
    validateValue(item);
    for (int i = array.length-1; i >= 0; i--) {
        if (array[i] == item) return i;
    }

    return -1;
}

    // Получить элемент по индексу.
    // Вернуть элемент или исключение, если выходит за рамки фактического  количества элементов.
@Override
public String get(int index) {
    validateIndex(index);

    return array[index];
}
    // Сравнить текущий список с другим.
    // Вернуть true/false или исключение, если передан null.
@Override
public boolean equals(List<String> otherList) {
    List<String> list1 = List.of("one", "two");

    return list1.equals(otherList);
}

    // Вернуть фактическое количество элементов.
public int size() {

    return size;
}
    // Вернуть true, если элементов в списке нет, иначе false.
@Override
public boolean isEmpty() {
    return size==0;
}

@Override
public void clear() {
size=0;
}

@Override
public String[] toArray() {
    return Arrays.copyOf(array, size);
}
}



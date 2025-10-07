/*

Method	Description
add(E e)	Appends an element to the end.
add(int index, E e)	Inserts element at specified index.
get(int index)	Returns element at index.
set(int index, E e)	Replaces element at index.
remove(int index)	Removes element at index.
remove(Object o)	Removes first occurrence of object.
size()	Returns number of elements.
isEmpty()	Checks if list is empty.
contains(Object o)	Checks if element exists.
indexOf(Object o)	Returns first index of element.
subList(from, to)	Returns a sublist.

 */




package CollectionFramework.arraylistprogram;

import java.util.ArrayList;
import java.util.List;

public class No1addElements {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add(0,"banana");
        fruits.addAll(List.of("Mango","Orange"));
        System.out.println(fruits.subList(0,2));
    }

}


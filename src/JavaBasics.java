
import java.util.Scanner;
/**
  --> Camel case in Java Programming
  --> Constant variables --> all capitals and words separated by '_'(static final variables)
  --> to determine size of datatype --> ex: Byte.BYTES
  --> enum(used to define used defined constants)
  --> Static local variables are not allowed
  --> instanceof is a keyword that is used for checking if a reference variable is containing a given type of object reference or not.
  --> In Java, values from -128 to 127 are cached, so the same objects are returned. The implementation of valueOf() uses cached objects if the value is between -128 to 127.
  --> Scanner class - used to read primitive types
  --> cmd line args(When command line arguments are supplied to JVM, JVM wraps these and supply to args[]. It can be confirmed
                      that they are actually wrapped up in args array by checking the length of args using args.length)
  --> I/O Stream
      1: character stream(FileReader) vs byte stream(FileInputStream)
  --> Java.io.BufferedReader class reads text from a character-input stream, buffering characters so as to
      provide for the efficient reading of sequence of characters.
  --> Note: nextLine() is used after nextXXX(){since nextInt() expects a newline we cant read the input for string
  --> Using printf() for c type formatting string
  --> Fast i/o for competetiive
   1: Scanner Class
   2: Buffered Reader
   3: console class
  -->Widening primitive conversion(System.out.print("Y" + "O");
                                   System.out.print('L' + 'O');)prints YO155
  --> Difference between next()(reads input until it encounters white space) and nextLine()(reads input until it encounters newline)
  --> Reader is an abstract class which are extended by buffer reader,inputstream reader
  --> xor is used to flip bits
  --> Arrays are first class objects (length is a menber of arr obj)arr.length gives array's length
  --> Jagged array is array of arrays such that member arrays can be of different sizes, i.e., we can create a 2-D arrays but with variable number of columns in each row.
      These type of arrays are also known as Jagged arrays.
  --> String class in java(Immutable)
  --> Arrays.sort(iterable[]) -->used to sort in ascending order.
  --> Ways to create object of a class
    1: Using new keyword : Test t = new Test();
    2: Using Class.forName(String className) method : Test obj = (Test)Class.forName("com.p1.Test").newInstance();
    3: Using clone() method : Test t1 = new Test(); Test t2 = (Test)t1.clone();
    4: Deserialization : FileInputStream file = new FileInputStream(filename);
                         ObjectInputStream in = new ObjectInputStream(file);
                         Object obj = in.readObject();
  -->  Anonymous objects are the objects that are instantiated but are not stored in a reference variable.
       They are used for immediate method calling.
       They will be destroyed after method calling.
  --> Java is strictly pass by value
  --> In Java, all objects are dynamically allocated on Heap. This is different from C++ where objects can be allocated memory either on Stack or on Heap.
      In C++, when we allocate the object using new(), the object is allocated on Heap, otherwise on Stack if not global or static.
  --> 'this' is a reference variable that refers to the current object.
  --> BigInteger class in java => java.math.BigInteger
  --> comparable interface provides a method compareTo which is used to compare objects of same type(but supports sorting based on single property at a time)
  --> comparator interface provides compare method which is used to compare objects of same types with diff attributes)
  (To summarize, if sorting of objects needs to be based on natural order then use Comparable
   whereas if you sorting needs to be done on attributes of different objects,
   then use Comparator in Java.)
  --> Iterators are used in Collection framework in Java to retrieve elements one by one. There are three iterators.
      // Here "c" is any Collection object. itr is of
     //  type Iterator interface and refers to "c"
         Iterator itr = c.iterator();
 ---------------------------------------------------------------------------------
  Collections :
   1: Stack class extends vector (vector implements list interface)
   2: List interface is implemented by arraylist,linkedlist etc
      List<String> al=new ArrayList<String>();
   3: There are two interfaces for implementing Map in java: Map and SortedMap, and three classes:
      HashMap(implements map), LinkedHashMap(extends hashmap), and TreeMap(implements sortedMap).
      A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
      for(Map.Entry m:map.entrySet())
      Map interface is implemented by Hashmap (doesnt allow duplicates)
      public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>
      Map<String,Integer> map = new HashMap<>();
   4: Set interface: Java HashSet class is used to create a collection that uses a hash table for storage.
      It inherits the AbstractSet class and implements Set interface.
      Set<String> newHashSet = new HashSet<>();
   5: Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface.
      It inherits HashSet class and implements Set interface.
      public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable
   6: Java TreeSet class implements the Set interface that uses a tree for storage.
      It inherits AbstractSet class and implements the NavigableSet interface.
      The objects of the TreeSet class are stored in ascending order.
      public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable
   7: Java Queue interface orders the element in FIFO(First In First Out) manner.
      In FIFO, first element is removed first and last element is removed at last.
      public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable
   8: public interface Deque<E> extends Queue<E>
      public class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>, Cloneable, Serializable
 --------------------------------------------------------------------------------------------------------------------
  oops concepts :
  1:Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects.
    It simplifies the software development and maintenance by providing some concepts:
  2:Object - Object means a real-world entity(Any entity that has state and behavior is known as an object)
    Class  -  A class can also be defined as a blueprint from which you can create an individual object.
              Class doesn't consume any space.(Collection of objects is called class. It is a logical entity.)
    Inheritance - When one object acquires all the properties and behaviors of a parent object, it is known as inheritance.
                  It provides code reusability. It is used to achieve runtime polymorphism
    Polymorphism - If one task is performed by different ways, it is known as polymorphism
    Abstraction - Hiding internal details and showing functionality is known as abstraction.
    Encapsulation - Binding (or wrapping) code and data together into a single unit are known as encapsulation.
 Java static keyword : we can access methods with out object creation (used for memory management)
 this keyword: There can be a lot of usage of java this keyword. In java, this is a reference variable that refers to the current object.
 inheritance( extends) - Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
               It is an important part of OOPs (Object Oriented programming system).
               Inheritance represents the IS-A relationship which is also known as a parent-child relationship
 uses -
    For Method Overriding (so runtime polymorphism can be achieved).
    For Code Reusability.
Aggregation - If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
 Why can we not override static method?
 It is because the static method is bound with class whereas instance method is bound with an object.
 Static belongs to the class area, and an instance belongs to the heap area.
 Wrapper class in java provides the mechanism to convert primitive into object and object into primitive.
 Since J2SE 5.0, autoboxing and unboxing feature converts primitive into object and object into primitive automatically.
    The automatic conversion of primitive into object is known as autoboxing and vice-versa unboxing.
 Regular expressions help in finding or matching the pattern
 ----------------
 --> we can write user defined classes inside a func
 --> String s = sen.replaceAll("\\s+"," ");(matches multiple spaces and replaces them with single space.
 */
import classes.*;
import java.lang.*;
public class JavaBasics {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scan.nextInt();
            }
            triplet new_triplet = new triplet();
            new_triplet.print(arr);
        }
    }



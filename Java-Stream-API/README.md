# Java-Stream-API

* Stream in Java is a sequence of operations applied to a source that provided the data
* Source can be arrays, collections or I/O channels
* Stream is not a data structure
* Stream does not change the data source
* includes zero or multiple intermediate operations

#Create Stream:



#Intermediate operations in stream:

--> filter(): 

           -  Stream filter(Predicate<? super T> predicate) 
           -  parameter: a predicate to apply to each element
           -  return type: a stream consisting of elements of this stream that matches the predicate


--> map():  

           -  <R> Stream<R> map(Function<? super T, ? extends R> mapper)
           -  parameter: a function to apply to each element 
           -  return type: a stream consisting of new elements after applying the function
           -  mapToInt()
           -  mapToLong()
           -  mapToDouble()


--> flatMap(): 

           -  flattens a stream of collections to a stream of elements
           -  intermediate operations such as filter() do not work on stream of collections
           -  Stream<String[]> -> flatMap -> Stream<String>
           -  Stream<Set<String>> -> flatMap -> Stream<String>
           -  Stream<List<String>> -> flatMap -> Stream<String>
           -  flatMapToInt()
           -  flatMapToLong()
           -  flatMapToDouble()


--> Slicing operations:

           - distinct() :  returns stream consisting of distinct elements (using hashCode() and equals())
           - limit(N):     returns stream consisting of elements but no longer than N size, 
                            If N<0 --> IllegalArgumentException
           - skip(N):      returns stream after skipping the first N elements

#Terminal operations in stream: produce the output
 
--> Matching operations: checks if elements in the stream matches a predicate

           - anyMatch(): boolean anyMatch(Predicate<? super T> predicate)

           - allMatch(): boolean allMatch(Predicate<? super T> predicate)
           
           - noneMatch(): boolean noneMatch(Predicate<? super T> predicate)

--> Finding Operations:  

           - findFirst(): Optional<T> findFirst()
           - findAny():   Optional<T> findAny()



        System.out.println( map.descendingKeySet().stream().skip(2).findFirst().get());

package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class Driver {
   
   
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,70,6,100,20,-9,50,80);

        List<Integer>eventNumbers =  list.stream()
                                        .filter(e-> e>20).toList() ;
        Optional<Integer> maxEvenNumbers =  list.stream().max(Integer::compare) ;
        System.err.println(maxEvenNumbers);
        System.out.println(eventNumbers);
        List<String> strings = Arrays
              .asList("apple", "banana", "cherry", "date", "grapefruit");

        StreamUtility streamUtility = new StreamUtility() ;
        //Question-1
        Optional<String> maxLengthString = streamUtility.longestStringInList(strings);
        System.out.println(maxLengthString);

        //Question-2
        List<Person> persons = Arrays.asList(
                                        new Person("Alice", 25),
                                        new Person("Bob", 30),
                                        new Person("Charlie", 35)
                                    );
       double avgage = streamUtility.averageAge(persons);
       System.out.println(avgage); 

       //Question-3
       List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
       List<Integer> primes = streamUtility.primeNumbers(numbers);
       System.out.println(primes);

       //Question-4
       List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
       List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
       List<Integer> ans = streamUtility.mergedList(list1, list2);
       System.out.println(ans);


    }
}

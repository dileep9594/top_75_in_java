package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtility {
    //Find the longest string in a list of strings
    public Optional<String> longestStringInList(List<String> strings){
        Optional<String> longestString = strings
                                        .stream()
                                        .max(Comparator.comparingInt(String::length));
       return longestString ;
    }
    
    //Calculate the average age of a list of Person objects
    public double averageAge(List<Person> persons){
        double avgAge = persons.stream()
                                .mapToInt(Person::getAge)
                                .average()
                                .orElse(0) ;
     return avgAge ;
    } 
    //  Check if a list of integers contains a prime number 
    public boolean isPrime(int number) {
        if (number <= 1) {
          return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
          if (number % i == 0) {
              return false;
          }
        }
        return true;
      }
      public List<Integer> primeNumbers(List<Integer> numbers){
        List<Integer> primes = numbers.stream()
                                .filter((this::isPrime)).toList() ;
       return primes ;
      }
      //Merge two sorted lists into a single sorted list
      public List<Integer> mergedList(List<Integer> list1 ,List<Integer> list2){
        List<Integer> mergedlist = Stream.concat(list1.stream(), list2.stream())
                                        .sorted().toList() ;
        return mergedlist ;
      }
      // Find the intersection of two lists
      public List<Integer> intersectinOfList(List<Integer> list1 ,List<Integer> list2){
        List<Integer> intersectionOflist = list1.stream().filter(list2 :: contains)
                                        .toList() ;
        return intersectionOflist ;
      }
      //Remove duplicates from a list while preserving the order
      public List<Integer> removeDuplicate(List<Integer> numbers){
        List<Integer> uniqueNumbers = numbers.stream()
                                              .distinct()
                                              .toList() ;
       return uniqueNumbers ;
      }

      //Given a list of transactions, find the sum of transaction amounts for each day
      public Map<String,Integer> sumByDay(Transaction transactions){
          
        Map<String,Integer> sumByDay = transactions.stream()
                                                    .collect(Collectors.groupingBy(Transaction :: getDate ,
                                                    Collectors.summingInt(Transaction::getAmount))) ;
       return sumByDay ;                                                    
      }
      // find kth smallest element in a list
      public int kthSmallest(List<Integer> numsbers,int k){
        int kthsmallest = numsbers.stream()
                                         .sorted().skip(k-1).findFirst().orElse(-1) ;
        return kthsmallest ;
      }
      // Given a list of strings, find the frequency of each word
      public Map<String,Long> countFrequency(List<String> strings){
        Map<String, Long> wordFrequency = strings
              .stream()
              .collect(Collectors
                    .groupingBy(Function.identity(), Collectors.counting())
                );
       return wordFrequency ;
      }
      // Given a list of integers, find out all the numbers starting with 1 using
      public List<String> startWithOne(List<Integer> numbers){
        List<String> startwithone = numbers.stream()
                                      .map(s-> s + "")
                                      .filter(s->s.startsWith("1")).toList() ;
      return startwithone;
      }

      // Given a list of integers, find the total number of elements present in the list using Stream functions?
      public long count(List<Integer> numbers){
        long count = numbers.stream().count() ;
      return count ;
      }
      //find max int list 
      public int Max(List<Integer> numbers){
        int count = numbers.stream().max(Integer::compare).get() ;
      return count ;
      }
}

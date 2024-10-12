package javaProblesOnlie;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {


    public static void main(String[] args) {

// List of lists of names
        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("Reflection", "Collection", "String"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream"));

//Creating a set to hold intermediateResults
        Set<String> intermediateResults = new HashSet<>();
//Stream pipeline demostrating various intermediate operations
        List<String> result = listOfLists.stream().

                flatMap(List::stream)
                //Flatten the list of list into a single stream
                .filter(s -> s.startsWith("S"))
                //Filter eleement starting with "S"
                .map(String::toUpperCase)
                //Transform each element to uppercase
                .distinct()
                //remove duplicate elements
                .sorted()
                //Sort elemets

                .peek(s -> intermediateResults.add(s)).collect(Collectors.toList());
            //Perform an action (add to set ) on each element

        System.out.println("Intermediate Results: ");
        intermediateResults.forEach(System.out::println);
        System.out.println("Final Result :");
        result.forEach(System.out::println);


    }
}

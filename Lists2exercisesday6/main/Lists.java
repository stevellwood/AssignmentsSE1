package Modelling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Write a utility class Lists, with static methods described below: match finds all elements that are in both lists and returns a new List that contains only one of each common element
//
//another static method that takes a List<String> as input and th
public class Lists {

    /**
* @return a new List<T> containing only elements that are both in #one and #other (i.e. are "equal") - but just make sure that the returned List<T> is a logical set
*/
public static <T> List<T> match(List<T> one, List<T> other)
{   
    List  <T> combo = new ArrayList<>();
    for (Iterator <T> iterator = other.iterator(); iterator.hasNext();) {
        T next = iterator.next();
        if(one.contains(next)){
            combo.add(next);
        }
    }
    return combo;
}

/**
* @return a new List, ordered by the length of the input strings in descending order
*/
//public static List<String> descendingBySize(List<String> input) {
//    List <String> descends = new ArrayList<>();
//    for (String abc: input) {
//        int next = abc.length();
//        //List<String> sublist = teamsName.subList(1, teamsName.size()); Collections.sort(sublist);        
//        }
//    return descends;
}

//}

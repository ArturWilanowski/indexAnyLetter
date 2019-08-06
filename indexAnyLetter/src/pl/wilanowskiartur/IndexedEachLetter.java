package pl.wilanowskiartur;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class IndexedEachLetter {

    public void indexingLetters(String incomingString) {

        incomingString = incomingString.toLowerCase().replace(",","");
        String[] afterSplitIncString = incomingString.split(" ");

        HashMap<Character, String> wordAssignedToLetter = new HashMap<>();

        for (char ch = 97; ch <= 122; ch++){
            SortedSet<String> sortedSet = new TreeSet<>();
            char[] wordAsCharArray;

            for (String s: afterSplitIncString){
                wordAsCharArray = s.toCharArray();

                for (int i = 0; i < wordAsCharArray.length; i++) {
                    Character charToEqual = wordAsCharArray[i];

                    if (charToEqual.equals(ch)){
                        sortedSet.add(s);
                        break;
                    }
                }
            }
            if (!sortedSet.isEmpty()) {
                String mapValues = sortedSet.toString();

                wordAssignedToLetter.put(ch, mapValues.replace("[","").replace("]",""));
            }
        }

        wordAssignedToLetter.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
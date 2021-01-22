package org.launchcode.java.studios.CharacterCounting;
import java.util.HashMap;
import java.util.Map;
public class CharCounting {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        String characters = "If the product of two terms is zero then common sense says" +
                " at least one of the two terms has to be zero to start with. So if you " +
                "move all the terms over to one side, you can put the quadratics into a form " +
                "that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] charString = characters.toCharArray();
        for (char character : charString){
            if (charCount.containsKey(character)){
                charCount.put(character, charCount.get(character) +1);
            } else {
                charCount.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> oneChar :
         charCount.entrySet()){
            System.out.println(oneChar.getKey() + ":" + oneChar.getValue());
        }
    }
}

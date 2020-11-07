package com.techreturners.exercise004;

public class Exercise004 {

    // Move the first letter of each word to the end of it, then add "ay" to the end of the word.
    // Leave punctuation marks untouched.

    public String pigLatin(String str) {
        // Add your code here
        String[] arrayString = str.split(" ");
        StringBuilder finalString = new StringBuilder();
        for(int i =0; i< arrayString.length; i++){
            finalString.append(logicToReplaceAndAddAy(arrayString[i]));
            if(i < arrayString.length-1){
                finalString.append(" ");
            }
        }
        return finalString.toString();
    }

    private String logicToReplaceAndAddAy(String str) {
        String tempString = str.substring(1);
        if(!Character.isLetter(str.charAt(str.length()-1)) && str.length() > 2){
            tempString = str.substring(1, str.length()-1);
            char endChar = str.charAt(str.length()-1);
            char firstChar = str.charAt(0);
            return tempString+firstChar+"ay"+endChar;
        }
        char firstChar = str.charAt(0);
        return tempString+firstChar+"ay";

    }
}



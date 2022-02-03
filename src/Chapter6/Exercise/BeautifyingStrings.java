package Chapter6.Exercise;

/*
6.21 (Beautifying Strings) Write methods that accomplish each of the following tasks:
a) Check whether the string is terminated by a full stop, and if not, add a full stop.
b) Check whether the string starts with a capital letter, and if not, capitalize the first letter.
c) Use the methods developed in parts (a) and (b) and to write a method beautifyString
that receives a string from the user, and then calls the methods in (a) and (b) to make
sure that the string is properly formatted, in other words, the string has a full stop at
the end, and a capitalized first letter. Make sure you output the string after it has been
beautified!
*/


import java.util.Locale;

public class BeautifyingStrings {


    public static String addFullStopIfNecessary(String text){
        if(text.charAt(text.length() - 1) != '.')
            text = text.concat(".");
        return text;
    }

    public static String capitalizeFirstLetterOfTheText(String text){
        String firstLetter = "r";
        if(text.charAt(0) != text.toUpperCase(Locale.ROOT).charAt(0))
            firstLetter = String.valueOf(text.toUpperCase(Locale.ROOT).charAt(0));
        text = text.replaceFirst(String.valueOf(text.charAt(0)), firstLetter);
        return text;
    }

    public static String beautifyStrings(String text){
        text = addFullStopIfNecessary(text);
        text = capitalizeFirstLetterOfTheText(text);
        return text;
    }

    public static void main(String[] args) {
        String sentence = "this boy is quite the entrepreneur";
        System.out.println(beautifyStrings(sentence));
    }
}

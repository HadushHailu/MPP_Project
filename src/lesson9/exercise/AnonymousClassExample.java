package lesson9.exercise;

import java.util.function.Function;

public class AnonymousClassExample {
    Function<String, String> format = new Function<String, String>() {
        public String apply(String input){
            return Character.toUpperCase(input.charAt(0)) + input.substring(1);
        }
    };
}

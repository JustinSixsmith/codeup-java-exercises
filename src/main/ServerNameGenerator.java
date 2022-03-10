package main;

public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"delirious", "hospitable", "vengeful", "fierce", "fretful", "hard", "husky", "entertaining", "cynical", "juicy", "freezing", "guiltless"};
        String[] nouns = {"ladder", "television", "assistant", "obligation", "chapter", "construction", "orange", "assistance", "combination", "history"};

        String randomAdj = getElement(adjectives);
        String randomNoun = getElement(nouns);
        System.out.printf("Here is your server name: \n%s-%s\n", randomAdj, randomNoun);
    }



    public static String getElement(String[] elements) {
        return elements[(int) Math.floor(Math.random() * elements.length)];
    }
}


package pl.wilanowskiartur;

public class Main {
    final static String someString = "ala ma kota, kot koduje w Javie kota";

    public static void main(String[] args) {

        IndexedEachLetter indexedEachLetter = new IndexedEachLetter();
        indexedEachLetter.indexingLetters(someString);

    }


}

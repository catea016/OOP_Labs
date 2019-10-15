package lab3;

import static lab3.Text.*;

public class Laboratorul3 {
    static String str = "A flower is a special part of the plant. " +
            "Flowers are also called the bloom or blossom of a plant. " +
            "Flowers have petals. Inside the part of the flower that has petals are the parts which produce" +
            " pollen and seeds. " +
            "In all plants , a flower is usually its most colorful part. " +
            "We say the plant flowers , is flowering or is in flower when this colourful part begins to grow bigger and open out. " +
            "There are many differents kinds flowers in different areas in the world." ;

    public static void main(String[] args) {
        System.out.println("This text has:\n"+wordCount(str) + " words,");
        System.out.println(sentencesCount(str) + " sentences,");
        System.out.println(getConsonants(str)+getVowels(str)+ " letters");
        System.out.println(getVowels(str) + " vowels,");
        System.out.println(getConsonants(str) + " consonants,");
        System.out.println("The longest word is - "+getTheLongestWord(str));
        getRepeatedWords(str);
    }

}

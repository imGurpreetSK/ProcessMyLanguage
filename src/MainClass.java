import edu.stanford.nlp.simple.*;

import java.util.List;

/**
 * Created by Gurpreet on 17/09/16.
 */
public class MainClass {

    public static void main(String[] args) {

        Sentence sen = new Sentence("Lucy is in the sky with diamonds.");
        List<String> nerTags = sen.nerTags();  // [PERSON, O, O, O, O, O, O, O]
        String firstPOSTag = sen.posTag(0);   // NNP

        System.out.println(firstPOSTag);
        for (String i : nerTags)
            System.out.println(i + " ");
/*
        Document doc = new Document("add your text here! It can contain multiple sentences.");
        for (Sentence sent : doc.sentences()) {  // Will iterate over two sentences
            // We're only asking for words -- no need to load any models yet
            System.out.println("The second word of the sentence '" + sent + "' is " + sent.word(1));
            // When we ask for the lemma, it will load and run the part of speech tagger
            System.out.println("The third lemma of the sentence '" + sent + "' is " + sent.lemma(2));
            // When we ask for the parse, it will load and run the parser
            System.out.println("The parse of the sentence '" + sent + "' is " + sent.parse());
            // ...
*/
        }


}
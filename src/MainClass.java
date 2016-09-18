import edu.stanford.nlp.naturalli.Polarity;
import edu.stanford.nlp.patterns.surface.Token;
import edu.stanford.nlp.process.Tokenizer;
import edu.stanford.nlp.simple.*;

import java.util.List;

/**
 * Created by Gurpreet on 17/09/16.
 */
public class MainClass {

    public static void main(String[] args) {

        String str = "Holy cow I just met Tom Cruise today!";
        Sentence sentence = new Sentence(str);
        List<Polarity> list = sentence.natlogPolarities();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Polarity of " + i + " is " + list.get(i).toString());
        }

    }

}
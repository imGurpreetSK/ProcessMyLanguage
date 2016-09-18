import edu.stanford.nlp.simple.Sentence;
import edu.stanford.nlp.util.Quadruple;

import java.util.Collection;

/**
 * Created by Gurpreet on 18/09/16.
 */
public class InformationExtraction {

    public static void main(String[] args) {

        String str = "Hello! How are you?";
        Sentence sentence = new Sentence(str);
        Collection<Quadruple<String, String, String, Double>> list = sentence.openie();
        for (int i = 0; i < list.size(); i++) {
            //TODO: print values
        }

    }

}

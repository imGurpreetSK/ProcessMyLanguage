import edu.stanford.nlp.simple.Sentence;

import java.util.List;

/**
 * Created by Gurpreet on 18/09/16.
 */
public class Lemmatization {

    public static void main(String[] args) {

        String str = "Hello! How are you?";
        Sentence sentence = new Sentence(str);
        List<String> list = sentence.lemmas();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Lemma " + i + " is " + list.get(i));
        }

    }

}

import edu.stanford.nlp.simple.Document;
import edu.stanford.nlp.simple.Sentence;

import java.util.List;

/**
 * Created by Gurpreet on 18/09/16.
 */
public class SentenceSplittin {

    public static void main(String[] args) {

        Document doc = new Document("My name is Gurpreet Singh. I currently am going nuts over trying Stanford NLP.\nIts my exam tomorrow, wish me luck.");
        List<Sentence> sentences = doc.sentences();
        for (Sentence sentence : sentences)
            System.out.println(sentence);

    }

}

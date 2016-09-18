import edu.stanford.nlp.ie.machinereading.structure.Span;
import edu.stanford.nlp.simple.Sentence;

import java.util.List;

/**
 * Created by Gurpreet on 18/09/16.
 */
public class HeadOfSpan {

    public static void main(String[] args) {

        String str = "United States president barack Obama had an important issue to address today.";
        Sentence sentence = new Sentence(str);
        List<String> words = sentence.algorithms().keyphrases();      //.headOfSpan(new Span(0, sentence.words().size()));
        for (String word : words) {
            System.out.println(word);
        }

    }

}

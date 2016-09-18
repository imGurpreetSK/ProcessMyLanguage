import edu.stanford.nlp.simple.Sentence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gurpreet on 18/09/16.
 */
public class NamedEntityRecognition {

    public static void main(String[] args) {

        String str = "Hi there, How are you Mr. Barack Obama?";
        List<String> names = findNames(str);
        for (String name : names) {
            if (!name.equals("0"))
                System.out.print(name + " ");
        }

    }

    private static List<String> findNames(String str) {

        Sentence sentence = new Sentence(str);
        List<String> names = sentence.nerTags();
        return names;

    }

}

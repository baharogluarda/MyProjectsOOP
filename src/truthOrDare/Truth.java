package truthOrDare;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Truth {
    private List<String> questions;

    public Truth() {
        questions = new ArrayList<>();
        questions.add("En büyük sırrın nedir?");
        questions.add("Birini hiç aldatır mıydın?");
        questions.add("En büyük korkun nedir?");
    }

    public String getRandomQuestion(){
        Random random = new Random();
        return questions.get(random.nextInt(questions.size()));
    }


}

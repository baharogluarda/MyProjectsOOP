package truthOrDare;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dare {
    private List<String> dares;

    public Dare() {
        dares = new ArrayList<>();
        dares.add("Bir dakika boyunca dans et.");
        dares.add("Yüksek sesle şarkı söyle.");
        dares.add("Bir bardak su iç.");
    }

    public String getRandomDare(){
        Random random = new Random();
        return dares.get(random.nextInt(dares.size()));
    }

}

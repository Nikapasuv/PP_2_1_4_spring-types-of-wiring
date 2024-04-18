package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private Needle7 needle7;

    public Egg6(Needle7 needle7) {
        this.needle7 = needle7;
    }

    @Override
    public String toString() {
        return "яйцо, в яйце — " + needle7.toString();
    }
}
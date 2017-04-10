package ua.edu.uzhnu.biks.practical2;
import com.sun.istack.internal.NotNull;
/**
 * Created by nayko_000 on 25.03.2017.
 */
public class Male extends Person {
    public static final Male DEFAULT = new Male() {
        @Override
        public Male getFather() {
            return Male.DEFAULT;
        }

        @Override
        public Female getMother() {
            return Female.DEFAULT;
        }
    };

    public Male(String name, @NotNull Male father, @NotNull Female mother) {
        super(name, father, mother);
    }

    public Male(String name) {
        this.name= name;
        this.father=Male.DEFAULT;
        this.mother=Female.DEFAULT;

    }
    private Male(){
        super("Невідомий");
    }
}

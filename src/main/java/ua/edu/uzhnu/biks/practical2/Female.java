package ua.edu.uzhnu.biks.practical2;
import com.sun.istack.internal.NotNull;

/**
 * Created by nayko_000 on 26.03.2017.
 */
public class Female extends Person {

   public static final Female DEFAULT= new Female() {

        @Override
       public Female getMother() {
           return Female.DEFAULT;
       }

       @Override
       public Male getFather() {
           return Male.DEFAULT;
       }
   };

    public Female(String name, @NotNull Male father, @NotNull Female mother) {
        super(name, father, mother);


    }
    public Female(String name){
        this.name=name;
        this.mother = Female.DEFAULT;
    }
    private Female(){
        super("Невідомий");
    }

}

package ua.edu.uzhnu.biks.practical2;

import com.sun.istack.internal.NotNull;


/**
 * Created by nayko_000 on 26.03.2017.
 */
public abstract class Person {

        String  name ;
         Male father;
         Female mother;

        public Person(String name, @NotNull Male father,@NotNull Female mother) {
            if (mother == null|| father==null) {
                throw new IllegalArgumentException("Expecting non-null mother and father");
            }
            this.name = name;
            this.father = father;
            this.mother = mother;


        }

        protected Person(String name) {
        this.name = name;
            this.father=Male.DEFAULT;
            this.mother=Female.DEFAULT;
        }

    protected Person() {
    }


    public Female getMother() {
            return mother;
        }

        public Male getFather() {
        return father;
        }

        public String getName() {
        return name;
        }
}

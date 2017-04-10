package ua.edu.uzhnu.biks.practical2;
/**
 * Created by nayko_000 on 26.03.2017.
 */
public class Main {
    public static void main( String[] args) {

        SampleFamilyProvider resolt = new SampleFamilyProvider();
        resolt.makeFamilyTree();
        System.out.println( resolt.makeFamilyTree().getMother().getFather().getName());

    }
}

import java.util.ArrayList;
import java.util.List;

public class ExerciseGenericsEnums {


    /**
     * 1. Fix the FavoriteClasses class to use generics for
     * * its three variables favorite1,favorite2,and favorite3,
     * * its constructor,
     * * its three functions to return each variable
     * * as well as fixing r in the main section.
     * <p>
     * 2. Then define a variable of the FavoriteClasses class and use "Hello", 67, 6.3 as the arguments for the constructor,
     * and when you define it use your favorite classes/types that go with the three arguments.
     * <p>
     * 3. Can we use the Priority enum as a generic? If so please show an example
     * <p>
     * 4. Please declare an Enum with custom constructor and use it
     */

    private enum Priority {
        HIGH, MEDIUM, LOW

        //Exercise 3
        //enum constants cannot be used as generic, single type values are assigned
    }

    //Exercise 4 begin
    private enum ProgrammingLanguage {
        C("C"), JAVA("Java"), KOTLIN("Kotlin");

        private String languageName;

        ProgrammingLanguage(String languageName) {
            this.languageName = languageName;
        }

        @Override
        public String toString() {
            return "ProgrammingLanguage{" +
                    "languageName='" + languageName + '\'' +
                    '}';
        }

        public String getLanguageName() {
            return languageName;
        }
    }
    //Exercise 4 end

    private static class FavoriteClasses<T> {
        private T favorite1;
        private T favorite2;
        private T favorite3;

        FavoriteClasses(T fav1, T fav2, T fav3) {
            this.favorite1 = fav1;
            this.favorite2 = fav2;
            this.favorite3 = fav3;
        }

        @Override
        public String toString() {
            return "FavoriteClasses{" +
                    "favorite1=" + favorite1 + " " + favorite1.getClass() +
                    ", favorite2=" + favorite2 + " " + favorite2.getClass() +
                    ", favorite3=" + favorite3 + " " + favorite3.getClass() +
                    '}';
        }

        public T getFav1() {
            return (this.favorite1);
        }

        public T getFav2() {
            return (this.favorite2);
        }

        public T getFav3() {
            return (this.favorite3);
        }
    }

    public static void main(String[] args) {

        //Exercise 2 begin
        List r = new ArrayList();
        r.add(6.3);
        r.add(5.9);
        FavoriteClasses a = new FavoriteClasses("Hello", 67, r.get(0));
        FavoriteClasses myFavList = new FavoriteClasses("String", 53f, 292939391);
        System.out.println("My favorites are " + a.getFav1() + ", " + a.getFav2() + ", and " + a.getFav3() + ".");
        System.out.println(myFavList);
        //Exercise 2 end

//        System.out.println(a.favorite1.getClass() + " " + a.favorite2.getClass() + " " + a.favorite3.getClass());

        List myProgrammingLanguages = new ArrayList();
        myProgrammingLanguages.add(ProgrammingLanguage.C);
        myProgrammingLanguages.add(ProgrammingLanguage.valueOf("JAVA"));

        System.out.println(myProgrammingLanguages.toString() + " and " + ProgrammingLanguage.KOTLIN.getLanguageName());
    }
}

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
    }

    private static class FavoriteClasses<T> {
        private T favorite1;
        private T favorite2;
        private T favorite3;

        FavoriteClasses(T fav1, T fav2, T fav3) {
            this.favorite1 = fav1;
            this.favorite2 = fav2;
            this.favorite3 = fav3;
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
        List r = new ArrayList();
        r.add(6.3);
        r.add(5.9);
        FavoriteClasses a = new FavoriteClasses("Hello", 67, r.get(0));
        System.out.println("My favorites are " + a.getFav1() + ", " + a.getFav2() + ", and " + a.getFav3() + ".");
    }
}

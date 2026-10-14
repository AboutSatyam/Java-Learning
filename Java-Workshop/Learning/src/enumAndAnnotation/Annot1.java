package enumAndAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface HelloFinal {
    String Final() default " hello"; // single value annotation

}

@interface HelloFinal1 {

    int value();

    String Final(); // Multi value annotation

}

@HelloFinal1(Final = "India", value = 34)

public class Annot1 {
    @HelloFinal(Final = "Done")
    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}

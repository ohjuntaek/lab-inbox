package lab.juntaek.inbox.domain;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
public @interface NaturalId {
}
import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)	//모든 정보값을 얻을 수 있게

public @interface PrintAnnotation {
	String value() default "-";	//기본값 "-"
	int number() default 15;	//기본값 15

}
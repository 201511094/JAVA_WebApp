
//@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
public @interface AnnotationName {
	String elementName1();
	int elementName2() default 5;
	
	String value();

}
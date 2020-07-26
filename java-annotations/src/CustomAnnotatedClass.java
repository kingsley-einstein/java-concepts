@CustomAnnotation
public class CustomAnnotatedClass {
 @CustomAnnotation(name = "Annotated Field")
 String name;

 @CustomAnnotation(code = 3)
 Integer code;

 @CustomAnnotation(name = "Annotated Method", code = 4)
 public void annotatedMethod(String name, Integer code) {}
}
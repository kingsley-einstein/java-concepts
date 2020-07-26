import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
 public static void main(String[] args) {
  Class<CustomAnnotatedClass> clazz = CustomAnnotatedClass.class;
  printAnnotations(clazz);

  Method[] methods = clazz.getDeclaredMethods();

  for (Method method: methods) {
   System.out.println("Printing annotation for: " + method.getName());
   printAnnotations(method);
  }

  Field[] fields = clazz.getDeclaredFields();

  for (Field field: fields) {
   System.out.println("Printing annotation for: " + field.getName());
   printAnnotations(field);
  }
 }

 public static void printAnnotations(AnnotatedElement element) {
  Annotation[] annotations = element.getAnnotations();

  for (Annotation annotation: annotations) {
   System.out.println(annotation);
   if (annotation instanceof CustomAnnotation) {
    CustomAnnotation customAnnotation = (CustomAnnotation) annotation;
    String name = customAnnotation.name();
    Integer code = customAnnotation.code();
    System.out.println(" Name: " + name + " Code: " + code);
   }
  }
  System.out.println();
 }
}
public class StringObjectConcatenate {
    public static void main(String[] args) {
        String course = "History Learning";
        String teacher = "Isaías Rachid";

        String detail = course + " with the teacher " + teacher; //variable con concatenación
        System.out.println(detail);

        int numberA = 1000020;
        int numberB = 123;

        System.out.println(detail + (numberA + numberB)); //cuando concateno strings con una operatoria, tengo que ponerla entre paréntesis
        System.out.println(numberA + numberB + detail); //hace la suma

        String detail2 = course.concat(" with the teacher ".concat(teacher)); //metodo concat() para concatenar dos variables
        System.out.println("Detail2: " + detail2);
    }
}
public class StringValidation {
    public static void main(String[] args) {
        String course = null;
        boolean isNull = course == null;
        System.out.println("isNull = " + isNull);

        if (isNull) {
            course = "Programación Java";
        }
        else{
            course = "Esto es boca";
        }

        System.out.println("Welcome to the course " + course);
    }
}
public class Inmutabilidad {
    public static void main(String[] args) {
        String course = "History Learning";
        final String teacher = "Isaías Rachid";

        String result = course.concat(" " + teacher); //creo un objeto
        System.out.println("course = " + course);
        System.out.println("result = " + result);
        System.out.println(course == result);

        String result2 = course.transform(c -> {   //metodo para convertir un string con una función de flecha
            return c + " with " + teacher;
        });
        System.out.println("course = " + course);
        System.out.println("result2 = " + result2);

        String result3 = result.replace("a", "A"); //función para reemplazar caracteres
        System.out.println("result3 = " + result3);
    }
}

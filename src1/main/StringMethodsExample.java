public class StringMethodsExample {
    public static void main(String[] args) {

        String name = "Isa";

        System.out.println("nombre.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.equals (\"Isa\") = " + name.equals("Isa"));
        System.out.println("name.equals (\"isa\") = " + name.equals("isa"));
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(0) = " + name.charAt(2));
        System.out.println("name.substring() = " + name.substring(1));

        String isaias = "Isaias";
        System.out.println("Isaias = " + isaias.replace("a", "e"));
        System.out.println("Isaias.indexOf('s') = " + isaias.indexOf('s'));
        System.out.println("Isaias.contains('s') = " + isaias.contains("s"));
        System.out.println("Isaias.startsWith(\"Is\") = " + isaias.startsWith("Is"));
        System.out.println("Isaias.endWith(\"as\") = " + isaias.endsWith("s"));
        System.out.println(" Isa ".trim());

    }
}

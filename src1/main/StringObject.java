public class StringObject {
    public static void main(String[] args) {
        String example = "Example of string variable";
        String example1 = new String("Example of string variable"); //valor explícito
        String example2 = "Example of string variable";

        boolean isEqual = example == example1;
        System.out.println("isEqual = " + isEqual); //compara por unidad de memoria en este caso false, son dos espacios de memoria diferentes

        isEqual = example.equals(example1);
        System.out.println("isEqual = " + isEqual); //metodo equals compara por valor

        isEqual = example == example2;
        System.out.println("isEqual = " + isEqual);
    }
}

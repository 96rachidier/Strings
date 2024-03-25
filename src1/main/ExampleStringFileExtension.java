public class ExampleStringFileExtension {
    public static void main(String[] args) {

        String file = "meta.json";
        int i = file.indexOf(".");
        System.out.println(file.substring(4));
        System.out.println("File extension = " + file.substring(i+1));
    }
}

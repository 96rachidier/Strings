public class StringTestPerformanceConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";

        StringBuilder sb = new StringBuilder(a);
        long init = System.currentTimeMillis(); //método que devuelve el tiempo actual en milisegundos

        for (int i = 0; i < 10000; i++) {
            //c = c.concat(a).concat(b).concat("\n");
           // c += a + b + "\n";
            sb.append(a).append(b).append("\n");
        }

        long end = System.currentTimeMillis();
        System.out.println(end - init);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}

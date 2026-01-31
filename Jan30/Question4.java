package Jan30;

public class Question4 {

    //Compare performance of StringBuffer and StringBuilder for concatenating strings.
    public static void compare() {
        int n = 1_000_000;
        String text = "hello";

        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(text);
        }
        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;

        long startBuffer = System.nanoTime();
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            bf.append(text);
        }
        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;

        System.out.println("Time StringBuilder (ns): " + timeBuilder);
        System.out.println("Time StringBuffer  (ns): " + timeBuffer);

        if (timeBuilder > timeBuffer) {
            System.out.println("StringBuffer was faster");
        }
        else{
            System.out.println("StringBuider was faster");
        }
    }

    public static void main(String[] args) {
        compare();
    }
}
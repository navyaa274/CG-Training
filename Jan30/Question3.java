package Jan30;

public class Question3 {

    // Concatenate array of strings using StringBuffer
    public static String concat(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"Hello", " ", "World", "!"};
        String result = concat(arr);
        System.out.println("Concatenated: " + result);
    }
}

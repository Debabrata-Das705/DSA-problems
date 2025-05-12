public class Pract {
    public static void main(String[] args) {
        // String s="Good";
        // System.out.println(s.hashCode());
        // s=s+"morning";
        // System.out.println(s.hashCode());
        StringBuffer s = new StringBuffer("Good");
        System.out.println(s.hashCode());
        s.append("morning");
        System.out.println(s.hashCode());

    }
}

public class Strings {
    public static void main(String[] args) {

        // String are immutable in Java;

        String name1 = "Java";
        String name2 = "Developer";
        String name3 = name1 + " " + name2;
        
        System.out.println(name3);

        // charAt
        System.out.println(name1.charAt(1));

        // length
        System.out.println(name2.length());

        // replace
       String name4 =  name1.replace('a', 'b');
        System.out.println(name4);

        // substring
        System.out.println(name2.substring(0, 4));
    }
}

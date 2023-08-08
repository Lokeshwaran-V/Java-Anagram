import java.util.Arrays;

class HelloWorld {
    static void anagram (String a, String c){
        System.out.println(a);
        System.out.println(c);
        
        //Match the length
        if (a.length() == c.length()){
            System.out.println("Both "+a +" and " +c +" are same length.");

            //Changing the string to lower case
            a = a.toLowerCase();
            c = c.toLowerCase();

            //Storing the string into character array
            char c1[] = a.toCharArray();
            char c2[] = c.toCharArray();

            //Arranging the character array in order
            Arrays.sort(c1);
            Arrays.sort(c2);

            //Returns True or False
            boolean ans = Arrays.equals(c1, c2);
     
            if (ans == true){
                System.out.println("Both "+a +" and " +c +" are anagram.");
            }
            else {
                System.out.println(a +" and " +c +" are not anagram.");
            }
        }
        else{
            System.out.println("length of "+a + " is not equal to the length of " +c);
        }
    }
    public static void main(String[] args) {
        anagram("Listen", "Sildent");
    }
}

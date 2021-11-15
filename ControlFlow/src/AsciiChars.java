public class AsciiChars 
{
    public static void printNumbers()
    {
        System.out.println("Numbers: ");
        for (int i = 48; i < 58; i++) {
            System.out.println((char) i);
        }
    }

    public static void printLowerCase()
    {
        System.out.println("Lowercase letters: ");
        for (int i = 97; i < 123; i++) {
            System.out.println((char) i);
        }
    }

    public static void printUpperCase()
    {
        System.out.println("Uppercase letters: ");
        for (int i = 65; i < 91; i++) {
            System.out.println((char) i);
        }
    }

    public static void main(String[] args) {
        AsciiChars.printNumbers();        
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
    }
}
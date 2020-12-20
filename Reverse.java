import java.io.*;
class Reverse
{
    public static void main(String[] args)throws IOException 
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);

        System.out.println("Enter a Three Digit Number .........");
        int num , a , b , c;
        num = Integer.parseInt(br.readLine());

        c = num%10;
        num = num/10;
        b = num%10;
        num = num/10;
        a = num;

        System.out.println("Reversed Form = "+c+"" +b+""+ a);

    }
}
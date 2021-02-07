import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		


		Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        char c=s.charAt(0);
        int q=scan.nextInt();
        int w=scan.nextInt();
        int e=scan.nextInt();
        int avg=(q+w+e)/3;
        System.out.println(c+"\n"+avg);

    }

package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic1 {

    public static void main(String[] args) {
        int i;
        // 1D Regular Array

        int marks[] = new int[5];

        int l = marks.length;

        Scanner scan = new Scanner(System.in);
        // System.out.println("Kindly Enter Student Marks");

        for (i = 0; i < marks.length; i++) {

            System.out.println("Kindly Enter The Student Marks " + i);
            marks[i] = scan.nextInt();
        }
        System.out.print("Student Marks Are Stored in an array ");

        for (i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + "  ");
        }
        System.out.println("");
        System.out.println("HEllo world");
    }


//	public static int arr(){
//
//	String str[]=new String[8];
//		System.out.println(str[6]);
//	//	System.out.println(Arrays.toString(str));
//	}


}

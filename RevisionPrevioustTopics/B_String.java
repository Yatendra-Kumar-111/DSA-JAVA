//          Date - 09 - 08 - 2024


package RevisionPrevioustTopics;

import java.util.*;

public class B_String {
    public static void main(String[] argss) {
        
        
//  2...copy array
        int a[] = {23,35,657,343,22};
        int b[] = new int[a.length];
        char c[] = {'a', 'b', 'c', 'd'};
        char d[] = new char[c.length];
        String s[] = { "yatendra", " kumar", " Singh" };
        String s1[][] = new String[s.length][3];

        System.arraycopy(a, 0, b, 0, 5);
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.deepToString(s1));

        System.arraycopy(c, 0,d,0,c.length);
        System.out.println(String.valueOf(s1));
        System.out.println(Arrays.toString(d));

        System.arraycopy(s,0, s1, 0, s.length);
        System.out.println(Integer.toString(a[2]));

        System.out.println(String.valueOf(a[2]));







        // Integer aa = new Integer(22);
        // System.out.println(aa.getClass());





//  1...Anonymous Array 
/* 
        print(new int[] {11,22,33,44,55,66,77});        
        System.out.println();
        System.out.print(Arrays.toString(returnArray()));

    }

    static void print(int arr[]){
        System.out.print("Array's Elements : ");
        for(int a : arr )
            System.out.print(a + " ");
    } 
    static int[] returnArray() {
        return (new int[] {111,122,133,144,155});
    }
}   
*/


    }
}   

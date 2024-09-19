/*

->  %d for integer (short, long, int)

->  %f for floating (double, float)
        # %.2f -> .2 represent = after point the number(here, 2) display/print   
        # %5f -> 5 represent = total number should be 5 means if num is '2.3f' & here, total numbers is 3 (2,.,3 = total num are 3). Now, add space of 2 number bcz total is 5 & given num is 3.
        # %5.2f -> 5.2 represent = total number is 5() & .2 same (above)   

->  %b for boolean 
        # %B -> represent uppercase/capital only 
        # %b -> represent default
        
->  %s for string        
        # %S -> represent uppercase/capital only 
        # %s -> represent default
        
->  %c for character
        # %C -> represent uppercase/capital only 
        # %c -> represent default




*/

package RevisionPrevioustTopics;


import java.util.*;
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.Date; 

public class A_Formatting_Using_Printf {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);


//  4...also for formatting(this prog is copied from GFG so at least understand one time)


		// Formatting as per given pattern in the argument 
		SimpleDateFormat ft 
			= new SimpleDateFormat("dd-MM-yyyy"); 
		
		String str = ft.format(new Date()); 
		System.out.println("Formatted Date : " + str); 

		// parsing a given String 
		str = "02/18/1995"; 
		ft = new SimpleDateFormat("MM/dd/yyyy"); 
		Date date = ft.parse(str); 

		// this will print the date as per parsed string 
		System.out.println("Parsed Date : " + date); 










//  3...For Date and Time Formatting
        // Date myTime = new Date(); 

        // System.out.printf("Time : %tT\n", myTime);
        // System.out.printf("%tH hours :: %tM minutes :: %tS seconds\n", myTime, myTime, myTime);
        
        // System.out.format("time -> %tT", myTime);



//  2...Formatting Using Java Printf
/* 
        int a=456123;     float f = 3.34343f;   char c = 'y'; boolean bool = true;
        byte b = 123; short s = 2345; long l = 34545343; double d = 344543.435453534;
        String str = "yatendra KUMAR";          
        Integer intClass = null;
        Boolean boolClass = true;

        
        System.out.printf("Boolean -> %b\tChar -> %c\tString -> %s\n",b, c, str);

        System.out.println();
        
        System.out.printf("Boolean -> %B\tChar -> %C\tString -> %S\n",b, c, str);

        System.out.println();

        System.out.printf("Boolean -> %B\nBoolean(Integer Class) -> %B\n",boolClass, intClass);




    //     System.out.printf("Int -> %d\tFloat -> %f\tChar -> %c\n",a, f, c);


    // System.out.printf("Int -> %d\tFloat -> %10f\tChar -> %c\n",a, f, c);


    //     System.out.printf("Int -> %d\tFloat -> %6.2f\tChar -> %c\n",a, f, c);
        
    //     System.out.printf("Int -> %b\tFloat -> %b\tChar -> %B",a, f, c);
        
    //     System.out.printf("Int -> %d\tFloat -> %6.2f\tChar -> %c\n",a, f, c);


*/










//  1...scanner_obj.hasNextABC()        here, ABC are Int, Float, Short, etc (primitive data type)
/* 
        System.out.print("::::Program start::::\n");

        System.out.println("Hello\n");
        // while(sc.hasNextInt()) {
        //     System.out.print("enter : ");
        //     double aa = sc.nextDouble();
        // }

        if(sc.hasNextInt()) 
        {
            System.out.println("enter : ");
            int aaa = sc.nextInt();
            System.out.println("value is : " + aaa);
        }

*/



    }
}

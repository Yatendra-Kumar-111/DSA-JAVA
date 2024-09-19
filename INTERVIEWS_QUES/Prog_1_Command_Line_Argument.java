/* 
    ------------NOTES---------
    open terminal(cmd) & path set of file then,
    -> java  'space'  file_name.java   (only java in starting. ye bracket vala nahi likhna)

(imp)-> javac nahi lagana jab arguments dete hai. (confirm hai ye baat to)



*/
package INTERVIEWS_QUES;

public class Prog_1_Command_Line_Argument {
    public static void main(String[] args) {

        if(args.length > 0)
        {
            for(int i=0; i<args.length; i++)
            {
                System.out.println(args[i]);
            }
        } else {
            System.out.println("There is no arguments.");
        } 







// How to check String is class or data type?

        // String a = new String();
        // a = "yatendra Kumar";
        // System.out.println(a.getClass());
        // System.out.println(a.getClass().getName());
    }
}

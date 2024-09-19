package INTERVIEWS_QUES.Youtuber_VDOs;

public class Prog1_Swapping_Object_Variables {
    static int a = 22;
    static int b = 33;

    public static void swapping(Prog1_Swapping_Object_Variables obj) {
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
    }
    public static void main(String[] args) {

        
        System.out.println("\t:::Before Swapping:::\na = " + a + "\tb = " + b);
        
        Prog1_Swapping_Object_Variables passObjReference = new Prog1_Swapping_Object_Variables();
        swapping(passObjReference);
        
        System.out.println("\t:::After Swapping:::\na = " + a + "\tb = " + b);
    }
}

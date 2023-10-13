// *******************( " FINALLY BLOCK " )***************

import java.util.*;

public class FinalBlock{

public static void main(String[]args){

try{
System.out.println("I'm Excuted First !!!");
System.out.println(100/0);
System.out.println("May be I'm Excuted First !!!");
}
catch(Arithematic Exception s){
System.out.println("I'm Excecuted when Exception Occurs !!!");
}
Finally{
System.out.println("Hey I'm also here!!!");
}

}
} // Maintainance Required

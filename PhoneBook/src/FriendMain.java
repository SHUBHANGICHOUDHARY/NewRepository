import java.util.ArrayList;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FriendMain 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FriendDemo t1=new FriendDemo();
		t1.addnew("Shubhangi", "7654333210");
		t1.addnew("Mounika","8765776655");
		
		t1.modifynumber("shubhangi", "9875444566");
		
		System.out.println(t1.FindNumber("Shubhangi"));
		
		System.out.println(t1.FindNumber("Mounika"));
		
		
	}
} 

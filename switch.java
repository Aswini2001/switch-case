package myjava;

import java.util.Scanner;
import JavaMin.*;

public class SwitchCase {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
  System.out.println("pick one:\n1.hi\n2.hey\n3.helloo.\n");
  Scanner sc = new Scanner (System .in);
  int choice = sc.nextInt();
  switch(choice)
  {
  case 1:System.out.println("you said hi!!");
   break;
  case 2:System.out.println("you said hey!!");
  break;
  case 3:System.out.println("you said hello!!");
  break;
  default :System.out.println("invalid option");
  }
	}

}

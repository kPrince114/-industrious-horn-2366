package ALLWORK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Exeception.EmpolyExecption;
import Exeception.EngineerExecption;
import Model.Engineer;
import Model.complain;

public class show {

	public static void main(String[] args) throws EngineerExecption, EmpolyExecption {
		int i=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Your username");
		String username=sc.nextLine();
		System.out.println("enter Your password");
		int password=sc.nextInt();
		implinterface1 s=new implinterface1();
		int p=s.changeEmppassword(username,password);
		if(p==1) {
			i++;
			System.out.println("change your password");
		}
		else {
			System.out.println("not change your password.....");
		}
		
	}

}

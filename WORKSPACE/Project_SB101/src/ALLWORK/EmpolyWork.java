package ALLWORK;

import java.util.Scanner;

import Exeception.EmpolyExecption;
import printclass.consolecolor;

public class EmpolyWork {
	public int showtableEmploy() {
		Scanner sc =new Scanner(System.in);
		System.out.println(consolecolor.BROWN+"+-----------------------------------------------+\n"
				+ "|  ENTER YOUR NUMBER                            |\n"
				+ "+-----------------------------------------------+\n"
				+ "|                                               | \n"
				+ "| 1.registar your complain                		|\n"
				+ "| 2.empoly see my problem status                |\n"
				+ "| 3.see all complain history          			|\n"
				+ "| 4.change our password                         |\n"
				+ "| 5.Exit                        				|\n"
				+ "+-----------------------------------------------+\n"
				+ ""+consolecolor.RESET);
		System.out.println("Enter number as you wise...........");
		int number =sc.nextInt();
		return number;
	}
	public int addempoly() throws EmpolyExecption {
		Scanner sc =new Scanner(System.in);
		int i=0;
		System.out.println("enter empoly username");
		String username=sc.nextLine();
		System.out.println("enter Engineer Password");
		int Password=sc.nextInt();
		implinterface1 s=new implinterface1();
		int p=s.insertEmpoly(username,Password);
		if(p==1) {
			System.out.println(consolecolor.BLACK_BACKGROUND+"insert your data"+consolecolor.RESET);
		}
		else {
			System.out.println(consolecolor.RED+"worng Information");
		}
		
		return i;
	}
	public boolean loginempoly() throws EmpolyExecption {
		boolean con1=false;
		while(true) {
			Scanner sc =new Scanner(System.in);
			System.out.println("enter Your username");
			String username=sc.nextLine();
			System.out.println("enter Your Password");
			int PASSWORD=sc.nextInt();
			implinterface1 s=new implinterface1();
			int p=s.loginempoly(username,PASSWORD);
			if(p==1) {
				
				System.out.println(consolecolor.BLACK_BACKGROUND+"login Sucessfully"+consolecolor.RESET);
				con1=true;
				break;
			}
			else {
				System.out.println(consolecolor.RED+"wrong your username and password"+consolecolor.RESET);
			}
		}
		
		return con1;
		
	}
	public int complainByEmpoly() throws EmpolyExecption {
		int i=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Your problem hardware/software");
		String description=sc.next();
		System.out.println("enter Your id");
		int id=sc.nextInt();
		implinterface1 s=new implinterface1();
		int p=s.complainByEmpoly(description,id);
		if(p==1) {
			System.out.println(consolecolor.BLACK_BACKGROUND+"insert your data");
			i++;
		}
		else {
			System.out.println(consolecolor.RED+"not insert");
		}
	
	return i;
	}
	public int PrintproBlembyComId() throws EmpolyExecption {
		int i=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Your complain id");
		int id=sc.nextInt();
		implinterface1 s=new implinterface1();
		int p=s.printcomplainbycomplainid(id);
		if(p==1) {
			i++;
		}
		return i;
	}
	public int printallproblemhistroy1() throws EmpolyExecption {
		int i=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Your empoly id");
		int id=sc.nextInt();
		implinterface1 s=new implinterface1();
		int p=s.printcomplainbycomplainid(id);
		if(p==1) {
			i++;
		}
		return i;
	}
	public int changepasswordEmp() throws EmpolyExecption {
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
		return i;
	}
	

}

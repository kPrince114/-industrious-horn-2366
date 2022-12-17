package ALLWORK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import printclass.consolecolor;

import Exeception.EngineerExecption;
import Model.Engineer;

public class HodALLFunction {
	Scanner sc=new Scanner(System.in);
	public int  firstFun() {
		System.out.println(consolecolor.BANANA_YELLOW+"+--------------+\n"
				+ "| enter numer  |\n"
				+ "+--------------+\n"
				+ "| 1.HOD        |\n"
				+ "| 2.Engineer   |\n"
				+ "| 3.Employee   |\n"
				+ "| 4.Exit       |\n"
				+ "+--------------+"+consolecolor.RESET);
		System.out.println(consolecolor.GREEN+"Enter your Number accoding Your Work"+consolecolor.RESET);
		int n=sc.nextInt();
		return n;
		
	}
	public boolean Firstkafirst() {
		boolean con1=false;
		while(true) {
			System.out.println(consolecolor.YELLOW_BOLD+"enter Your email"+consolecolor.RESET);
			String HODEMAIL=sc.next();
			System.out.println(consolecolor.YELLOW_BOLD+"enter Your Password"+consolecolor.RESET);
			int HODPASSWORD=sc.nextInt();
			implinterface1 s=new implinterface1();
			int p=s.checkHODDetails(HODEMAIL, HODPASSWORD);
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
	public int HodWorkType() {
		System.out.println(consolecolor.GREEN+"+-----------------------------------------------+\n"
				+ "|  ENTER YOUR NUMBER                             |\n"
				+ "+-----------------------------------------------+\n"
				+ "|                                               | \n"
				+ "| 1.add New Enginner                            |\n"
				+ "| 2.list of all Engineer                        |\n"
				+ "| 3.delect Engineer from System                 |\n"
				+ "| 4.check all Problem                           |\n"
				+ "| 5.assign any problem in any engineer          |\n"
				+ "| 6.Exit                                        |\n"
				+ "+-----------------------------------------------+"+consolecolor.RESET);
		System.out.println("Enter your Number accoding Your Work");
		int EngWork=sc.nextInt();
		
		return EngWork;
	}
	public int addEng() throws EngineerExecption {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Engineer username");
		String username=sc.nextLine();
		System.out.println("enter Engineer Password");
		int Password=sc.nextInt();
		System.out.println("enter Engineer complaneID");
		int complaneID=sc.nextInt();
		System.out.println("enter Engineer categiry");
		String categiry=sc.next();
		implinterface1 s=new implinterface1();
		int p=s.insertEng(username,Password,complaneID,categiry);
		if(p==1) {
			System.out.println(consolecolor.BLACK_BACKGROUND+consolecolor.WHITE+"insert your data"+consolecolor.RESET);
		}
		else {
			System.out.println("worng Information");
		}
		return p;
	}
	public void printallEngineer() throws EngineerExecption {
		implinterface1 s=new implinterface1();
		List<Engineer> dtos = new ArrayList<>();
		dtos=s.ListofEngineer();
		if(dtos.size()>0) {
			dtos.forEach(e->{
				System.out.println(e.toString());
				
			});
				
			
		}
		else {
			System.out.println("list Empty");
		}
	}
	public void delectEng() throws EngineerExecption {
		implinterface1 s=new implinterface1();
		System.out.println("Enter Engineer id which you delect");
		int n=sc.nextInt();
		
		int del=s.DelectEng(n);
		if(del==1) {
			System.out.println(consolecolor.BLACK_BACKGROUND+"delect your Engineer detail");
		}
		else {
			System.out.println("some essue your Engineer detail");
		}
		
	}
	public int seeAllProble() {
		implinterface1 s=new implinterface1();
		s.seeproblemall();
		return 1;
		
	}
	public int  AssignProblemEng() throws EngineerExecption {
		implinterface1 s=new implinterface1();
		System.out.println("Enter Engineer id to assign problem");
		int eid=sc.nextInt();
		System.out.println("Enter complain id in complain class ");
		int cid=sc.nextInt();
		int p=s.assignProblemEngineer(eid,"assign",cid);
		if(p==1) {
			System.out.println(consolecolor.BLACK_BACKGROUND+"assign your problem in Engineer");
			System.out.println(consolecolor.GREEN_BOLD+"if you are see than check complain table.");
			
		}
		return 1;
	}

}


















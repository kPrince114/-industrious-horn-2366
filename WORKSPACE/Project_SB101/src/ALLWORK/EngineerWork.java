package ALLWORK;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Exeception.EngineerExecption;
import Model.complain;
import printclass.consolecolor;
public class EngineerWork {
	private String username;
	private int password;
	private int cid;
	private int comid;
	
	public EngineerWork() {
		
		
		
	}
	public boolean Englogin() throws EngineerExecption {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ur User name : ");
		this.username=sc.nextLine();
		System.out.print("Enter ur Password : ");
		this.password=sc.nextInt();
		boolean con1=false;
			implinterface1 s=new implinterface1();
			int p=s.LoginEngineer(this.username,this.password);
			if(p==1) {
				System.out.println("login Sucessfully");
				con1=true;
			}
			else {
				System.out.println("wrong your username and password");
			}
		return con1;
	}
	public int showEngineerWork() {
		Scanner sc = new Scanner(System.in);
		System.out.println(consolecolor.LIGHT_PINK+"+-----------------------------------------------+\n"
				+ " |  ENTER YOUR NUMBER                            |\n"
				+ " +-----------------------------------------------+| \n"
				+ " | 1.View All Problem AAsign by HOD              |\n"
				+ " | 2.update your problem by self                 |\n"
				+ " | 3.they can see all problem attend by self     |\n"
				+ " | 4.Engineer change our password                |\n"
				+ " | 5.Exit                                        |\n"
				+ " +-----------------------------------------------+\""+consolecolor.RESET);
		
			System.out.println("Enter Number , if you wnat to do accoding the table. ");
			int number =sc.nextInt();
		
		return number;
		
	}
	public int veiwAllproblemEng() throws EngineerExecption {
		
		implinterface1 s=new implinterface1();
		int i=s.veiw();
		return i;
	}
	public int updateproblemStatus() throws EngineerExecption {
		Scanner sc = new Scanner(System.in);
		implinterface1 s=new implinterface1();
		System.out.println("Enter Your Status if what do want to assign ");
		String status=sc.nextLine();
		System.out.println("Enter Your complain id ");
		int cid=sc.nextInt();
		System.out.println("Enter Your Status if what do want to assign ");
		String attend=sc.next();
		int i=s.StatusUpdateByEng(status, cid,attend);
		if(i==1) {
			System.out.println("Problem Status is update ");
		}
		return 1;
	}
	public int listofproblemattendbyeng() throws EngineerExecption {
		Scanner sc=new Scanner(System.in);
		implinterface1 s=new implinterface1();
		List<complain> dtos = new ArrayList<>();
		System.out.println("Enter your id");
		int id=sc.nextInt();
		dtos=s.listofProblemattendByself(id);
		if(dtos.size()>0) {
			dtos.forEach(e->{
				System.out.println(e.toString());
				
			});
		}
		return 1;
		
	}
	public int changepaswordbyEngself() throws EngineerExecption {
		Scanner sc=new Scanner(System.in);
		implinterface1 s=new implinterface1();
		//System.out.println("Enter Your previous username");
		//String username=sc.nextLine();
		System.out.println("Enter Your new password");
		int password=sc.nextInt();
		int i=s.changepaswordbyEngself(this.username, password);
		if(i==1) {
			System.out.println("change password successfully .......");
		}
		else {
			System.out.println("not change password successfully .......");
		}
		return 1;
	}
	

}

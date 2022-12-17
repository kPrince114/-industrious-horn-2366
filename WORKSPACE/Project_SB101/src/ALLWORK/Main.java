package ALLWORK;

import java.util.Scanner;

import Exeception.EmpolyExecption;
import Exeception.EngineerExecption;

public class Main {

	public static void main(String[] args) throws EngineerExecption, EmpolyExecption {
		Scanner sc=new Scanner(System.in);
		
		HodALLFunction fc=new HodALLFunction();
		
			while(true) {
				int n=fc.firstFun();
			
				if(n==1) {
					boolean con1=fc.Firstkafirst();
				//fun1()
					if(con1==true) {
						while(true) {
							int HODWork=fc.HodWorkType();
								if(HODWork==1) {
									int addEng=fc.addEng();
									while(addEng==0) {
										addEng=fc.addEng();
											if(addEng==1) {
												break;
											}
									}
								}
						
								else if(HODWork==2) {
									fc.printallEngineer();
								
								}
								else if(HODWork==3) {
									fc.delectEng();
								}
								else if(HODWork==4) {
									fc.seeAllProble();						
								}
								else if(HODWork==5) {
									fc.AssignProblemEng();
								}
								else if(HODWork==6) {
									break;
								}	
						}
					}
				}
				if(n==2) {
					System.out.println("first login Your Account  ");
					EngineerWork engW=new EngineerWork();
					boolean con1=false;
					while(!con1) {
						con1=engW.Englogin();
					}
					
					while(true) {
						int sw=engW.showEngineerWork();
						if(sw==1) {
							int i=engW.veiwAllproblemEng();
						}
						else if(sw==2) {
							int i=engW.updateproblemStatus();
						}
						else if(sw==3) {
							int i=engW.listofproblemattendbyeng();
						}
						else if(sw==4) {
							int i=engW.changepaswordbyEngself();
						}
						else if(sw==5) {
							break;
						}	
					}
				}
				if(n==3) {
					EmpolyWork ew=new EmpolyWork();
					
					System.out.println("+-------------------------------------------+\n"
							+ "| Enter your number   						|\n"
							+ "+-------------------------------------------+\n"
							+ "| 1. you are resister your account        	|\n"
							+ "| 2.if you are already register then login  |\n"
							+ "+-------------------------------------------+");
						int x=sc.nextInt();
						boolean con;
						if(x==1) {
							int i=ew.addempoly();
						}
						else if(x==2) {
							con=ew.loginempoly();
						}
					if(con=true) {
						while(true) {
							int number=ew.showtableEmploy();
							if(number==1) {
								int i=ew.complainByEmpoly();
							}
							else if(number==2) {
								int i=ew.PrintproBlembyComId();
							}
							else if(number==3) {
								int i=ew.printallproblemhistroy1();
							}
							else if(number==4) {
								int i=ew.changepasswordEmp();							
							}
							else if(number==5) {
								break;
							}
						}	
					}
				}
				if(n==4) {
					System.out.println("***Your Ststem is close.........**");
					System.out.println("thinku for use my website");
					break;
				}
			}	
	}
}	
	
	
// UPDATE complain INNER JOIN Engineer ON complain.cid+4 = Engineer.id SET complain.id = Engineer.id where complain.cid=1;	
		
		

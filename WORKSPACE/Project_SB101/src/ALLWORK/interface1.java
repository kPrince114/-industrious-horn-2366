package ALLWORK;
import java.util.List;
import Model.*;

import Exeception.*;
public interface interface1 {
	public String print();
	public int checkHODDetails(String username,int password);
	public int insertEng(String username,int password,int custormerId,String cat)throws EngineerExecption;
	public List<Engineer> ListofEngineer() throws EngineerExecption;
	public int DelectEng(int id)throws EngineerExecption;
	public void seeproblemall();
	public int assignProblemEngineer(int aid, String status,int cid)throws EngineerExecption;
	//end your HOD work 
	//***************************************
	// start Engineer Work;
	public int LoginEngineer(String username,int password )throws EngineerExecption;
	public int veiw()throws EngineerExecption;
	public int StatusUpdateByEng(String status,int cid,String attend)throws EngineerExecption;
	public List<complain> listofProblemattendByself(int id)throws EngineerExecption;
	public int changepaswordbyEngself(String username,int password)throws EngineerExecption;
	//end your Engineer work 
	//***************************************
	// start Empolyes Work;
	public int insertEmpoly(String username,int password)throws EmpolyExecption;
	public int loginempoly(String username,int password)throws EmpolyExecption;
	public int complainByEmpoly(String description, int eid)throws EmpolyExecption;
	public int printcomplainbycomplainid(int id)throws EmpolyExecption;
	public int printallproblemhistroy(int eid)throws EmpolyExecption;
	public int changeEmppassword(String username,int password)throws EmpolyExecption;
	
}

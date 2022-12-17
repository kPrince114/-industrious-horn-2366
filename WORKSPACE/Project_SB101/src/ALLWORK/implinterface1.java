package ALLWORK;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Exeception.EmpolyExecption;
import Exeception.EngineerExecption;
import Model.Engineer;
import Model.complain;
//import Exeception.EngineerExecption;
public class implinterface1 implements interface1 {

	@Override
	public String print() {
		String message = "Not Print..!";

		try (Connection conn = common.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from pk1");
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				System.out.println("namedept is :" + rs.getString("Email") + "location is " + rs.getFloat("cis"));

				message = "Student priont Sucessfully..!";

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return message;
	}

	@Override
	public int checkHODDetails(String username, int password) {
		int i=0;
		try (Connection conn = common.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from HOD where username=? and password=?");
			ps.setString(1, username);
			ps.setInt(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				i++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		return i;
	}

	@Override
	public int insertEng(String username, int password, int custormerId,String cat)throws EngineerExecption {
		int i=0;

		try (Connection conn = common.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into Engineer (username,password,complainId,categri)  values(?,?,?,?)");
			
			ps.setString(1, username);
			ps.setInt(2, password);
			ps.setInt(3, custormerId);
			ps.setString(4,cat);
			int x= ps.executeUpdate();

			if (x>0) {
				i++;
				//System.out.println("insert your Engineer");

				

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return i;
	}

	@Override
	public List<Engineer> ListofEngineer() throws EngineerExecption {
		
		List<Engineer> dtos = new ArrayList<>();
		
		
		try (Connection conn= common.provideConnection()){
			
			
			
			PreparedStatement ps= conn.prepareStatement("select * from Engineer ");
			
			ResultSet rs= ps.executeQuery();
			
				while(rs.next()) {
					int n=rs.getInt("id");
					String username=rs.getString("username");
					int pas=rs.getInt("password");
					int compaliid=rs.getInt("complainId");
					String categri=rs.getString("categri");
					Engineer eng=new Engineer();
					eng.setId(n);
					eng.setUsername(username);
					eng.setPassword(pas);
					eng.setComplainId(compaliid);
					eng.setCategri(categri);
					dtos.add(eng);
					//System.out.println();
				}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			throw new EngineerExecption(e.getMessage());
		}

		return dtos;
		
	}

	@Override
	public int DelectEng(int id) throws EngineerExecption {
		int i=0;
		try(Connection conn= common.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("DELETE FROM  Engineer where id=? ");
			ps.setInt(1,id);
			int s= ps.executeUpdate();
			
			if(s>0)
				i++;
			
		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
		
		return i;
	}

	@Override
	public void seeproblemall() {
		
		
		try (Connection conn = common.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from complain ");
			ResultSet rs = ps.executeQuery();

		 while(rs.next()) {
				System.out.println("no."+rs.getInt("cid")+","+" description:- "+rs.getString("description")+","+" status is :- "+rs.getString("satus"));
			}

		} catch (SQLException e) {
			System.out.print(e.getMessage());
		}
	}

	@Override
	public int assignProblemEngineer(int aid, String status,int cid) throws EngineerExecption {
		int i=0;
		try (Connection conn = common.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("update complain set id=?, satus=? where cid=?");
			ps.setInt(1, aid);
			ps.setString(2, status);
			ps.setInt(3, cid);
			int s= ps.executeUpdate();
			
			if(s>0) {
			i++;
			}

		} 
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
		return i;
		
	}

	@Override
	public int LoginEngineer(String username, int password) throws EngineerExecption {
		int i=0;
//		String massage=""
		try (Connection conn = common.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from Engineer where username=? and password=?");
			ps.setString(1, username);
			ps.setInt(2, password);
			
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				i++;
			}

		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.print(e.getMessage());
			//throw new EngineerExecption("Invalid Username or password..");
		}
		
		return i;
	}

	@Override
	public int veiw() throws EngineerExecption {
		int i=0;
//		String massage=""
		try (Connection conn = common.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("SELECT description,cid FROM complain INNER JOIN Engineer ON complain.id = Engineer.id");
			
			
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				System.out.println("complain id is: " + rs.getInt("cid") + "  problem:-  " + rs.getString("description"));
				i++;
			}

		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.print(e.getMessage());
			//throw new EngineerExecption("Invalid Username or password..");
		}
		
		return i;
	}

	@Override
	public int StatusUpdateByEng(String status,int cid,String attend) throws EngineerExecption {
		int i=0;
//		String massage=""
		try (Connection conn = common.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("UPDATE complain SET satus = ?,attend=? WHERE cid=?");
			ps.setString(1, status);
			ps.setString(2, attend);
			ps.setInt(3, cid);
			int x= ps.executeUpdate();
			if (x>0) {
				i++;
			}

		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.print(e.getMessage());
			//throw new EngineerExecption("Invalid Username or password..");
		}
		
		return i;
	}

	@Override
	public  List<complain> listofProblemattendByself(int id) throws EngineerExecption {
		List<complain> dtos = new ArrayList<>();
		try (Connection conn= common.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from complain where id=? and attend='yes'");
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			
				while(rs.next()) {
					int cid=rs.getInt("cid");
					String description=rs.getString("description");
					int eid=rs.getInt("eid");
					String attend=rs.getString("attend");
					String satus=rs.getString("satus");
					complain com=new complain();
					com.setId(cid);
					com.setDescription(description);
					com.setEid(eid);
					com.setAttend(attend);
					com.setSatus(satus);
					dtos.add(com);
					//System.out.println();
				}
		} 
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}

		return dtos;
	}

	@Override
	public int changepaswordbyEngself(String username, int password) throws EngineerExecption {
		int i=0;
		try(Connection conn= common.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("UPDATE Engineer SET password=? WHERE username=?");
			ps.setInt(1,password);
			ps.setString(2,username);
			int s= ps.executeUpdate();
			
			if(s>0) {
				i++;
			
			}
			
		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
		
		return i;
	}

	@Override
	public int insertEmpoly(String username, int password) throws EmpolyExecption {
		int i=0;

		try (Connection conn = common.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into empoly (username,password)  values(?,?)");
			
			ps.setString(1, username);
			ps.setInt(2, password);
			
			int x= ps.executeUpdate();

			if (x>0) {
				i++;
				System.out.println("insert your empoly sucessfully.........");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return i;
	}

	@Override
	public int loginempoly(String username, int password) throws EmpolyExecption {
		int i=0;
//		String massage=""
		try (Connection conn = common.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from empoly where username=? and password=?");
			ps.setString(1, username);
			ps.setInt(2, password);
			
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				i++;
			}

		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.print(e.getMessage());
		}
		
		return i;
	}

	@Override
	public int complainByEmpoly(String description, int eid) throws EmpolyExecption {
		int i=0;
//		String massage=""
		try (Connection conn = common.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into complain (description,eid) values (?,?)");
			ps.setString(1, description);
			ps.setInt(2, eid);
			int x= ps.executeUpdate();

			if (x>0) {
				i++;
			}

		} catch (SQLException e) {
			System.out.print(e.getMessage());
		}
		
		return i;
	}

	@Override
	public int printcomplainbycomplainid(int id) throws EmpolyExecption {
		int i=0;
//		String massage=""
		try (Connection conn = common.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from complain where cid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				i++;
				System.out.println("complain Id:- "+rs.getInt("cid")+", "+"  problem is :-"+rs.getString("description")+", "+" Stetus :- "+rs.getString("satus"));
			}
		} catch (SQLException e) {
			System.out.print(e.getMessage());
		}
		
		return i;
	}

	@Override
	public int printallproblemhistroy(int eid) throws EmpolyExecption {
		int i=0;
//		String massage=""
		try (Connection conn = common.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from complain where eid=?");
			ps.setInt(1, eid);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				i++;
				System.out.println("complain Id:- "+rs.getInt("cid")+", "+"  problem is :-"+rs.getString("description")+", "+" Stetus :- "+rs.getString("satus"));
			}
		} catch (SQLException e) {
			System.out.print(e.getMessage());
		}
		
		return i;
	}

	@Override
	public int changeEmppassword(String username, int password) throws EmpolyExecption {
		int i=0;
		try(Connection conn= common.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("UPDATE empoly SET password=? WHERE username=?");
			ps.setInt(1,password);
			ps.setString(2,username);
			int s= ps.executeUpdate();
			if(s>0) {
				i++;
			
			}
			
		}
		catch (SQLException e) {
			System.out.print(e.getMessage());
		}
		
		return i;
	}
	
}



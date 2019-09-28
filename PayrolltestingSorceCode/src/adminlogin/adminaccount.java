package adminlogin;

public class adminaccount {

	private String username;
	private String password;

	   
	   public adminaccount(String username,String password){
	      this.username = username;
	      this.password=password;
	   }

	   public String UserName(){
	      System.out.println(username);
	      return username;
	   }   

	   public String Password(){
	    
	      System.out.println(password);
	      return password;
	   }   
	}  	
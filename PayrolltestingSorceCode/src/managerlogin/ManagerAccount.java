package managerlogin;


public class ManagerAccount {

	private String musername;
	private String mpassword;

	   
	   public ManagerAccount(String musername, String mpassword){
	      this.musername = musername;
	      this.mpassword=mpassword;
	   }

	   public String MUserName(){
	      System.out.println(musername);
	      return musername;
	   }   

	   public String MPassword(){
	    
	      System.out.println(mpassword);
	      return mpassword;
	   }   
	}  	
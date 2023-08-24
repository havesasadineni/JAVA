package p1;

public class DisplayUserDetails {
public	UserDetails ud =null;
public DisplayUserDetails(UserDetails ud)
{ this.ud = ud;
}
public void DisplayDetails()
{ 
	ud.getUserDetails();
	}
}

package ex03.exception;

public class UserException extends Exception {

	private int port = 7772;
	public UserException(String msg){
		super(msg);
	}
	public UserException(String msg, int port){
		super(msg);
		this.port = port;
	}
	public int getPort(){
		return port;
	}
	
}

class UserExceptionTest  {
	
	public void test1(String[] n)throws UserException{
		System.out.println("Test 1");
		if(n.length<1)
			throw new UserException("nothing here");// 碍力 exception 惯积
		else
			throw new UserException("final",705); // 碍力 exception 惯积
	}
	
	public static void main(String[] args) {
		UserExceptionTest ut = new UserExceptionTest();
		try{
			ut.test1(args);
		}catch(UserException ue){
			System.out.println(ue.getMessage());
			ue.printStackTrace();
		}
	}
}
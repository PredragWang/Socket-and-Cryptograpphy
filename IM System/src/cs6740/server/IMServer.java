package cs6740.server;


public class IMServer {

	/**
	 * @param args
	 */
	public static ServerMain server;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		server = new ServerMain();
		// start the server
		server.start();
	}

}

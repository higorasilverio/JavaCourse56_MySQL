package db;

public class DbIntegriyException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public DbIntegriyException (String msg) {
		super(msg);
	}

}

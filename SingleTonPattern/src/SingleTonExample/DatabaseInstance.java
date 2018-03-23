package SingleTonExample;

public class DatabaseInstance {
	
	private static DatabaseInstance db = null;
			
	private DatabaseInstance() {}
	
	public static DatabaseInstance getInstance() {
		if(db==null) {
			synchronized (DatabaseInstance.class) {
				if(db==null) db = new DatabaseInstance();	
			}
		}
		return db;
	}
	
	public void print() {
		System.out.println("print something");
	}
}


/*
 
	synchronized public static DatabaseInstance getInstance() {
		if(db==null) 
			db = new DatabaseInstance();
		return db;
	}
	
*/
 
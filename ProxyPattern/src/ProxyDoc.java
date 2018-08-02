/*
 * ProxyDoc class is the proxy class for 
 * OriginalDoc class which is controlling the OriginalDoc class.
 */
public class ProxyDoc implements TextDocument {
	/*
	 * Instance for OriginalDoc class is created 
	 * and declared as a private variable.
	 */
	private OriginalDoc originalDoc;
	private String fileName;
	
	public ProxyDoc(String fileName){
		/*
		 * This is the constructor of 
		 * ProxyDoc class.
		 */
		this.fileName=fileName;
	}
		
	public void display() {
		/*
		 * The display method is used to display the 
		 * Text Document. Here the method checks whether there are 
		 * any objects created originalDoc and if none with that file
		 * then it creates an object of OriginalDoc class and instantiates it.
		 * if not it just uses the already loaded file to display.
		 */
		if(originalDoc==null){
			originalDoc=new OriginalDoc(fileName);
		}
		originalDoc.display();
	}
}

/*
 * TestDrive class creates an object reference for TextDocument 
 * interface for ProxyDoc class by giving a text file name as input.
 */
public class ProxyTestDrive {
	public static void main(String[] args){
		TextDocument doc=new ProxyDoc("proxypattern.txt");
		/*
		 * Here the proxypattern.txt file will be first loaded 
		 * from the hard disk and then displayed.
		 */
		doc.display();
		System.out.println("");
		/*
		 * The proxypattern.txt file will be directly 
		 * displayed without being loaded from hard disk.
		 */
		doc.display();
	}

}

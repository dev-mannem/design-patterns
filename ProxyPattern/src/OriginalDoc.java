/*
 * OriginalDoc class implements TextDocument interface.
 * It has a constructor which in turn calls 
 * loadfromHardDisk() method. Thus ensuring the loading 
 * of file only when the object is created. 
 */
public class OriginalDoc implements TextDocument {
	private String fileName;
	
	public OriginalDoc(String fileName){
		this.fileName=fileName;
		loadFromHardDisk(fileName);
	}
	
	public void loadFromHardDisk(String fileName){
		/*
		 * loadFromHardDisk() method is called from 
		 * its constructor when an instance to this class is initiated.
		 */
		System.out.println("Loading File from HardDisk:"+fileName);
	}

	public void display() {
		/*
		 * This method is used to display the 
		 * text document.
		 */
		System.out.println("Opening File:"+fileName);
	}
}

/*
 * MovieRepository concrete class implements the Container interface. 
 * This class has inner class MovieIterator implementing the Iterator interface.
 */
public class MovieRepository implements Container {
	public String names[]={"HarryPotter","Twilight","The Avengers","Star Wars",
			"Titanic","Jurassic Park","Frozen",};

	public Iterator getIterator() {
		/*
		 * returns MovieIterator object. 
		 */
		return new MovieIterator();
	}

	private class MovieIterator implements Iterator{

		int index;

		public boolean hasNext() {
			/*
			 * Validates whether there are anymore movie names in the list.
			 */
			if(index<names.length){
				return true;
			}
			return false;
		}

		public Object next() {
			/*
			 * Returns the next movie.
			 * Internally calls hasNext method.
			 */
			if(this.hasNext()){
				return names[index++];
			}
			return null;
		}		
	}
}

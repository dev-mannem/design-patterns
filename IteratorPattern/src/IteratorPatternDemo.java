/*
 * Contains the main method.
 */
public class IteratorPatternDemo {
	public static void main(String[] args) {
		MovieRepository movieRepository = new MovieRepository();

		for(Iterator iterator = movieRepository.getIterator(); iterator.hasNext();){
			String movie = (String)iterator.next();
			System.out.println("Movie Name : " + movie);
		}
	}
}

package seasons;

public final class TestaAsserts {
	
	public enum Seasons {
		SUMMER, AUTUMN,  WINTER, SPRING, UNKNOWN;
	}

	public static void main(String args[]) {
		
		chooseStation(Seasons.SUMMER); // Works just fine, prints Summer
		chooseStation(Seasons.AUTUMN); // Works just fine, prints Autumn
		chooseStation(Seasons.WINTER); // Works just fine, prints Winter
		chooseStation(Seasons.SPRING); // Works just fine, prints Spring
		
		// AssertError, APENAS SE RODARMOS O CODIGO COM A FLAG -ea
		chooseStation(Seasons.UNKNOWN);
	}
	
	public static void chooseStation(Seasons station) {
		
		switch(station) {
		case SUMMER:
			System.out.println("Summer");
			break;
		case AUTUMN:
			System.out.println("Autumn");
			break;
		case WINTER:
			System.out.println("Winter");
			break;
		case SPRING:
			System.out.println("Spring");
			break;
		default:
			assert(false);
		}
	}
}

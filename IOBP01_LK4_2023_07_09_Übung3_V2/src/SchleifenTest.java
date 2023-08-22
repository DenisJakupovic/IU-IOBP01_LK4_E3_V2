
public class SchleifenTest {

	public static void main(String[] args) {
		int summe = 0;
		int i = 2;
		while(i <= 100){
			summe = summe + i;
			i = i + 2;
		}
		System.out.println("Die Summe mit einer while-Schleife ist: " + summe);
		
		summe = 0;
		i = 1;
		do 
		{
			summe = summe + i;
			i = i + 2;
		}while (i <= 100);
		System.out.println("Die Summe mit einer while-Schleife ist: " + summe);
		
		for (i = 2, summe = 0; i <= 100; i = i + 2) {
		summe = summe + i;
		}
		System.out.println("Die Summe mit einer for-Schleife ist: " + summe);
		
		
		summe = 0;
		i = 2;
		while (i <= 100) {
			summe = summe + i;
			i = i + 2;
		}
		System.out.println("Die Summe der selbstgemachten Schleife lautet " + summe);
	}

}


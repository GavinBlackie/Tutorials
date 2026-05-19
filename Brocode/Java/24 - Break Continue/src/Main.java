
public class Main {
	public static void main(String[] args) {
		
		// break => keyword to escape a loop (STOP)
		// continue => skip current loop iteration (SKIP)
		
		// NOTE: its recommended by my professors to avoid using
		//		these keywords since there are always alternatives
		//		that are more readable to other programmers
		
		for (int i = 0; i < 15; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}
		System.out.println("\n----------\n");
	
		for (int i = 0; i < 15; i++) {
			System.out.println(i);
			if (i % 5 == 0) {
				System.out.println("Encountered a multiple of 5");
				continue;
			}
		}
		System.out.println("\n----------\n");
		
		
		// Was messing around with for loops here
//		for (int iCount = 0; 
//				 iCount < 31; 
//				 iCount += (iCount % 2 == 0) ? 2 : 1  ) {
//			System.out.println(iCount);
//		}
	}
}

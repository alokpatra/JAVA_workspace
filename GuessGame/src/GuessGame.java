
public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	public void StartGame() {
		int GameNo = 1;
		p1= new Player();
		p2= new Player();
		p3= new Player();
		int guess1 = 0;
		int guess2 = 0;
		int guess3 = 0;
		boolean p1Status = false;
		boolean p2Status = false;
		boolean p3Status = false;
		int targetNumber = (int) (Math.random()*10);
		System.out.print("Thinking of a no btw 0 to 10 ");
		while(true) {
			
			System.out.println("Game No :" + GameNo + '\n');
			System.out.println("Target No :" + targetNumber);
			p1.guess();
			p2.guess();
			p3.guess();
			guess1 = p1.num;
			guess2 = p2.num;
			guess3 = p3.num;
			
			System.out.println("Player 1 guessed: " + guess1);
			System.out.println("Player 2 guessed: " + guess2);
			System.out.println("Player 3 guessed: " + guess3);
			if (guess1==targetNumber) {
				p1Status = true;
			}
			if (guess2==targetNumber) {
				p2Status = true;
			}
			if (guess3==targetNumber) {
				p3Status = true;
			}
			if (p1Status || p2Status || p3Status) {
				System.out.println("We have a winner");
				System.out.println("Player 1 status " + p1Status);
				System.out.println("Player 2 status " + p2Status);
				System.out.println("Player 3 status " + p3Status);
				System.out.println("Game Over");
				break;
								
			} else {
				System.out.println("Try Again " + '\n');
			}
			GameNo++;
			
		}
		
	}
	

}

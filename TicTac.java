import java.util.Scanner;

public class TicTac {

	public static void main(String[] args) {

		int count = 1;
		String[] Locs = { "E", "E", "E", "E", "E", "E", "E", "E", "E", "E" };
		int PlayerSelect;
		int Player2Select;
		int Win = 0;
		/*
		 * String Locs[1] = "E"; String Locs[2] = "E"; String Locs[3] = "E";
		 * String Locs[4] = "E"; String Locs[5] = "E"; String Locs[6] = "E";
		 * String Locs[7] = "E"; String Locs[8] = "E"; String Locs[9] = "E";
		 */
		Scanner input = new Scanner(System.in);
		while ((count == 1) || (count == 3) || (count == 5) || (count == 7) || (count == 9)&&(count > 11)) {

			System.out.println(Locs[1] + "  " + Locs[2] + "  " + Locs[3]);
			System.out.println(Locs[4] + "  " + Locs[5] + "  " + Locs[6]);
			System.out.println(Locs[7] + "  " + Locs[8] + "  " + Locs[9]);count++;

			if ((Locs[1] == "X" && Locs[2] == "X" && Locs[3] == "X")
					|| (Locs[4] == "X" && Locs[5] == "X" && Locs[6] == "X")
					|| (Locs[7] == "X" && Locs[8] == "X" && Locs[9] == "X")
					|| (Locs[1] == "X" && Locs[4] == "X" && Locs[7] == "X")
					|| (Locs[2] == "X" && Locs[5] == "X" && Locs[8] == "X")
					|| (Locs[3] == "X" && Locs[6] == "X" && Locs[9] == "X")
					|| (Locs[1] == "X" && Locs[5] == "X" && Locs[9] == "X")
					|| (Locs[3] == "X" && Locs[5] == "X" && Locs[7] == "X")) {
				System.out.println("X Wins!!");
				Win++;
			}

			if ((Locs[1] == "O" && Locs[2] == "O" && Locs[3] == "O")
					|| (Locs[4] == "O" && Locs[5] == "O" && Locs[6] == "O")
					|| (Locs[7] == "O" && Locs[8] == "O" && Locs[9] == "O")
					|| (Locs[1] == "O" && Locs[4] == "O" && Locs[7] == "O")
					|| (Locs[2] == "O" && Locs[5] == "O" && Locs[8] == "O")
					|| (Locs[3] == "O" && Locs[6] == "O" && Locs[9] == "O")
					|| (Locs[1] == "O" && Locs[5] == "O" && Locs[9] == "O")
					|| (Locs[3] == "O" && Locs[5] == "O" && Locs[7] == "O")) {
				System.out.println("O Wins!!");
				Win++;
			}

			else {
				System.out.println("Player 1 choose a Location use the keypad");
				PlayerSelect = input.nextInt();
				if ((PlayerSelect == 1) && Locs[7].equals("E")) {
					Locs[7] = "X";
					
				}
				if ((PlayerSelect == 2) && Locs[8].equals("E")) {
					Locs[8] = "X";
					
				}
				if ((PlayerSelect == 3) && Locs[9].equals("E")) {
					Locs[9] = "X";
					
				}
				if ((PlayerSelect == 4) && Locs[4].equals("E")) {
					Locs[4] = "X";
					
				}
				if ((PlayerSelect == 5) && Locs[5].equals("E")) {
					Locs[5] = "X";
					
				}
				if ((PlayerSelect == 6) && Locs[6].equals("E")) {
					Locs[6] = "X";
					
				}
				if ((PlayerSelect == 7) && Locs[1].equals("E")) {
					Locs[1] = "X";
					
				}
				if ((PlayerSelect == 8) && Locs[2].equals("E")) {
					Locs[2] = "X";
					
				}
				if ((PlayerSelect == 9) && Locs[3].equals("E")) {
					Locs[3] = "X";
					
				}
			}
			while ((count == 2) || (count == 4) || (count == 6) || (count == 8) || (count == 10)&&(count > 11)) {

				System.out.println(Locs[1] + "  " + Locs[2] + "  " + Locs[3]);
				System.out.println(Locs[4] + "  " + Locs[5] + "  " + Locs[6]);
				System.out.println(Locs[7] + "  " + Locs[8] + "  " + Locs[9]);count++;

				if ((Locs[1] == "X" && Locs[2] == "X" && Locs[3] == "X")
						|| (Locs[4] == "X" && Locs[5] == "X" && Locs[6] == "X")
						|| (Locs[7] == "X" && Locs[8] == "X" && Locs[9] == "X")
						|| (Locs[1] == "X" && Locs[4] == "X" && Locs[7] == "X")
						|| (Locs[2] == "X" && Locs[5] == "X" && Locs[8] == "X")
						|| (Locs[3] == "X" && Locs[6] == "X" && Locs[9] == "X")
						|| (Locs[1] == "X" && Locs[5] == "X" && Locs[9] == "X")
						|| (Locs[3] == "X" && Locs[5] == "X" && Locs[7] == "X")) {
					System.out.println("X Wins!!");
					Win++;
				}

				if ((Locs[1] == "O" && Locs[2] == "O" && Locs[3] == "O")
						|| (Locs[4] == "O" && Locs[5] == "O" && Locs[6] == "O")
						|| (Locs[7] == "O" && Locs[8] == "O" && Locs[9] == "O")
						|| (Locs[1] == "O" && Locs[4] == "O" && Locs[7] == "O")
						|| (Locs[2] == "O" && Locs[5] == "O" && Locs[8] == "O")
						|| (Locs[3] == "O" && Locs[6] == "O" && Locs[9] == "O")
						|| (Locs[1] == "O" && Locs[5] == "O" && Locs[9] == "O")
						|| (Locs[3] == "O" && Locs[5] == "O" && Locs[7] == "O")) {
					System.out.println("O Wins!!");
					Win++;
				}

				else {
					System.out.println("Player 2 choose a Location use the keypad");
					Player2Select = input.nextInt();
					if ((Player2Select == 1) && Locs[7].equals("E")) {
						Locs[7] = "O";
						
					}
					if ((Player2Select == 2) && Locs[8].equals("E")) {
						Locs[8] = "O";
						
					}
					if ((Player2Select == 3) && Locs[9].equals("E")) {
						Locs[9] = "O";
						
					}
					if ((Player2Select == 4) && Locs[4].equals("E")) {
						Locs[4] = "O";
						
					}
					if ((Player2Select == 5) && Locs[5].equals("E")) {
						Locs[5] = "O";
						
					}
					if ((Player2Select == 6) && Locs[6].equals("E")) {
						Locs[6] = "O";
						
					}
					if ((Player2Select == 7) && Locs[1].equals("E")) {
						Locs[1] = "O";
						
					}
					if ((Player2Select == 8) && Locs[2].equals("E")) {
						Locs[2] = "O";
						
					}
					if ((Player2Select == 9) && Locs[3].equals("E")) {
						Locs[3] = "O";
						
					}

				}
				if (count >= 18)//&&(Win>1))
					
				{
					/*System.out.println(Locs[1] + "  " + Locs[2] + "  " + Locs[3]);
					System.out.println(Locs[4] + "  " + Locs[5] + "  " + Locs[6]);
					System.out.println(Locs[7] + "  " + Locs[8] + "  " + Locs[9]);*/
					System.out.println("Game Over");
				}
			}
		}
	}
}

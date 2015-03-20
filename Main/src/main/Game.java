package main;
import java.util.Scanner;

public class Game
{
	public static void main(String args[])
	{
		boolean end = false;
		String saisie;
		Scanner s = new Scanner(System.in);
		Grid grid = new Grid(4,4);
		grid.initGrid();
		grid.displayGrid();
		
		while (!end)
		{
			System.out.println("Prochain deplacement : ");
			System.out.println("2 - bas");
			System.out.println("8 - haut");
			System.out.println("4 - gauche");
			System.out.println("6 - droite");
			System.out.println("Autres commandes :");
			System.out.println("5 - nouvelle grille");
			System.out.println("0 - fin");

			saisie = s.nextLine();
			
			switch(saisie)
			{
				case "2":
					grid.moveDown();
					grid.addCase();
					grid.displayGrid();
					break;
				case "8":
					grid.moveUp();
					grid.addCase();
					grid.displayGrid();
					break;
				case "4":
					grid.moveLeft();
					grid.addCase();
					grid.displayGrid();
					break;
				case "6":
					grid.moveRight();
					grid.addCase();
					grid.displayGrid();
					break;
				case "5":
					grid.initGrid();
					grid.displayGrid();
					break;
				case "0":
					end = true;
					break;
				default:
					end = true;
					break;
			}
		}
	}
}

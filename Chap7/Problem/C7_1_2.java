package Problem;

class Bead
{
	int Bead1, Bead2;
	
	public Bead(int bd1, int bd2)
	{
		Bead1=bd1;
		Bead2=bd2;
		System.out.println("Player1 have "+Bead1);
		System.out.println("Player2 have "+Bead2);
	}
	
	public void winPlayer1(int win1)
	{
		Bead1=Bead1+win1;
		Bead2=Bead2-win1;

		if(Bead2<0)//패자의 구슬의 수가 0미만이 되는것을 방지
		{
			System.out.println("Player2 have no Bead.");
			System.out.println("Player1 have "+Bead1);
		}
		else
		{
			System.out.println("If Player1 win, Player1 get " + win1 +". Player 1 have " + Bead1);
			System.out.println("If Player2 lose, Player2 lose " + win1 +". Player 2 have " + Bead2);
		}
	}
	public void winPlayer2(int win2)
	{
		Bead2=Bead2+win2;
		Bead1=Bead1-win2;
		if(Bead2<0)//패자의 구슬의 수가 0미만이 되는것을 방지
		{
			System.out.println("Player1 have no Bead.");
			System.out.println("Player2 have "+Bead2);
		}
		else
		{
			System.out.println("If Player1 lose, Player 1 lose " + win2 +". Player1 have " + Bead1);
			System.out.println("If Player2 win, Player 2 get " + win2 +". Player2 have " + Bead2);
		}
	}
}

class C7_1_2
{
	public static void main(String[] args) {
		Bead game=new Bead(15,9);
		
		game.winPlayer1(2);
		game.winPlayer2(7);
	}
}

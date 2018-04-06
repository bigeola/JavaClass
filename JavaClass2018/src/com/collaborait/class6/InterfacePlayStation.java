package com.collaborait.class6;

public class InterfacePlayStation implements InterfaceGameload, InterfaceGameSave, InterfaceGamePlay{
	
	
	public static void main(String [] args) {
		InterfacePlayStation ps = new InterfacePlayStation();
		
		ps.loadGame();
		ps.playGame();
		ps.savegame();
		
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("To play This game, press the play button.");
		
	}

	@Override
	public void savegame() {
		// TODO Auto-generated method stub
		System.out.println("To save this gaming session, press R1 + L2.");
		
	}

	@Override
	public void loadGame() {
		// TODO Auto-generated method stub
		System.out.println("Insert a disc to load the game.");
		
	}
	
}
	



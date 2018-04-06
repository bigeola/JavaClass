package com.collaborait.class6;

public class InterfaceSamsungWashingMachine implements InterfaceWashingMachine, InterfaceWashingMachineMnt{

	@Override
	public void startButton() {
		// TODO Auto-generated method stub
		System.out.println("Start the Machine");
		
	}
	
	

	@Override
	public void mntWashingMachine() {
		// TODO Auto-generated method stub
		System.out.println("Start the Machine");
		
	}

public static void main(String[] args) {
		InterfaceSamsungWashingMachine samsung = new InterfaceSamsungWashingMachine();
		samsung.startButton();
		samsung.mntWashingMachine();
	}
}

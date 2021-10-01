package com.dollarsbank.application;

import com.dollarsbank.controller.DollarsBankController;

public class DollarsBankApplication {

	//Main method that runs the entire program
	public static void main(String[] args)
	{
		DollarsBankController dollarsBankController = new DollarsBankController();
		Boolean run = true;
		
		while(run)
		{
			run = dollarsBankController.run();
		}
	}
}

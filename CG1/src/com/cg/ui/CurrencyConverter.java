package com.cg.ui;

public class CurrencyConverter {
//
//	int rupee = 63;
//	int dirhaam = 3;
//	int $australiandollar = 2;
	double exchangeRates[]= {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};

	void printCurrencies() {

		System.out.println("rupee ::" + exchangeRates[0]);
		System.out.println("$australian dollar ::" + exchangeRates[exchangeRates.length-1]);

	}

	public double[] getExchangeRates() {
		return exchangeRates;
	}

	public void setExchangeRates(double[] exchangeRates) {
		this.exchangeRates = exchangeRates;
	}

	public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();
		cc.printCurrencies();

	}
}

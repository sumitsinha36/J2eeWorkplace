package net.testwebservices;

import java.util.Scanner;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

public class ClientCurrenctConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConvertor currencyConverter = new CurrencyConvertor();
		CurrencyConvertorSoap currencyConverterSoap = currencyConverter
				.getCurrencyConvertorSoap();
		Double rate = currencyConverterSoap.conversionRate(Currency.INR,
				Currency.USD);
		System.out.println("Enter Indian Amount :- ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Equivalent USD Doller :- $" + rate
				* Double.parseDouble(sc.next()));
	}

}

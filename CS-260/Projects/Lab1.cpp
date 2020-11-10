//============================================================================
// Name        : Lab1-3.cpp
// Author      : Marcus Bullock
// DATE		   : 09/13/2020
// Version     : 1.0
// Copyright   : Copyright © 2017 SNHU COCE
// Description : Lab 1-3 Up to Speed in C++
//============================================================================

#include "pch.h"
#include <iostream>
#include <algorithm>
#include <string>
#include <cstdlib>
#include <cstring>
using namespace std;

//============================================================================
// Global definitions visible to all methods and classes
//============================================================================

// FIXME (1): Define a data structure to hold bid information together as a single unit of storage.
struct bidInfo 
{
	string title;

	string vehicle;

	string fund;

	double amount;

};


// FIXME (4): Display the bid values passed in data structure
/**
 * Display the bid information
 *
 * @param ?type? data structure containing the bid info
 */

	void displayBid(struct bidInfo b)
{
	cout << "Title: " << b.title << endl;
	cout << "Fund: " << b.fund << endl;
	cout << "Vehicle: " << b.vehicle<< endl;
	cout << "Bid Amount: " << b.amount << endl;

	return;
}

// FIXME (3): Store input values in data structure
	double strToDouble(string str, char ch)
	{
		str.erase(remove(str.begin(), str.end(), ch), str.end());
		return atof(str.c_str());
	}

/**
 * Prompt user for bid information
 *
 * @return data structure containing the bid info
 */
	struct bidInfo  getBid() 
	{

	struct bidInfo bid ;

	cout << "Enter title: ";
	cin.ignore();
	getline(cin, bid.title );

	cout << "Enter fund: ";
	cin >> bid.fund;

	cout << "Enter vehicle: ";
	cin.ignore();
	getline(cin, bid.vehicle);

	cout << "Enter amount: ";
	cin.ignore();
	string strAmount;
	getline(cin, strAmount);
	bid.amount = strToDouble(strAmount, '$');

	return bid;
}

/**
 * Simple C function to convert a string to a double
 * after stripping out unwanted char
 *
 * credit: http://stackoverflow.com/a/24875936
 *
 * @param ch The character to strip out
 */



/**
 * The one and only main() method
 */
int main() {

	// FIXME (2): Declare instance of data structure to hold bid information
	struct bidInfo bid;

		// loop to display menu until exit chosen
		int choice = 0;
	while (choice != 9) 
	{
		cout << "Menu:" << endl;
		cout << "  1. Enter Bid" << endl;
		cout << "  2. Display Bid" << endl;
		cout << "  9. Exit" << endl;
		cout << "Enter choice: ";
		cin >> choice;

		// FIXME (5): Complete the method calls then test the program
		switch (choice) {
		case 1:
			bid = getBid();
			break;
		case 2:
			displayBid(bid);
			break;
		}
	}

	cout << "Good bye." << endl;

	return 0;
}

//implementation file for the EmpProd class
#include <iostream>
#include <string>
#include <iomanip>
#include "productionworker.h"
using namespace std;
void getEmpInfo(ProductionWorker &);
void displayInfo(const ProductionWorker &);

int main()
{
	void getEmpInfo(productionworker &);
	void displayInfo(const ProductionWorker &);
	//create productionworker object for employee
	ProductionWorker emp("John Jones", 123, "1/1/2006", 2, 18.00);
	
	getEmpInfo(emp);
	//display employee info
	displayInfo(emp);


	cin.get();
	cin.ignore();
	return 0;
}

//this function demonstrates the ProductionWorker class which is derived from the Employee class
void getEmpInfo(ProductionWorker &emp)
{
	string na = "";
	int nu = 0;
	string d = "";
	int s = 0;
	double r = 0.0;

	cout << "Name:  ";
	getline(cin, na);
	emp.setName(na);

	cout << "Employee ID:  ";
	cin >> nu;
	emp.setNumber(nu);

	cout << "Hire Date:  ";
	cin >> d;
	emp.setDate(d);

	cout << "Shift (1 for Day and 2 for Night:)  ";
	cin >> s;
	emp.setShift(s);

	cout << "Hourly Rate:  ";
	cin >> r;
	emp.setRate(r);
}
void displayInfo(const ProductionWorker &emp)
{
	cout << "Name:  " << getName() << "\n";
	cout << "Employee Number:  " << getNumber() << "\n";
	cout << "Hire Date:  " << getHireDate() << "\n";
	cout << "Shift:  " << getShift();
	{	If(Shift == 1)
		Cout << "Day\n";
	Else
		cout << "Night\n"; }
	cout << "Pay Rate:  " << getRate() << "\n";
}


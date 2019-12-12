#include <iostream>
#include <iomanip>
#include "Employee.h"

using namespace std;

int main()
{
	const int NUM_EMP = 3;
	Employee entry[NUM_EMP] =
	{
Employee("Susan Meyers",47899, "Accounting", "Vice President"),
Employee("Mark Jones", 39119, "IT", "Programmer"),
Employee("Joy Rogers", 81774, "Manufacturing", "Engineer")
	};
	cout << setw(17) << "Name"
		<< setw(7) << "idNumber"
		<< setw(16) << "Department"
		<< setw(15) << "Position\n";
	cout << "________________________________________________________\n";

	for (int i = 0; i < NUM_EMP; i++)
	{
		cout << setw(17) << entry[i].getName();
		cout << setw(7) << entry[i].getidNumber();
		cout << setw(16) << entry[i].getDepartment();
		cout << setw(15) << entry[i].getPosition() << endl;
	}

	return 0;
}
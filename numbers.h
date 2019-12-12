// Specification file for the FeetInches class
#ifndef NUMBERS_H
#define NUMBERS_H

#include <iostream>
using namespace std;

class Numbers; // Class Declaration

// Function Prototypes for Overloaded Stream Operators
ostream &operator << (ostream &, const Numbers &);
istream &operator >> (istream &, Numbers &);

string lessThan20[20] = {"zero", "one", "two", ..., "eighteen", nineteen"};
string ten = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
string hundred = "hundred";
string thousand = "thousand";

// The Numbers class holds whole dollar amounts in the range of 0-9999 and translates them into an English description of the number
class Numbers
{
private:
//To hold the number
int number;


// prints the English description of the Numbers object
void print();

// static arrays the specify how to translate key dollar amounts into the desired format
static string lessThan20[20] = {"zero", "one", "two", ..., "eighteen", nineteen"};
static string ten = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
static string hundred = "hundred";
static string thousand = "thousand";

public:
   // Constructor
Numbers (int x)
{
number=x;
}

//member function that prints the English description of the Numbers object
void print();
}

void Numbers::print()
{
// output will be the number that is to be printed
int output = number;

//convert the number in thousands
int n_thousands = output/1000;
output = output % 1000;
if (n_thousands > 0)
{
cout << " " << lessThan20[n_thousands];
cout << " thousand ";
}
int n_hundreds = output/100;
output = output % 100;
if (n_hundreds > 0)
{
cout << " " << lessThan20[n_hundreds];
cout << " hundred ";
}
}
operator int();

   // Friends
friend ostream &operator << (ostream &, const FeetInches &);
friend istream &operator >> (istream &, FeetInches &);
};

#endif

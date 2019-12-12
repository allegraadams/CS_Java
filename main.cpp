#include "Numbers.h"
#include <iostream>

int main()
{
int number;
cout << "Enter a number in the range 0 through 9999 to be translated into an English description of the number: ";

while (number>=0)
{
//Create a Numbers object
Numbers Num(number);

//Display the course info
Num.print();
return 0;
}

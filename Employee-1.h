
#ifdef EMPLOYY_H
#define EMPLOYEE_H

class Employee
{
Private:
string Name; //to hold employee’s name
int Number; //to hold employee’s ID number
string Date; //to hold employee’s hire date
Public:
//default constructor
Employee()
{
Name="";
Number=0;
Date="";
}

//constructor
Employee(string na, int nu, string d)
{
Name=na;
Number=nu;
Date=d;
}

//mutator function
Void setName (string na)
{Name=na;}

Void setNumber (int nu)
{Number=nu;}

Void setDate (string d)
{Date=d;}

//accessor functions
String getName()const
{return Name;}

int getNumber()const
{return Number;}

String getDate()const
{return Date;}
}:
#endif

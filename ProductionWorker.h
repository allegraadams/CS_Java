
#ifndef PRODUCTIONWORKER_H
#define PRODUCTIONWORKER_H
#include "Employee.h"
using namespace std;
class ProductionWorker
{
private:
int Shift; //day shift is shift 1 and night shift is shift 2
double Rate;
public:
//default constructor
ProductionWorker():Employee()
{
Shift=0;
Rate=0.0;
}
//constructor
ProductionWorker(int s, double r):
{
Shift=s;
Rate=r;
}

//mutator functions
void setShift(int s)
{Shift=s;}
void setRate(double r)
{Rate=r;}

//accessor functions
int getShift()const
{return Shift;}
double Rate()const
{return Rate;}
};
#endif

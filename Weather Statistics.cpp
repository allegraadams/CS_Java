#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

struct Statistics
{
    double TotalRainfall; // The total rainfall amount for the month
    double HighTemp; // The high temperature for the month
    double LowTemp; // The low temperature for the month
    double AvTemp; // The average temperature for the month
};

int main ()
{
const int Months = 12; // The number of months
Statistics months[Months]; // Array of structures
int index; // Loop counter

//Get weather statistics
    cout<< "Enter the following statistics:\n";
    for(index=0;index<Months;index++)

 {

 //Get total amount of rainfall
    cout<<"Total rainfall for month #" <<(index+1)<<": ";
    cin>>months[index].TotalRainfall;




 //Get highest temperature
    cout<< "Highest temperature for month #" <<(index+1)<<": ";
    cin>>months[index].HighTemp;
    while (months[index].HighTemp<-100||months[index].HighTemp>140);




     //Get lowest temperature
    cout<<"Lowest temperature for month #" <<(index+1)<<": ";
    cin>>months[index].LowTemp;
    while (months[index].LowTemp<-100||months[index].LowTemp>140)


//Get average temperature
months[index].AvTemp=(months[index].HighTemp + months[index].LowTemp)/2;
 }
//Get total rainfall for the year
double TotalRainAll = 0;
for (index=0; index<Months;index++)
    TotalRainAll+= months[index].TotalRainfall;

//Get the average monthly rainfall
double AvTotalRain = TotalRainAll/Months;

//Get the highest temperature of the year
double HighestTemp;
double HighestMonth=0;
HighestTemp = months[0].HighTemp;
for(index=1; index<Months;index++)
{
    if (months[index].HighTemp>HighestTemp)
    {
        HighestTemp=months[index].HighTemp;
        HighestMonth=index;
    }
}
//Get the lowest temperature of the year
double LowestTemp;
double LowestMonth=0;
LowestTemp = months[0].LowTemp;
for(index=1; index<Months;index++)
{
    if (months[index].LowTemp>LowestTemp)
    {
        LowestTemp=months[index].LowTemp;
        LowestMonth=index;
    }
}
//Get total of average temperatures
double AvAvTempTotal=0;
for (index=0; index<Months;index++)
    AvAvTempTotal+=months[index].AvTemp;

//Get the average of average temperature
double AvAvTemp = AvAvTempTotal/Months;
//Displays the totals
cout<< "The average monthly rainfall: "
<<AvTotalRain<<endl;
cout<< "The total rainfall for the year: "
<<TotalRainAll<<endl;
cout<< "The highest temperature of the year is "
<<HighestTemp<< " occurring in month " <<(HighestMonth+1)<<"\n";
cout<< "The lowest temperature of the year is "
<<LowestTemp<< " occurring in month "<<(LowestMonth+1)<<"\n";
cout<< "The average of all monthly average temperatures:\n"
<<AvAvTemp<<endl;

return 0;
}


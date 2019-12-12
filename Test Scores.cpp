#include<iomanip>
#include <iostream>
using namespace std;

void ArraySelectSort(double *, int);
void showArrayPtr(double *, int);
void showAverage(double, int);
int main()
{
double *scores,
total = 0.0,
average = 0.0;

int numScores;
cout << "Enter Number of Test Scores: ";
cin >> numScores;
scores = new double[numScores];
if (scores == NULL)
        return 0;

cout << "Enter the Test Scores.\n";
for (int count = 0; count < numScores; count++)
{cout << "Score #" << (count + 1) << ": ";
cin >> scores[count];
while (scores[count] <= 0)

{cout << "Zero or negative scores not accepted.\n";
cout << "Score #" << (count + 1) << ": ";
cin >> scores[count];}
}

for (int count = 0; count < numScores; count++)
{total += scores[count];}

ArraySelectSort(scores, numScores);

cout << "\n Scores in ascending order and their average are: \n";
showArrayPtr(scores, numScores);
showAverage(total, numScores);

delete[] scores;
return 0;}
void totalaverage(double *, int size)
{
}
void ArraySelectSort(double *array, int size)
{int startScan, minIndex;
double  minElem;
for (startScan = 0; startScan < (size - 1); startScan++)

{minIndex = startScan;
minElem = array[startScan];
for (int index = startScan + 1; index < size; index++)

{if (array[index]  < minElem)

{minElem = array[index];
minIndex = index;}
}
array[minIndex] = array[startScan];
array[startScan] = minElem;}
}
void showArrayPtr(double *array, int size)

{for (int count = 0; count< size; count++)
cout << array[count] << "\n";
    cout << endl;
}
void showAverage(double total, int numScores)
{double average;
average = total / numScores;
cout << fixed << showpoint << setprecision(2);
cout << "Average Score: " << average << endl;
;
}

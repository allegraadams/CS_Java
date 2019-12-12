#include <iostream>
#include <string>
using namespace std;

int main()
{
    string pass;
    const int LENGTH = 101;
    char List[LENGTH];
    int Number, lowercaseLetter, uppercaseLetter;

    cout <<"Enter Password: \n"
    << "\n Password must meet the following criteria: \n"
    << "\n Must contain at least 6 characters. \n"
    << "\n Must contain at least 1 number. \n"
    << "\n Must contain at least 1 lowercase letter. \n"
    << "\n Must contain at least 1 uppercase letter. \n";

   do
   {
       Number = lowercaseLetter = uppercaseLetter = 0;


    cin >> pass;
    cin.getline(List, LENGTH);

    for(int i = 0; i < pass.length(); i++)
    {
        if(isdigit(List[i]))
            Number++;
        if(islower(List[i]))
            lowercaseLetter++;
        if(isupper(List[i]))
            uppercaseLetter++;

    }
    if (Number == 0)
            cout << "\n Try Again. Password must contain at least one number.\n";
    if(lowercaseLetter == 0)
            cout << "\n Try Again. Password must contain at least one lowercase letter. \n";
        if(uppercaseLetter == 0)
            cout << "\n Try Again. Password must contain at least one uppercase letter. \n";
    if(pass.length() < 6)
        cout <<"\n Try Again. Password must be at least 6 characters long. \n";
   }
   while (Number == 0|| lowercaseLetter ==0|| uppercaseLetter == 0||pass.length() < 6);
    return 0;
}

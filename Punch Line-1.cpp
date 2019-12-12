#include <iostream>
#include <fstream>
#include <string>
#include <cctype>

using namespace std;

//Function prototype
void showJoke(fstream &infile);
void showPunch(fstream &infile);

int main()
{
     string fileJoke("joke.txt");       //To hold file name
     string filePunch("punchline.txt");       //To hold file name
     fstream inJoke ("joke.txt",ios::in);
     fstream inPunch ("punchline.txt", ios::in);


     char ch;               //To hold a character

    cout<<"This program will print a joke and its punchline. \n\n";
     //Get input file name
     cout<<"Enter the name of the file holding the joke (joke.txt) ";
     cin>>fileJoke;

     cout<<"Enter the name of the file holding the punchline (punchline.txt) ";
     cin>>filePunch;
     cout<<"\n\n";

     //Open the joke file for output
{fstream inJoke ("joke.txt", ios::in);

     //Test if file opened successfully
     if(!inJoke)
     {
         cout<<"Cannot open  \n\n"<<fileJoke<<endl;

     }
     else
        {
            showJoke(inJoke);
        }
inJoke.close();
    return 0;

}
{
     //Open the punchline file for output
     fstream inPunch ("punchline.txt", ios::in);

     //Test if file opened successfully
     if(!inPunch)
     {
         cout<<"Cannot open  \n\n"<<filePunch<<endl;

     }
     else
        {
            showPunch(inPunch);
        }
inPunch.close();
     return 0;
}
cout<<  endl <<endl;

showJoke(inJoke);
showPunch(inPunch);
cout << endl;
}

void showJoke(fstream &infile)
{
    char ch;
while (infile)
{
    string line;
getline(infile, line);
cout << line << "\n";
}
}


void showPunch (fstream &infile)
{
if (infile)
{
infile.seekg(-1, ios::end);
char ch=' ';
while (ch!='\n')
{
infile.seekg(-2, ios::cur);
if((int)infile.tellg()<= 0)
    {
infile.seekg(0);
break;
}
infile.get(ch);
}
string lastLine;
getline(infile, lastLine);
cout << lastLine << "\n";
}
}

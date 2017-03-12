#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main() 
{
    string time;
    cin >> time;
    
    string hours = time.substr(0, 2);
    string format = time.substr(8, 2);
    
    if (format == "PM") {
        hours = (hours != "12") ? to_string(stoi(hours) + 12) : "12";
    }
    else if (hours == "12") {
        hours = "00";
    }
    
    string militaryTime = hours + time.substr(2, 6);
    cout << militaryTime;
    
    return 0;
}
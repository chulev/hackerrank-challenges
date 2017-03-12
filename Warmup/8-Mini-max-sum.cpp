#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>
using namespace std;

int main()
{
    long int numbers[5];
    cin >> numbers[0] 
        >> numbers[1] 
        >> numbers[2] 
        >> numbers[3]  
        >> numbers[4];
    
    int minIndex = 0;
    int maxIndex = 0;
    
    long int minSum = 0;
    long int maxSum = 0;
    
    for (int i = 1; i < 5; ++i) {
        if (numbers[minIndex] > numbers[i])
            minIndex = i;
        if (numbers[maxIndex] < numbers[i])
            maxIndex = i;
    }
    
    for (int i = 0; i < 5; ++i) {
        if (i != minIndex)
            maxSum += numbers[i];
        if (i != maxIndex)
            minSum += numbers[i];
    }
    
    cout << minSum << " " << maxSum;
    
    return 0;
}
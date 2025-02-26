#include <iostream>
#include <algorithm>
using namespace std;

int maxDigitNum(int n){
    //convert integer to string
    string strNum = to_string(n);
    //sort in descending order
    sort(strNum.rbegin(),strNum.rend());
    //convert back string to integer
    int sortedNum = stoi(strNum);
    return sortedNum;
}

int main() {
    int num;
    cout << "Enter the number: ";
    cin >> num;
    cout << "Maximum digit number is: " << maxDigitNum(num);
    return 0;
}

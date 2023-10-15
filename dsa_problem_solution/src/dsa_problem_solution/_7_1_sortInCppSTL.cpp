#include<vector>
#include<iostream>
#include<algorithm>

using namespace std;
// int main() {
//     //sort using library function
//     int arr[] = {10,20,30,40};
//     sort(arr, arr+n);
//     for(int x: arr) {
//         cout<<x<<" ";
//     }
//     sort(arr, arr+n, greater<int>);
//     cout<<endl;
//     for (int x : arr) {
//         cout<<x<<" ";
//     }
// }

//sort using vector
// int main() {
//     vector<int> v = {5, 7, 20, 10};
//     sort(v.begin(), v.end());
//     for(int x : v) {
//         cout << x << " ";
//     }
//     cout << endl;
//     sort(v.begin(), v.end(), greater<int>());
//     for(int x : v) {
//         cout << x << " ";
//     }
// }

//we can modify function for sorting in increasing or decreasing order
struct Point {
    int x, y;
};
bool mycamp(Point p1, Point p2) {
    return (p1.y < p2.y);
}
int main() {
    Point arr[] = {{3,10}, {2,8}, {5,4}};
    int n = sizeof(arr) / sizeof(arr[0]); 
    sort(arr, arr+n, mycamp);

    for (int i = 0; i < n; i++) {
        cout << arr[i].x << " " << arr[i].y << endl;
    }

    return 0;
}
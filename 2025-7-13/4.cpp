#include <iosfwd>
#include <iostream>
#include <algorithm>
#include <vector>
//
// Created by 20538 on 2025/7/13.
//
using namespace std;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  int n;
  cin >> n;
  vector<int> arr(n,0);
  for (int i = 0; i < n; i++) {
    cin >> arr[i];
  }
  sort(arr.begin(),arr.end());
  vector<long long> sum(n+1,0);
  for (int i = 0; i < n; i++) {
    sum[i+1] = sum[i]+arr[i];
  }

  long long ans = 0;
  for (int j = 1; j < n; j++) {
    ans+=(long long)j*arr[j]-sum[j];
  }
  cout << ans << endl;
}
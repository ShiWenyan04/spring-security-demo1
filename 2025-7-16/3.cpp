#include <iostream>
using namespace std;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  int n;
  cin >> n;
  int a[n];
  for (int i = 0;i < n;i++) {
    cin >> a[i];
  }
  int ans = 0;
  for (int i = 0;i < n;i++) {
    int cur_min = a[i];
    for (int j = i ;j < n;j++) {
      if (a[j] < cur_min) {
        cur_min = a[j];
      }
      int cur_max = cur_min*(j-i+1);
      if (cur_max > ans) {
        ans = cur_max;
      }
    }
  }
  cout << ans << endl;
}
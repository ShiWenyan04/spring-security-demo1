#include <iosfwd>
#include <iostream>
using namespace std;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  int ans = 0;
  int h,w;
  cin>>h>>w;
  int arr[h][w];
  int min_num = 100000007;
  for(int i=0;i<h;i++) {
    for(int j=0;j<w;j++) {
      cin>>arr[i][j];
      min_num = min(min_num,arr[i][j]);
    }
  }
  for(int i=0;i<h;i++) {
    for(int j=0;j<w;j++) {
      ans+=(arr[i][j]-min_num);
    }
  }
  cout<<ans;
}
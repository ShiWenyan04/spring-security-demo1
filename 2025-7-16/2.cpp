#include <iostream>

#include <ostream>
using namespace std;
int main() {
  int n,x;
  cin >> n >> x;
  x *= 100;
  long long  sum = 0;
  int i = 1;
  for (; i <= n; i++) {
    int v,p;
    cin >>v >> p;
    sum += v*p;
    if (sum > x) {
      cout << i << endl;
      break;
    }
  }
  if (i == n+1) {
    cout << -1 << endl;
  }
}
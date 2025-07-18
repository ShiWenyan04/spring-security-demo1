#include <iosfwd>
#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  string s;
  cin >> s;
  bool judge = true;
  for (int i = 0; i < s.length()-1; i++) {
    if (s[i] != s[i+1]) {
      judge = false;
      cout << "Lost" << endl;
      break;
    }
  }
  if (judge) {
    cout << "Won" << endl;
  }
}
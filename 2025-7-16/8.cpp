#include <iostream>
#include <vector>
using namespace std;




int path[4][2] = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

// 使用引用传递避免拷贝开销
void dfs(int x, int y, vector<vector<char>>& str, vector<vector<bool>>& visited,
         const int n,int m) {
  // 边界检查必须放在访问数组检查之前
  if (x < 0 || x >= n || y < 0 || y >= m) return;
  if (str[x][y] == '#' || visited[x][y]) return;

  visited[x][y] = true;

  for (int i = 0; i < 4; i++) {
    int dx = x + path[i][0];
    int dy = y + path[i][1];
    dfs(dx, dy, str, visited,n,m);
  }
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  int n, m;
  cin >> n >> m;
  int cnt = 0;
  // 修正初始化语法
  vector<vector<bool>> visited(n, vector<bool>(m, false));
  vector<vector<char>> str(n, vector<char>(m));

  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      cin >> str[i][j];
    }
  }

  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      if (str[i][j] == '.' && !visited[i][j]) {
        cnt++; // 增加计数
        dfs(i, j, str, visited,n,m);
      }
    }
  }

  cout << cnt << endl;
  return 0;
}
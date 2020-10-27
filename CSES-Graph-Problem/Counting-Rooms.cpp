#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

int n, m, rooms = 0;
vector<vector<bool>> vis;
vector<pair<int, int>> moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

bool isValid(int x, int y)
{
    if (x < 0 || x >= n || y < 0 || y >= m)
        return false;
    if (vis[x][y])
        return false;
    return true;
}
void dfs(int i, int j)
{
    vis[i][j] = true;
    for (auto m : moves)
    {
        if (isValid(m.first + i, m.second + j))
            dfs(m.first + i, m.second + j);
    }
}

int main()
{
    cin >> n >> m;
    vis.assign(n, vector<bool>(m));

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            char ch;
            cin >> ch;
            if (ch == '#')
                vis[i][j] = true;
        }
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (!vis[i][j])
            {
                dfs(i, j);
                rooms++;
            }
        }
    }

    cout << rooms << "\n";

    return 0;
}

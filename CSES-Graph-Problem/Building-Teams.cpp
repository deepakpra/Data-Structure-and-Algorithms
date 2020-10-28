#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
#define boost ios_base::sync_with_stdio(false), cin.tie(NULL), cout.tie(0);
#define pb push_back

vector<vector<int>> g;
vector<bool> vis;
vector<int> col;

bool dfs(int s, int c)
{
    vis[s] = true;
    col[s] = c;
    for (auto child : g[s])
    {
        if (!vis[child])
        {
            if (dfs(child, c ^ 1) == false)
                return false;
        }
        else if (col[s] == col[child])
            return false;
    }
    return true;
}

int main()
{
    int n, m;
    cin >> n >> m;
    g.assign(n, vector<int>());
    vis.assign(n, false);
    col.assign(n, 0);
    int u, v;
    for (int i = 0; i < m; i++)
    {
        cin >> u >> v;
        u--, v--;
        g[u].push_back(v);
        g[v].push_back(u);
    }
    for (int i = 0; i < n; i++)
    {
        if (!vis[i])
        {
            if (dfs(i, 1) == false)
            {
                cout << "IMPOSSIBLE\n";
                return 0;
            }
        }
    }
    for (int i = 0; i < n; i++)
    {
        cout << col[i] + 1 << " ";
    }
    cout << "\n";
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

int n, m;
vector<vector<int>> g;
vector<bool> vis;

void dfs(int s)
{
    vis[s] = true;
    for (auto child : g[s])
    {
        if (!vis[child])
            dfs(child);
    }
}

int main()
{
    cin >> n >> m;
    g.assign(n, vector<int>());
    vis.assign(n, false);

    vector<int> lead;
    int cc = 0, u, v;
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
            cc++;
            lead.push_back(i);
            dfs(i);
        }
    }
    cc--;
    cout << cc << "\n";
    for (int i = 0; i < cc; i++)
    {
        cout << lead[i] + 1 << " " << lead[i + 1] + 1 << "\n";
    }

    return 0;
}

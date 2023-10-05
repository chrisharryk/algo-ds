from collections import deque

def dfs(adj, source, vis):
    print(source, end=' ')
    vis.add(source)

    for nbour in adj[source]:
        if nbour not in vis:
            dfs(adj, nbour, vis)

def bfs(adj, source):
    vis = set()
    vis.add(source)

    q = deque()
    q.append(source)

    while q:
        node = q.popleft()
        print(node, end=' ')

        for nbour in adj[node]:
            if nbour not in vis:
                q.append(nbour)
                vis.add(nbour)

def main():
    adj = {
        0: [1, 2, 3],
        1: [0, 2],
        2: [0, 1],
        3: [0, 4],
        4: [3]
    }

    source = 0
    vis = set()
    # dfs(adj, source, vis)
    # bfs(adj, source)

if __name__ == '__main__':
    main()

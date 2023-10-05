def dfs(stack, adj, source, vis):
    stack.append(source)
    vis.add(source)

    for nbour in adj[source]:
        if nbour not in vis:
            dfs(stack, adj, nbour, vis)

def main():
    # 0 based indexing
    # topological sorting works only on DAGs
    # eg: build system dependency
    adj = {
        0: [],
        1: [],
        2: [3],
        3: [1],
        4: [0, 1],
        5: [0, 2],
    }
    vertices = 5

    vis = set()
    stack = []
    for node in range(vertices + 1):
        if node not in vis:
            dfs(stack, adj, node, vis)

    print(stack[::-1])

    pass

if __name__ == '__main__':
    main()
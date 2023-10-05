def dfs(stack, adj, source, vis):
    vis.add(source)

    for nbour in adj[source]:
        if nbour not in vis:
            dfs(stack, adj, nbour, vis)

    stack.append(source)

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

    # popping from the stack gives the same res. as below
    print(stack[::-1])

if __name__ == '__main__':
    main()

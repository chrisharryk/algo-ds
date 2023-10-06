map = {}

class Node:
    def __init__(self, data):
        self.data = data
        self.parent = self
        self.rank = 0 

def makeSet(data):
    node = Node(data)
    map[data] = node

def union(data1, data2):
    node1, node2 = map[data1], map[data2]
    parent1, parent2 = find(node1), find(node2)

    # doing nothing if they belong to same set
    if parent1 == parent2: return

    # otherwise make the parent with higher rank as the reprsentative of the union'd set
    if parent1.rank >= parent2.rank:
        parent1.rank += 1 if parent1.rank == parent2.rank else parent1.rank
        parent2.parent = parent1
    else:
        parent1.parent = parent2

def findSet(data) -> int:
    return find(map[data]).data

def find(node) -> Node:
    parent = node.parent
    if parent == node: return parent

    return find(node.parent)


def main():
    # union by rank and path compression
    # operations: 
    # 1. make set
    # 2. union
    # 3. find set
    makeSet(1)
    makeSet(2)
    makeSet(3)
    makeSet(4)
    makeSet(5)
    makeSet(6)
    makeSet(7)

    union(1, 2)
    union(2, 3)
    union(4, 5)
    union(6, 7)
    union(5, 6)
    union(3, 7)

    # all give OP as 1 (representative of the combined set)
    print(findSet(1))
    print(findSet(2))
    print(findSet(3))
    print(findSet(4))
    print(findSet(5))
    print(findSet(6))
    print(findSet(7))

if __name__ == '__main__':
    main()
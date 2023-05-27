//recursive template for DFS traversal in a graph 

public void DFS(int startNode) {
        boolean[] visited = new boolean[numNodes];
        DFSUtil(startNode, visited);
    }

    private void DFSUtil(int currentNode, boolean[] visited) {
        visited[currentNode] = true;
        System.out.print(currentNode + " ");

        for (int neighbor : adjacencyList.get(currentNode)) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }
//template for bfs or breadth first search traversal in a graph algoritm 

    public void BFS(int startNode) {
        boolean[] visited = new boolean[numNodes];
        Queue<Integer> queue = new LinkedList<>();

        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            for (int neighbor : adjacencyList.get(currentNode)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

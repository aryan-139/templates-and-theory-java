/* Dijkstra’s Algorithm is used for evaluating the shortest paths between vertices in a graph. The general strategy is to iterate through the vertices in such a way that will always allow us to only consider the shorter path at each vertex and maintain every possible shortest path as we go.

We will first implement the algorithm to find the shortest distance to every vertex. Our Java implementation will take the following steps:

Evaluate the distances between the starting vertex and its neighbors
If the new distance to the neighbor is lower than the previous distance, record it, and queue up the neighbor
Dequeue the next vertex to evaluate
Repeat steps 2 - 3 until there are no more vertices left in the queue.*/

public static Dictionary[] dijkstra (Graph g, Vertex startingVertex){
  Dictionary<String, Integer> distances = new Hashtable<>();
  Dictionary<String, Vertex> previous = new Hashtable<>();
  PriorityQueue<QueueObject> queue = new PriorityQueue<QueueObject>();

  distances.put(startingVertex.getData(), 0);
  queue.add(new QueueObject(startingVertex, 0));

  for (Vertex v: g.getVertices()) {
      if(v != startingVertex){
          distances.put(v.getData(), Integer.MAX_VALUE);
      }
      previous.put(v.getData(), new Vertex("Null"));
  }

  while(queue.size() != 0){
      Vertex current = queue.poll().vertex;
      for (Edge e: current.getEdges()) {
          Integer alternate = distances.get(current.getData()) + e.getWeight();
          String neighborValue = e.getEnd().getData();
          if (alternate < distances.get(neighborValue)){
              distances.put(neighborValue, alternate);
              previous.put(neighborValue, current);
              queue.add(new QueueObject(e.getEnd(), distances.get(neighborValue)));
          }
      }
  }

  return new Dictionary[]{distances, previous};
}

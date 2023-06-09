//tree terminologies 

/*Node: The individual element in a tree that contains data and references to its child nodes, if any.

Root: The topmost node in a tree. It is the starting point of the tree and has no parent.

Parent: A node that has one or more child nodes. It is the immediate ancestor of its child nodes.

Child: A node directly connected to another node when moving away from the root. A parent node can have multiple child nodes.

Sibling: Nodes that have the same parent are called siblings. They share the same parent node.

Leaf: A node that has no child nodes is called a leaf or a terminal node. It is located at the end of a branch.

Internal node: A node that has at least one child node is called an internal node. It is not a leaf node.

Edge: The connection or link between two nodes in a tree is called an edge. It represents the relationship between the nodes.

Path: A sequence of nodes and edges from one node to another node is called a path. It represents the traversal route in the tree.

Depth: The depth of a node in a tree is the length of the path from the root to that node. The root has a depth of 0.

Height: The height of a tree is the length of the longest path from the root to any leaf node. It represents the depth of the deepest leaf node in the tree.

Subtree: A subtree is a portion of a tree that consists of a node and its descendants.

Binary Tree: A tree in which each node has at most two child nodes, referred to as the left child and the right child.

Binary Search Tree (BST): A binary tree in which for every node, all elements in its left subtree are less than the node's value, and all elements in its right subtree are greater than the node's value. It allows for efficient searching, insertion, and deletion of elements.

eg.     7
      /   \
    3       9
   / \     / \
  1   5   8   10
     / \
    4   6


Balanced Tree: A tree in which the heights of the left and right subtrees of every node differ by at most one. Examples include AVL trees and Red-Black trees.

 */

 //what do we mean by a self balancing tree?

 /*
A self-balancing tree is a tree data structure that automatically keeps its height small in the face of arbitrary item insertions and deletions. This is done by rebalancing the tree whenever an insertion or deletion operation would cause the tree to become unbalanced.

There are many different self-balancing tree algorithms, but they all share the same basic goal of keeping the tree's height as small as possible. This is important because the height of a tree determines the time complexity of operations such as search, insertion, and deletion.

In a balanced binary search tree, the height of the tree is logarithmic in the number of nodes. This means that operations such as search, insertion, and deletion can be performed in O(log n) time, where n is the number of nodes in the tree.

In an unbalanced binary search tree, the height of the tree can be much larger than logarithmic in the number of nodes. This can make operations such as search, insertion, and deletion much slower.

Self-balancing trees are often used in data structures such as hash tables and tries. They are also used in operating systems to implement file systems and memory management.

Here are some of the benefits of using self-balancing trees:

Efficient operations: Operations such as search, insertion, and deletion can be performed in logarithmic time.
Good data locality: The nodes of a self-balancing tree are typically stored in contiguous memory, which can improve cache performance.
Scalability: Self-balancing trees can be scaled to large data sets without sacrificing performance.
 */

 


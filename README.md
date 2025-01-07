# LewisStructure

# Lewis Structure Project - README

## Project Overview
The **Lewis Structure Project** is a Java-based implementation of a **directional linked list**. The goal of this project is to create and manipulate a grid-like data structure where each node can connect to its neighbors in four cardinal directions: North, South, East, and West. This unique implementation allows traversal, addition, and manipulation of nodes in a spatially aware manner, simulating the relationships seen in Lewis structures and other graph-like data.

---

## Key Features
1. **Directional Linked List**:
   - Each node in the linked list can connect to its neighbors in up to four directions: North, South, East, and West.
   - Nodes can dynamically be added, traversed, and displayed based on directional input.

2. **Node Management**:
   - Nodes contain character data and directional references (`up`, `down`, `left`, `right`) to connect with other nodes.
   - Traversal ensures connections are maintained properly, enabling efficient navigation of the structure.

3. **Interactive Construction**:
   - Users can:
     - Create a starting node.
     - Append new nodes in specified directions.
     - Shift the current working node to navigate the structure.

4. **Visualization**:
   - The program prints out all the nodes in the structure to provide a clear representation of the data.

---

## Objectives
The main objectives of this project are:
- To understand and implement a directional, graph-like linked list.
- To practice managing dynamic relationships between nodes in multiple directions.
- To create and debug traversal algorithms for a graph-based structure.

---

## Implementation Details
### **Core Classes and Methods**
1. **LinkedList Class**:
   - **`createStartNode(char data)`**:
     - Initializes the structure by creating the first node with the given data.
   - **`appendNode(char data, String direction)`**:
     - Adds a new node with the specified data in the specified direction relative to the current node.
   - **`shiftCurrentNode(String direction)`**:
     - Moves the current node pointer to an adjacent node in the specified direction.
   - **`displayLinkedList()`**:
     - Outputs all nodes in the structure by traversing the grid starting from the initial node.
   - **`traverseNodes(Element node, Set<Element> visitedNodes)`**:
     - A helper method for recursive traversal, ensuring each node is visited once.

2. **Element Class**:
   - Represents each node in the structure.
   - Stores:
     - **Data**: The character value of the node.
     - **Directional References**: `up`, `down`, `left`, `right` pointers to neighboring nodes.

### **Main Class**:
- The **`Main`** class demonstrates the creation and manipulation of the directional linked list:
  - Starts with a root node ('N').
  - Dynamically appends new nodes in specified directions.
  - Navigates through the structure using directional shifts.
  - Displays the final structure.

---

## Example Usage
**Input**:  
```java
directionalList.createStartNode('N');
directionalList.appendNode('A', "East");
directionalList.appendNode('C', "South");
directionalList.shiftCurrentNode("North");
directionalList.shiftCurrentNode("West");
directionalList.appendNode('M', "South");
directionalList.appendNode('K', "West");
directionalList.displayLinkedList();
```

**Output**:
```
N A C M K
```

---

## Running the Program
1. Compile the program using a Java IDE or command-line tool:
   - Ensure both `LinkedList` and `Main` classes are included in the project.
2. Execute the `Main` class.
3. The program will:
   - Create the directional linked list as defined in the code.
   - Traverse and display all nodes starting from the root.

---

## Notes and Recommendations
- **Traversal**:
  - Recursive traversal ensures no node is missed while preventing infinite loops through visited nodes.
- **Debugging**:
  - Use the `displayLinkedList` method frequently during development to visualize the structure and validate relationships.
- **Extensions**:
  - The project can be extended to include:
    - Weighted edges between nodes.
    - Additional traversal options (e.g., depth-first or breadth-first search).
    - Graphical representation of the grid for better visualization.

---

This project is a great exercise in mastering multi-directional data structures, recursion, and grid-based navigation. It provides a strong foundation for implementing more complex graph-based algorithms and systems.

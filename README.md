# GraphMap

Represents a real-world city block as a graph and provides efficient directions through the city, taking into account one-way streets.

A chunk of downtown Toronto appears like this on mapping applications:

![Image 1](Resources/street_map.png)

But can be understood as a directed graph in this way, with vertices representing intersections and edges representing streets:
![Image 2](Resources/graph.png)

By representing a real-world map as a graph, common graph algorithms can be used to determine efficient routes between any two destinations on the map.

package app;

import java.util.ArrayList;
import java.util.List;

public class Graph
{
    private List<Node> nodes;

    public Graph()
    {
        this.nodes = new ArrayList();
    }

    public List<Node> getNodes()
    {
        return this.nodes;
    }

    public void addNode(Node n)
    {
        this.nodes.add(n);
    }

    public void generateNodes(int amt)
    {
        for (int i = 0; i < amt; i++)
        {
            Node n = new Node(i);
            this.addNode(n);
        }
    }

    public void connectNodes(int a, int b)
    {
        //implement
    }
}
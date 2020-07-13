package app;

public class App
{
    public static void main(String[] args) throws Exception
    {
        init();
    }

    public static void init()
    {
        Graph g = new Graph();
        g.generateNodes(66);
        int[][] edges = { {1,2}, {1,9}, {2,1}, {2,10}, {2,3}, {3,2}, {3,11}, {3,4}, {4,3}, {4,5}, {5,4}, {5,8}, {5,6}, {6,5}, {6,15}, {7,4}, {7,8}, {7,12}, {8,5}, {8,7}, {8,13}, {9,1}, {9,16}, {10,2}, {10,9}, {10,17}, {11,3}, {11,10}, {11,18}, {12,11}, {12,7}, {13,12}, {13,8}, {13,21}, {14,13}, {14,22}, {15,14}, {15,6}, {15,23} };
        for (int[] e : edges) g.connectNodes(e[0], e[1]);
    }
}
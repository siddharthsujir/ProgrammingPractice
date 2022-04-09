package com.company.programming_2022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Impl {
    public  static void main(String[] args)
    {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        g.BFS(0);

        System.out.println("--------------------DFS-------------");
        g.DFS(2);
    }
}

class Graph
{
    int V;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int V)
    {
        this.V= V;
        adj= new ArrayList<>(V);
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList());
        }
    }

    public void addEdge(int u,int v)
    {
        adj.get(u).add(v);
        //adj.get(v).add(u);
    }

    public void BFS(int s)
    {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];

        visited[s] = true;
        queue.add(s);

        while (queue.size()!=0)
        {

            s = queue.poll();
            System.out.println("\t"+ s);
            Iterator<Integer> i = adj.get(s).iterator();
            while (i.hasNext())
            {
                int n = i.next();
                if(!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }


    public void DFS(int s)
    {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        System.out.print(" "+s);
        visited[s] = true;
        queue.add(s);
        while(queue.size()!=0)
        {
            s = queue.poll();
            Iterator<Integer> i = adj.get(s).iterator();
            while (i.hasNext())
            {
                int val = i.next();
                if(!visited[val]){
                    visited[val] = true;
                    System.out.print(" "+val);
                    queue.add(val);
                }
            }
        }

    }
}

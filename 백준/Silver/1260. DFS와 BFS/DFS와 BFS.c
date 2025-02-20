#include <stdio.h>
#include <stdlib.h>

#define MAX_VERTEX 1001

typedef struct
{
    int n;
    int adg_mat[MAX_VERTEX][MAX_VERTEX];
    int visit[MAX_VERTEX];
} Graph;

void init_Graph(Graph *g)
{
    g->n = 0;
    for (int i = 0; i < MAX_VERTEX; i++)
    {
        g->visit[i] = 0;
        for (int j = 0; j < MAX_VERTEX; j++)
        {
            g->adg_mat[i][j] = 0;
        }
    }
}

void reset_visit(Graph *g)
{
    for (int i = 0; i < g->n; i++)
    {
        g->visit[i] = 0;
    }
}

void insert_Vertex(Graph *g, int vertex)
{
    g->n = vertex;
}

void insert_Edge(Graph *g, int v1, int v2)
{
    g->adg_mat[v1 - 1][v2 - 1] = 1;
    g->adg_mat[v2 - 1][v1 - 1] = 1;
}

void DFS(Graph *graph, int current_vertex, int vertexNum, int *dfs, int *dfs_index)
{
    graph->visit[current_vertex - 1] = 1;
    dfs[(*dfs_index)++] = current_vertex;

    for (int i = 0; i < vertexNum; i++)
    {
        if (graph->adg_mat[current_vertex - 1][i] == 1 && graph->visit[i] == 0)
        {
            DFS(graph, i + 1, vertexNum, dfs, dfs_index);
        }
    }
}

void BFS(Graph *graph, int start_vertex, int vertexNum, int *bfs)
{
    int queue[MAX_VERTEX], front = 0, rear = 0;
    graph->visit[start_vertex - 1] = 1;
    queue[rear++] = start_vertex;

    int bfs_index = 0;
    while (front < rear)
    {
        int current_vertex = queue[front++];
        bfs[bfs_index++] = current_vertex;

        for (int i = 0; i < vertexNum; i++)
        {
            if (graph->adg_mat[current_vertex - 1][i] == 1 && graph->visit[i] == 0)
            {
                graph->visit[i] = 1;
                queue[rear++] = i + 1;
            }
        }
    }
}

int main()
{
    int vertexNum, edge, start_vertex;
    int dfs[MAX_VERTEX], bfs[MAX_VERTEX];
    int dfs_index = 0;

    Graph g;
    init_Graph(&g);

    scanf("%d %d %d", &vertexNum, &edge, &start_vertex);
    insert_Vertex(&g, vertexNum);

    for (int i = 0; i < edge; i++)
    {
        int v1, v2;
        scanf("%d %d", &v1, &v2);
        insert_Edge(&g, v1, v2);
    }

    DFS(&g, start_vertex, vertexNum, dfs, &dfs_index);
    reset_visit(&g);
    BFS(&g, start_vertex, vertexNum, bfs);

    for (int i = 0; i < dfs_index; i++)
    {
        printf("%d ", dfs[i]);
    }
    printf("\n");
    for (int i = 0; bfs[i] != 0; i++)
    {
        printf("%d ", bfs[i]);
    }

    return 0;
}

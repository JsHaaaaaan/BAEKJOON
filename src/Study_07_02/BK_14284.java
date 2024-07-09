package Study_07_02;


import java.io.IOException;
import java.util.*;


public class BK_14284 {
    static int n; // 정정의 개수
    static int m; // 간선의 개수

    static class Node {
        int vertax; //
        int weight;
        Node next;

        public Node(int vertax, Node next, int weight) {
            this.vertax = vertax;
            this.next = next;
            this.weight = weight;
        }
    }

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        Node[] graph = new Node[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a] = new Node(b, graph[a], c);
            graph[b] = new Node(a, graph[b], c);
        }

        int s = sc.nextInt();
        int t = sc.nextInt();

        int result = dijkstra(graph, s, t);
        System.out.println(result);
    }

    public static int dijkstra(Node[] graph, int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparing(n -> n.weight));
        int[] distance = new int[n + 1];
        boolean[] visited = new boolean[n + 1];

        //초기거리 무한대로 설정
        for (int i = 0; i <= n; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[start] = 0;
        pq.add(new Node(start, null, 0));

        while (!pq.isEmpty()) {
            //현재 정점 설정
            Node current = pq.poll();
            int cur = current.vertax;
            //이미 방문했으면 통과
            if (visited[cur]) {
                continue;
            }
            //방문한 정점임을 표시
            visited[cur] = true;

            //end에 도달하면 최단거리 반환
            if (cur == end) {
                return distance[cur];
            }

            for (Node a = graph[cur]; a != null; a = a.next) {
                int v = a.vertax;
                int w = a.weight;

                if (!visited[v] && distance[cur] + w < distance[v]) {
                    distance[v] = distance[cur] + w;
                    pq.add(new Node(v, null, distance[v]));
                }
            }
        }
        //경로가 없으면 -1반환
        return -1;
    }
}


package com.suanfa;

public class Dijkstra {
    static int MAX = 10000;

    public static void main(String[] args) {

        //邻接矩阵
        int[][] weight = {
                {0, 10, MAX, 30, 100},
                {MAX, 0, 50, MAX, MAX},
                {MAX, MAX, 0, MAX, 10},
                {MAX, MAX, 20, 0, 60},
                {MAX, MAX, MAX, MAX, 0}
        };

        System.out.println("0表示------城市A");
        System.out.println("1表示------城市B");
        System.out.println("2表示------城市C");
        System.out.println("3表示------城市D");
        System.out.println("4表示------城市E");

        int start = 0;
        int[] shortPath = Dijsktra(weight, start);
        for (int i = 0; i < shortPath.length; i++) {
            System.out.println("从" + start + "出发到" + i + "的最短距离为：" + shortPath[i]);
        }
    }

    //接受一个有向图的权重矩阵，和一个起点编号start（从0编号，顶点存在数组中）
    //返回一个int[] 数组，表示从start到它的最短路径长度
    public static int[] Dijsktra(int[][] weight, int start) {

        int n = weight.length;
        //存放从start到其他各点的最短路径
        int[] shortPath = new int[n];
        //存放从start到其他各点的最短路径的字符串表示
        String[] path = new String[n];
        for (int i = 0; i < n; i++) {
            path[i] = start + "-->" + i;
        }
        //标记当前该顶点的最短路径是否已经求出,1表示已求出
        int[] visited = new int[n];

        shortPath[start] = 0;
        visited[start] = 1;
        for (int count = 1; count <= n - 1; count++) {
            //选出一个距离初始顶点start最近的未标记顶点
            int k = -1;
            int dmin = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (visited[i] == 0 && weight[start][i] < dmin) {
                    dmin = weight[start][i];
                    k = i;
                }
            }
            //将新选出的顶点标记为已求出最短路径，且到start的最短路径就是dmin
            shortPath[k] = dmin;
            visited[k] = 1;
            //以k为中间点，修正从start到未访问各点的距离
            for (int i = 0; i < n; i++) {
                if (visited[i] == 0 && weight[start][k] + weight[k][i] < weight[start][i]) {
                    weight[start][i] = weight[start][k] + weight[k][i];
                    path[i] = path[k] + "-->" + i;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("从" + start + "出发到" + i + "的最短路径为：" + path[i]);
        }
        System.out.println("=====================================");
        return shortPath;
    }
}

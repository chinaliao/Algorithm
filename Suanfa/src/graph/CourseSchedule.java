package graph;

import DP.Lis;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:CourseSchedule
 * Description:
 */
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            adj.get(prerequisite[1]).add(prerequisite[0]);
        }
        int [] visited = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if(hasCycle(i,adj,visited)){
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(int i, List<List<Integer>> adj, int[] visited) {
        if (visited[i] == 1) return false;
        if (visited[i]==2) return true;

        visited[i]=1;
        for (Integer integer : adj.get(i)) {
            if (hasCycle(integer,adj,visited)) {
                return true;
            }
        }
        visited[i]=2;
        return false;
    }
}

package org.jessenpan.leetcode.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:heap
 */
public class S502Ipo {

    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {

        PriorityQueue<Project> projects = new PriorityQueue<>((o1, o2) -> {
            if (o1.profit == o2.profit) {
                return Integer.compare(o1.capital, o2.capital);
            }
            return Integer.compare(o2.profit, o1.profit);
        });
        int len = Profits.length;
        for (int i = 0; i < len; i++) {
            projects.add(new Project(Profits[i], Capital[i]));
        }
        int i = 0;
        while (i < k) {
            boolean foundProject = false;
            List<Project> notFitProjects = new ArrayList<>();
            while (!foundProject) {
                Project project = projects.poll();
                if (project == null) {
                    break;
                }
                if (project.capital > W) {
                    notFitProjects.add(project);
                } else {
                    foundProject = true;
                    W += project.profit;
                }
            }
            projects.addAll(notFitProjects);
            i++;
        }
        return W;
    }

    static class Project {

        int profit, capital;

        Project(int profit, int capital) {
            this.profit = profit;
            this.capital = capital;
        }
    }
}

package org.jessenpan.leetcode.bfs;

import java.util.*;

/**
 * @author jessenpan
 * tag:depth first search
 */
public class S690EmployeeImportance {

    public static class Employee {

        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee employee : employees) {
            employeeMap.put(employee.id, employee);
        }
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(employeeMap.get(id));
        int importanceOfId = 0;
        while (!queue.isEmpty()) {
            Employee employee = queue.poll();
            importanceOfId += employee.importance;
            if (employee.subordinates != null) {
                for (Integer subordinate : employee.subordinates) {
                    queue.offer(employeeMap.get(subordinate));
                }
            }
        }
        return importanceOfId;
    }
}

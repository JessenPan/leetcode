package org.jessenpan.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S811SubdomainVisitCount {

    private static final char DOT = '.';

    public static final String SPACE = " ";

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> domainCounter = new HashMap<>();
        int lengthOfDomains = cpdomains.length;
        for (int i = 0; i < lengthOfDomains; i++) {
            String[] domainArray = cpdomains[i].split(SPACE);
            Integer times = Integer.parseInt(domainArray[0]);
            String domain = domainArray[1];
            do {
                Integer count = domainCounter.get(domain);
                count = count == null ? times : count + times;
                domainCounter.put(domain, count);
                int indexOfDot = domain.indexOf(DOT);
                if (indexOfDot != -1) {
                    domain = domain.substring(indexOfDot + 1);
                } else {
                    break;
                }
            } while (true);
        }
        return domainMap2List(domainCounter);
    }

    private List<String> domainMap2List(Map<String, Integer> domainCounter) {
        List<String> domainList = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : domainCounter.entrySet()) {
            domainList.add(entry.getValue() + " " + entry.getKey());
        }
        return domainList;
    }
}

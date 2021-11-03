package org.jessenpan.leetcode.dsu;

import java.util.*;

/**
 * @author jessenpan
 * tag:map
 */
public class S721AccountsMerge {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {

        Map<String, String> emailToAmountMap = new HashMap<>();
        Map<String, Set<String>> accountToEmailMap = new HashMap<>();

        int len = accounts.size();
        for (int i = 0; i < len; i++) {

            List<String> accountString = accounts.get(i);
            int size = accountString.size();
            String currentAccount = null;
            Set<String> containingAccounts = new HashSet<>();
            boolean beContainted = false;
            Set<String> emails = new HashSet<>();
            for (int j = 0; j < size; j++) {
                if (j == 0) {
                    currentAccount = accountString.get(j) + "_" + i;
                    continue;
                }
                String email = accountString.get(j);
                if (emailToAmountMap.containsKey(email) && !emailToAmountMap.get(email).equals(currentAccount)) {
                    beContainted = true;
                    containingAccounts.add(emailToAmountMap.get(email));
                }
                emailToAmountMap.put(email, currentAccount);
                emails.add(email);
            }
            accountToEmailMap.put(currentAccount, emails);
            if (beContainted) {

                for (String containingAccount : containingAccounts) {
                    emails = accountToEmailMap.get(containingAccount);
                    for (String email : emails) {
                        emailToAmountMap.put(email, currentAccount);
                    }
                    accountToEmailMap.remove(containingAccount);
                    accountToEmailMap.get(currentAccount).addAll(emails);
                }
            }
        }

        List<List<String>> rs = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : accountToEmailMap.entrySet()) {
            int slashIdx = entry.getKey().indexOf('_');
            String account = entry.getKey().substring(0, slashIdx);
            List<String> list = new ArrayList<>();
            List<String> emails = new ArrayList<>(entry.getValue());
            Collections.sort(emails);
            list.add(account);
            list.addAll(emails);
            rs.add(list);
        }

        return rs;
    }

}

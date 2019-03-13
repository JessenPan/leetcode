package org.jessenpan.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:string
 */
public class S929UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        int lengthOfEmails = emails.length;
        for (int i = 0; i < lengthOfEmails; i++) {
            String normalizedMail = normalizeMail(emails[i]);
            uniqueEmails.add(normalizedMail);
        }

        return uniqueEmails.size();
    }

    private static final char EMAIL_SEPARATOR = '@';

    private static final char ADD_SYMBOL = '+';

    private static final String DOT_SYMBOL = ".";

    private String normalizeMail(String email) {
        int indexOfEmailSeparator = email.indexOf(EMAIL_SEPARATOR);
        String localAddress = email.substring(0, indexOfEmailSeparator);
        int indexOfAdd = localAddress.indexOf(ADD_SYMBOL);
        if (indexOfAdd != -1) {
            localAddress = localAddress.substring(0, indexOfAdd);
        }
        return localAddress.replace(DOT_SYMBOL, "") + email.substring(indexOfEmailSeparator);
    }
}

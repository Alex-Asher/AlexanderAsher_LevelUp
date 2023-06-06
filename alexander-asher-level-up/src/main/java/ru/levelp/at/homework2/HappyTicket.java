package ru.levelp.at.homework2;

import static java.lang.Character.isDigit;

public class HappyTicket {

    public static boolean isTicketHappy(String ticketNumber) {
        if (ticketNumber.isEmpty()) {
            throw new IllegalArgumentException("Ticket number can't be empty!");
        }

        if (ticketNumber.length() != 6) {
            throw new IllegalArgumentException("Ticket number must contain six digits!");
        }

        int firstThreeDigitsSum = 0;
        int lastThreeDigitsSum = 0;

        for (int i = 0; i < 3; ++i) {
            if (isDigit(ticketNumber.charAt(i))) {
                firstThreeDigitsSum += Character.getNumericValue(ticketNumber.charAt(i));
            } else {
                throw new IllegalArgumentException("Ticket number must contain only digits!");
            }
        }

        for (int i = 3; i < 6; ++i) {
            if (isDigit(ticketNumber.charAt(i))) {
                lastThreeDigitsSum += Character.getNumericValue(ticketNumber.charAt(i));
            } else {
                throw new IllegalArgumentException("Ticket number must contain only digits!");
            }
        }

        return firstThreeDigitsSum == lastThreeDigitsSum;
    }
}

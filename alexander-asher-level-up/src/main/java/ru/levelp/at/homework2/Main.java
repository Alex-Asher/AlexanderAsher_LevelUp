package ru.levelp.at.homework2;

import static ru.levelp.at.homework2.HappyTicket.isTicketHappy;

public class Main {
    public static void main(String[] args) {
        String ticketNumber1 = "333333";
        System.out.println(isTicketHappy(ticketNumber1));

        String ticketNumber2 = "123456";
        System.out.println(isTicketHappy(ticketNumber2));

        String ticketNumber3 = "000000";
        System.out.println(isTicketHappy(ticketNumber3));

        String ticketNumber4 = "";
        System.out.println(isTicketHappy(ticketNumber4));

        String ticketNumber5 = "12345678910";
        System.out.println(isTicketHappy(ticketNumber5));

        String ticketNumber6 = "1a3b5c";
        System.out.println(isTicketHappy(ticketNumber6));
    }
}

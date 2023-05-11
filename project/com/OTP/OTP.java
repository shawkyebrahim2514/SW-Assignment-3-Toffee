/*
package com.OTP;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class OTP {

    private static final String EMAIL = "basmala11gad@gmail.com";
    private static final String PASSWORD = "helloBosbos1311";
    private static final String OTP_SUBJECT = "Your OTP Code";
    private static final String OTP_MESSAGE = "Your OTP code is: ";

    public static void run() {

        // Generate a random 4-digit OTP
        int otp = new Random().nextInt(9000) + 1000;

        // Recipient's email address
        String to = "shawky.ebrahim2514@gmail.com";

        // Email properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Authenticate the sender's email address
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(EMAIL, PASSWORD);
                    }
                });

        try {
            // Create a new email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EMAIL));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));
            message.setSubject(OTP_SUBJECT);
            message.setText(OTP_MESSAGE + otp);

            // Send the email message
            Transport.send(message);

            System.out.println("Email sent successfully with OTP code: " + otp);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}

*/


package com.OTP;

import java.util.Random;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class OTP {
    public static void run() {
        // Generate a random OTP
        String otp = generateOTP();

        // Send the OTP by email
        String to = "kdj.eshra@gmail.com";
        String from = "toffeestoreOfficial@gmail.com";
        String host = "smtp.gmail.com";
        String username = "toffeestoreOfficial@gmail.com";
        String password = "wyktoiryaoipehqm";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("OTP Verification.");
            message.setText("Your OTP is: " + otp);

            Transport.send(message);

            System.out.println("OTP sent successfully!");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    private static String generateOTP() {
        int length = 4;
        String numbers = "0123456789";
        Random random = new Random();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(numbers.length());
            char digit = numbers.charAt(index);
            sb.append(digit);
        }

        return sb.toString();
    }
}

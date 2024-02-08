package com.spring.MailSender.Service;

import com.spring.MailSender.Model.EmailDetails;

public interface EmailService {
    //Method
    //To send simple Email
    String sendSimpleMail(EmailDetails details);

    //Method 
    //To send an email with attchment
   String sendMailWithAttachment (EmailDetails details);
}

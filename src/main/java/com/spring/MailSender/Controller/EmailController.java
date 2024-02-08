package com.spring.MailSender.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.MailSender.Model.EmailDetails;
import com.spring.MailSender.Service.EmailService;

@Controller
public class EmailController {

    @Autowired private EmailService emailService;

    //Sending a simple Email
    
    @PostMapping("/sendMail")
    public String
    sendMail(@RequestBody EmailDetails details)
    {
        String status
            = emailService.sendSimpleMail(details);
            return status;
    }

    //Sending email with attachment
     @PostMapping("/sendMailAttachment")
    public String sendingMailWithAttachment (
        @RequestBody EmailDetails details){
            String status
                = emailService.sendMailWithAttachment(details);
                 
                return status;
        }

    }

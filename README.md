# SpringBoot Sending Email
    Code is inspired by geeks-for-geeks site with my own understanding
1) First request the password from gmail as
         Login to Gmail 
            -> Manage your Google Account 
                -> Security 
                  -> App Passwords 
                      -> Provide your login password 
                          -> Select app with a custom name 
                              -> Click on Generate

2) Include Spring Dependencies
         Spring-Web
         Lombok
         Starter-mail

3) Model
      Need recipient,msgBody,subject,& attachment; // For the message components.
5) Service
     SendSimpleMail(EmailDetails details);
     SendMailWithAttachment(EmailDetails details)

  ServiceImpl
    SendSimpleMail-->> javaMailSender.send(mailMessage) -->> mailMessage.setFrom(sender),.setTO(details.getRecipient)....
    SendMailWithAttachment  --> MimeMessage to attach in message ...

6) EmailController
       @PostMapping(/sendMail,/sendMailAttachment)
       and then @RequestBody emaildetails .. then emailService.sendSimpleMail(details);
          
      
    

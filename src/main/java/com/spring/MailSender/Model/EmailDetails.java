package com.spring.MailSender.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {
    //Class date members

    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
    
}

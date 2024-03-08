package com.random.emailservice.application;

import com.random.emailservice.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import com.random.emailservice.adapters.EmailSenderGateway;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}

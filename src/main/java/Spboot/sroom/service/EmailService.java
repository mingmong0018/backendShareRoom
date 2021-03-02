package Spboot.sroom.service;

import java.util.Properties;
import java.util.Random;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import Spboot.sroom.dao.IEmailDao;
import Spboot.sroom.util.MailHandler;

@Service
public class EmailService implements IEmailService{
	@Autowired
	IEmailDao iedao;
	
	
	@Autowired
	private JavaMailSenderImpl javaMailSenderImpl;

	@Override
	public String[] mailSend(String email) {
	
		Random rand=new Random(System.currentTimeMillis());
		int result=100000 + rand.nextInt(900000);
		String s_result=Integer.toString(result);
		String[] mailCertification={email,s_result};
		try {
			MailHandler mailHandler=new MailHandler(javaMailSenderImpl);
			
			//받는 사람
			mailHandler.setTo(email);
			//보내는 사람
			mailHandler.setForm("testtest.korea.2021@gmail.com");
			//제목
			mailHandler.setSubject("쉐어룸 인증번호입니다.");
			//HTML Layout
			String htmlContent ="<p>인증번호 : "+result+"</p>";
			mailHandler.setText(htmlContent, true);
			mailHandler.send();
			
			
			
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
			return mailCertification;
		
		
		
		
	}

	@Override
	public void memberConfirm(String id) {
		iedao.memberConfirm(id);
		
	}

}

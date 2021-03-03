package Spboot.sroom.util;

import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MailHandler {
	private JavaMailSender sender;
	private MimeMessage message;
	private MimeMessageHelper messageHelper;
	
	//생성자
	public MailHandler(JavaMailSender jSender) throws MessagingException{
		this.sender=jSender;
		this.message=jSender.createMimeMessage();
		this.messageHelper=new MimeMessageHelper(message, true,"UTF-8");
	}
	
	//보내는 사람 이메일
	public void setForm(String fromAddress) throws MessagingException{
		this.messageHelper.setFrom(fromAddress);
	}
	
	//받는 사람 이메일
	public void setTo(String email) throws MessagingException{
		this.messageHelper.setTo(email);
	}
	
	//제목 
	public void setSubject(String subject) throws MessagingException{
		this.messageHelper.setSubject(subject);
	}
	
	//메일 내용
	public void setText(String text, boolean useHtml) throws MessagingException {
        this.messageHelper.setText(text, useHtml);
    }
	 // 첨부 파일
    public void setAttach(String displayFileName, String pathToAttachment) throws MessagingException, IOException {
        File file = new ClassPathResource(pathToAttachment).getFile();
        FileSystemResource fsr = new FileSystemResource(file);

        this.messageHelper.addAttachment(displayFileName, fsr);
    }
 // 이미지 삽입
    public void setInline(String contentId, String pathToInline) throws MessagingException, IOException {
        File file = new ClassPathResource(pathToInline).getFile();
        FileSystemResource fsr = new FileSystemResource(file);

        this.messageHelper.addInline(contentId, fsr);
    }

    // 발송
    public void send() {
        try {
            this.sender.send(message);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    

}

package Spboot.sroom.service;

public interface IEmailService {
	public String[] mailSend(String email);
	public void memberConfirm(String id);

}

package Spboot.sroom.util;

public interface IJwtUtil {
	public String createJWT(String id,String name,String email);
	public String verifyToken(String givenJWT);
}

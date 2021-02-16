package Spboot.sroom.util;

public interface IJwtUtil {
	public String createJWT(String id,String name);
	public String verifyToken(String givenJWT);
}

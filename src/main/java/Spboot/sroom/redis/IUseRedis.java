package Spboot.sroom.redis;


public interface IUseRedis {
	public String getField(String id);
	public void setField(String id, String JWTtoken);
}

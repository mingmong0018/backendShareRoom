package Spboot.sroom.redis;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class UseRedis implements IUseRedis{
	
	@Resource(name = "redisTemplate")
	ValueOperations<String,Object>vop;
	
	
	@Override
	public String getField(String id) {
		System.out.println("getField : "+(String)vop.get(id));
		return (String)vop.get(id);
	}

	@Override
	public void setField(String id, String JWTtoken) {
		vop.set(id,JWTtoken);
		
	}
	
}

package yongs.temp.service;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {
    private static final Logger logger = LoggerFactory.getLogger(ShoppingCartService.class);
    
    @Resource(name = "redisTemplate") 
    private HashOperations<String, String, String> hashOperations;

    public Map<String, String> getCart(String username) throws Exception {
    	logger.debug("yongs-shoppingcart|ShoppingCartService|getCart()");
    	return hashOperations.entries(username);
    }
}
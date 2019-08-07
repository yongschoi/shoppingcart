package yongs.temp.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yongs.temp.service.ShoppingCartService;

@RestController
@RequestMapping("/shoppingcarts")
public class ShoppingCartController {
    private static final Logger logger = LoggerFactory.getLogger(ShoppingCartController.class);	

    @Autowired
    ShoppingCartService service;
    
    @GetMapping("/{user}")
    public Map<String, String> getCart(@PathVariable("user") String username) throws Exception{
    	logger.debug("yongs-shoppingcart|ShoppingCartController|getCart()");
    	
        return service.getCart(username);
    }
}
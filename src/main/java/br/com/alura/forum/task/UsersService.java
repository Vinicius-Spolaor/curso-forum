package br.com.alura.forum.task;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public class UsersService implements OrdersService{

    public int getNumberOfItemsBought(String username) {
        return 0;
    }

	@Override
	public List<Item> itemsBought(String username) {
		return null;
	}
    
}

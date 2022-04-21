package br.com.alura.forum.task;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public interface OrdersService {
	List<Item> itemsBought(String username);
}

package br.com.alura.forum.task;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
	
	@Autowired
	private UsersService usersService;

	@GetMapping("/users/{username}/items/total")
    public Map<String, Integer> totalItemsBought(@PathVariable String username) {
		
        return new HashMap<String, Integer>() {
			private static final long serialVersionUID = 1L;

		{ put(username, usersService.getNumberOfItemsBought(username)); }};
    }

}

package Todo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Todo.Repositories.TodoRepo;
import Todo.model.Todo;


@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	
	TodoRepo todoRepository;
	
	@GetMapping("/findall")
	
	public List<Todo> fetchAll(){
		return this.todoRepository.findAll();
		
	
	}

}

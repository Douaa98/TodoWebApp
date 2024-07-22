package Todo.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;




@Entity
@Data
@Table (name="Users")
public class Todo {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long Id;
	

	private String task;
	
	private Date date;
	
	private String IsDone;
	
	
	
	
}

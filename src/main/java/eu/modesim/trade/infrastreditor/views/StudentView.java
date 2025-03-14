package eu.modesim.trade.infrastreditor.views;

import org.vaadin.crudui.crud.impl.GridCrud;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import eu.modesim.trade.infrastreditor.model.Student;
import eu.modesim.trade.infrastreditor.services.StudentService;

@Route("/students")
public class StudentView extends VerticalLayout{
	
	public StudentView(StudentService service) {
		GridCrud<Student> crud = new GridCrud<>(Student.class, service);
		//crud.setFindAllOperation(service::findAll);
		this.add(crud);
		this.setSizeFull();
	}
	
}

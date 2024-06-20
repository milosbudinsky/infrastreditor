package eu.modesim.trade.infrastreditor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eu.modesim.trade.infrastreditor.model.Line;
import eu.modesim.trade.infrastreditor.model.Point;
import eu.modesim.trade.infrastreditor.repositories.LineRepository;
import eu.modesim.trade.infrastreditor.repositories.PointRepository;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/api")
//@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class InfrastreditorController { 
	
	private static final String template = "Hello, %s!!!?";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Counter=" +  counter.incrementAndGet() + " " + String.format(template, name);
	}
	
    @Autowired
    private PointRepository pointRepository;

    @Autowired
    private LineRepository lineRepository;

    @GetMapping("/points")
    public List<Point> getAllPoints() {
        return pointRepository.findAll();
    }

    @GetMapping("/pointNames")
    public String getAllPointNames() {
        return pointRepository.findAll().toString();
    }

    
    @GetMapping("/lines")
    public List<Line> getAllLines() {
        return lineRepository.findAll();
    }
}

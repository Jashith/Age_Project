package person;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Calendar;

@RestController
public class PersonController {

    private static final String template = "Year of Birth, %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/personAge")
    public PersonDetails calculateAge(@RequestParam(value="age", defaultValue="1") int age) {

	Calendar now = Calendar.getInstance(); 
	int year = now.get(Calendar.YEAR); 

	String v_details = String.valueOf(year-age);
	
	return new PersonDetails(counter.incrementAndGet(),
                             age, String.format(template, v_details));
    }
}


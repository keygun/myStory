package tr.com.kerel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "test")
public class Rest {

	@RequestMapping(name = "Deneme", method = RequestMethod.GET)
	public String Test() {
		return "aa";
	}
	
}

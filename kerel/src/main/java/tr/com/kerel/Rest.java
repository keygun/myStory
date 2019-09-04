package tr.com.kerel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/m1")
public class Rest {

	@RequestMapping(value =  "/m2", method = RequestMethod.GET)
	public String Test() {
		return "aa";
	}
	
}

package io.cloudadc.websocket;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "text/plain;charset=UTF-8")
public class RESTController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RESTController.class);

	@RequestMapping(path = {"/rlzy/foo"}, method = {RequestMethod.GET})
	public String foo (HttpServletRequest request) {
		LOGGER.info("HTTP GET REQUEST");
		return "SUCCESS\n";
	}
}

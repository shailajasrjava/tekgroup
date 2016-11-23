package controller;

import org.codehaus.plexus.util.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	public String getDesc(String desc) {
		return "Hello: " + desc;

	}

	public String getTitle(String name) {
		if (StringUtils.isEmpty(name)) {
			return "Hello World";

		} else {
			return "Hello " + name;

		}

	}

}

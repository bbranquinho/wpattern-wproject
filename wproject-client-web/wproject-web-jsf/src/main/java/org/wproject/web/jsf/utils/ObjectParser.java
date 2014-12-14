package org.wproject.web.jsf.utils;

import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;

public class ObjectParser {

	public static final ObjectMapper JSON_MAPPER = new ObjectMapper();

	static {
		JSON_MAPPER.configure(Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

}

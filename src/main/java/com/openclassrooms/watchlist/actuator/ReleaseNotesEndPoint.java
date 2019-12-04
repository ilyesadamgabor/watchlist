package com.openclassrooms.watchlist.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="release-notes")
public class ReleaseNotesEndPoint {
	String version1_0 = "** Version 1.0 ** \n\n"
			+ "* Homepage added \n"
			+ "* Item creation form added \n"
			+ "* View the watchlist page added \n\n";
	
	String version1_1 = "** Version 1.1** \n\n"
			+ "* Reading from OMDb API added \n"
			+ "* Actuator endpoints added \n\n";
	
	@ReadOperation
	public String releaseNotes() {
		return version1_1 + version1_0;
	}
	
	@ReadOperation
	public String selectReleaseNotes(@Selector String selector) {
		
		if("1.0".equals(selector))
			return version1_0;
		else if("1.1".equals(selector))
			return version1_1;
		else
			return releaseNotes();		
	}
}

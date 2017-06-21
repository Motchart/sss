package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class App {
	String ip = "http://api.ipify.org";
	@GET
	@Path("/ip")
	public String name() throws MalformedURLException, IOException {
		return new BufferedReader(new InputStreamReader(new URL(ip).openStream())).readLine();
	}

}

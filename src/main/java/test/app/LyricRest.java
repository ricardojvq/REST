package test.app;

import java.net.SocketException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import test.entity.GetLyricResult;

public class LyricRest {

	public static void main(String[] args) {

		while (true) {

			try {
				Thread.sleep(1000);
				ResteasyClient reClient = new ResteasyClientBuilder().build();
				ResteasyWebTarget tgt = reClient
						.target("http://api.chartlyrics.com/apiv1.asmx/SearchLyricDirect?artist=metallica&song=enter%20the%20sandman");
				Response response = tgt.request(MediaType.APPLICATION_XML)
						.get();

				System.out.println(response.readEntity(GetLyricResult.class)
						.getLyric());
				return;
			} catch (Exception e) {
				System.err.println("no socket");
				
			}
		}

	}

}

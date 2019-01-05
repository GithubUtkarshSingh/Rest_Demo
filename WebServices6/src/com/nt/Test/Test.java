package com.nt.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Test
{
	public static void main(String[] args)
	{
	   String url="http://localhost:7836/WebServices2/msg/show;sid=5;sname=Ut;sfee=2.2";
	   Client c=Client.create();
	   WebResource wr=c.resource(url);
	   ClientResponse cr=wr.get(ClientResponse.class);
	   String en=cr.getEntity(String.class);
	   System.out.println(en);
	   System.out.println(cr.getStatus());
	   System.out.println(cr.getStatusInfo());
	}
}
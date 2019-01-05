package com.nt.Demo;

import javax.ws.rs.GET;
	import javax.ws.rs.MatrixParam;
	import javax.ws.rs.Path;


	@Path("/msg")
	public class Show
	{
	@GET
	@Path("/show")
	public String ShowMsg(
			@MatrixParam("sid")int id, @MatrixParam("sname")String sn,@MatrixParam("sfee")double fee)
	{
		return "Hello:id="+id+","+"name:"+sn+","+"fee:"+fee;
	}
	}

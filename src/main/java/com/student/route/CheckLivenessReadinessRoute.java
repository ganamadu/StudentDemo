package com.student.route;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CheckLivenessReadinessRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		rest("/liveness")
		.get()
		.outType(String.class)
		.description("Check Liveness of the Application")
		.responseMessage().code(200).message("Success").responseModel(String.class).endResponseMessage()
		.responseMessage().code(500).message("Internal Serrverr Error").responseModel(String.class).endResponseMessage()
		.to("direct:checkliveness");
		from("direct:checkliveness")
		.routeId("checklivenessroute")
		.process(exchange->{
			exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, 200);
			exchange.getIn().setBody("Application Is Live");
		}).end();
		
	
		rest("/readiness")
		.get()
		.outType(String.class)
		.description("Check Liveness of the Application")
		.responseMessage().code(200).message("Success").responseModel(String.class).endResponseMessage()
		.responseMessage().code(500).message("Internal Serrverr Error").responseModel(String.class).endResponseMessage()
		.to("direct:checkreadiness");
		from("direct:checkreadiness")
		.routeId("checkreadinessroute")
		.process(exchange->{
			exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, 200);
			exchange.getIn().setBody("Application Is Ready");
		}).end();
		
		
	}

}

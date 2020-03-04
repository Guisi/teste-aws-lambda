package com.guisi.teste.awslambda;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaRequestHandler implements RequestHandler<Map<String, String>, Map<String, String>> {

	public Map<String, String> handleRequest(Map<String, String> request, Context context) {
		
		try {
			context.getLogger().log("Vai começar a gerar o arquivão maroto: " + request.toString());
			
			/*ObjectMapper mapper = new ObjectMapper();
			
			Map<String, String> paramMap = mapper.readValue(request, new TypeReference<Map<String, String>>() {});*/
			
			request.entrySet().stream().forEach(entry -> context.getLogger().log(entry.getKey() + " = " + entry.getValue()));
			
//			ByteArrayOutputStream xls = ExcelExample.generateExcelExample();
			
			context.getLogger().log("Gerou XLS!");
			
			return request;
			
		} catch (Exception e) {
			context.getLogger().log(e.getMessage());
			e.printStackTrace();
		}
		
		return null;
	}
	
}
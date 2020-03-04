package com.guisi.teste.awslambda;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.rumolog.utils.excel.ExcelUtils;
import com.rumolog.utils.excel.ExcelValueConfig;

public class ExcelExample {

	private static final List<ExcelValueConfig> EXCEL_CONFIGURATION = Collections.unmodifiableList(Arrays.asList(
					new ExcelValueConfig("Campo 1", "campo1", true, false),
					new ExcelValueConfig("Campo 2", "campo2", true, false)));
	
	private ExcelExample() {}
	
	public static ByteArrayOutputStream generateExcelExample() {
		List<Entity> data = Arrays.asList(
				new Entity("Valor do campo 1", BigDecimal.ONE),
				new Entity("Teste", BigDecimal.valueOf(123.45)));
		
		return new ExcelUtils().writeToExcel(EXCEL_CONFIGURATION, data);
	}
}

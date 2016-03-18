package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {
	
	//@Parameters({"excel"})
	public static Object[][] readDate(String excel){
		
		String filePath = excel;   //xls�ļ�����o	
		InputStream fs = null;
		Workbook workBook = null;
		String[][] array = null;		
		try {
			fs = new FileInputStream(filePath);  //���ļ�ת���ֽ�
			workBook = Workbook.getWorkbook(fs); //��ȡexle�Ĺ����� 
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}catch (BiffException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		//int col = 0;
		//int row = 0;
		Sheet[] sheets = workBook.getSheets();
		for (int n = 0;n<sheets.length;n++){
			Sheet sheet = sheets[n];
			if(sheet.getRows() == 0){
				continue;
			}
			array =new String[sheet.getRows()][sheet.getColumns()];  //sheet��Ϊ�յ�ʱ��ȡ������������
			Cell cell = null; //excelÿ����Ԫ��
			for (int i = 0;i<sheet.getRows();i++){
				
				for (int j=0;j<sheet.getColumns();j++){
					cell = sheet.getCell(j,i);   //getCell ���к���
					array[i][j]=cell.getContents();
					
				}
				
			}
			
		}
		return array;
		
	}
}
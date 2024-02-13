package GenricUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelUtility {
	public static String fetchData(String Sheet,int row,int Cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Iconstant.excel_path);
				Workbook w=WorkbookFactory.create(fis);
			Sheet s = w.getSheet(Sheet);
			Row r = s.getRow(row);
				return r.getCell(Cell).toString();
	}
	
	public static int rowSize(String Sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream(Iconstant.excel_path);
		Workbook w= WorkbookFactory.create(fis);
		Sheet s = w.getSheet(Sheet);
		return s.getPhysicalNumberOfRows();
	}
	public static int columeSize(String Sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream(Iconstant.excel_path);
		Workbook w= WorkbookFactory.create(fis);
		Sheet s = w.getSheet(Sheet);
		return s.getRow(0).getPhysicalNumberOfCells();
	}
	public static Object[][]fetchAllData(String Sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream(Iconstant.excel_path);
		Workbook w= WorkbookFactory.create(fis);
		Sheet s = w.getSheet(Sheet);
		int rowSize = s.getPhysicalNumberOfRows();
		int columeSize = s.getRow(0).getPhysicalNumberOfCells();
		Object d [][]=new Object[rowSize][columeSize];
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<columeSize;j++) {
				d[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		
		return d;
	}
	
	
	

}

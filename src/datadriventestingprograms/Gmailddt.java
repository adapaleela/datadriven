package datadriventestingprograms;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Gmailddt 
{

	public static void main(String[] args) throws Exception
	{
		
		File f=new File("E:\\leelajava\\datadriventesting\\datadrivenusingexcel.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		int nouc=rsh.getColumns();
		//open same file in write mode
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		// kapoor
		

	}

}

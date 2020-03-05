package testcase;

import java.io.IOException;

import keyword.ObjIden;
import testdata.ExcelData;

public class DriverScrp 
{
	public static void main(String[] args) 
	{
		ExcelData da=new ExcelData();
		ExcelData dak=new ExcelData();
		ObjIden idm=new ObjIden();
		try 
		{
			da.Excel("C:\\Users\\BLTuser.BLT215\\Desktop\\excel\\testdata.xlsx");
			dak.Excel("C:\\Users\\BLTuser.BLT215\\Desktop\\excel\\keyword.xlsx");
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0;i<=da.rowco();i++)
		{
		 String SearchString=da.getCellVa(i,0);
		 for (int j=1;j<=dak.rowco();j++)
		 {
			 String keyword1=dak.getCellVa(j,2);
			 if (keyword1.equalsIgnoreCase("OpenBrow"))
			 {
				 idm.OpenBrow(); 
			 }
			 else if (keyword1.equalsIgnoreCase("SetUrl"))
			 
			 {
				 idm.SetUrl();
			 }
			 else if(keyword1.equalsIgnoreCase("Search"))
			 {
				 idm.Search(SearchString);
			 }
			 else if (keyword1.equalsIgnoreCase("closeBrow"))
			 {
				 idm.closeBrow();
			 }
		 }
		}
	}
}
	

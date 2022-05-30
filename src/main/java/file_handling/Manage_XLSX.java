package file_handling;

public class Manage_XLSX {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir"));
		String path =System.getProperty("user.dir") + "\\src\\main\\java\\file_handling\\Data.xlsx" ;
		Xls_Reader xls= new Xls_Reader(path);
		
		// Counting rows in excel
		int rows =xls.getRowCount("LoginTest");
		System.out.println(rows);
		
		// Counting cols in excel
		int cols =xls.getColumnCount("LoginTest");
		System.out.println(cols);
		
		// Reading Data in excel
		
	    String data =xls.getCellData("LoginTest","Browser",2);
	    System.out.println(data);
	    data= xls.getCellData("TestSheet",3,4);
	    System.out.println(data);
	
		// Writing Data into excel
	    
	    xls.setCellData("LoginTest","Browser",10,"OperaBrowser");

	}

}

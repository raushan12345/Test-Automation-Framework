package com.ui.dataProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.google.gson.Gson;
import com.ui.pojo.User;
import com.ui.pojo.testData;
import com.utility.csvReaderUtility;
import com.utility.excelReaderUtility;

public class loginDataProvider {

	@DataProvider(name = "LoginTestDataProvider")
	public Iterator<Object[]> loginDataProvider() throws FileNotFoundException {
		Gson gson = new Gson();
		File testDataFile = new File(System.getProperty("user.dir") + "\\testData\\loginData.json");
		FileReader fileReader = new FileReader(testDataFile);
		testData data = gson.fromJson(fileReader, testData.class); // deserialization

		List<Object[]> dataToReturn = new ArrayList<Object[]>();
		for (User user : data.getData()) {
			dataToReturn.add(new Object[] { user });

		}

		return dataToReturn.iterator();
	}

	@DataProvider(name = "LoginTestCSVDataProvider")
	public Iterator<User> loginCSVDataProvider(){
		return csvReaderUtility.readCSVFile("loginData.csv");
	}
	
	@DataProvider(name = "LoginTestExcelDataProvider")
	public Iterator<User> loginExcelDataProvider(){
		return excelReaderUtility.readExcelFile("loginData.xlsx");
	}

}

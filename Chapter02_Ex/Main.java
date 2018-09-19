package ppms.Sample.Chapter02_Ex;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("file.txt");
			// C:\CNSPGStudio\workspace\PPMS_AD 에 file.txt 파일이 있어야 오류가 안나고
			System.out.println("★★★★★★★★★★");
			System.out.println(f.toString());
			System.out.println("★★★★★★★★★★");
			f.setValue("year", "2018");
			f.setValue("month", "09");
			f.setValue("day", "04");
			System.out.println("★★★★★★★★★★★★★★★★★★★★");
			System.out.println(f.toString());
			System.out.println("★★★★★★★★★★★★★★★★★★★★");
			f.writeToFile("newfile.txt");
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			System.out.println(f.toString());
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			// C:\CNSPGStudio\workspace\PPMS_AD 에 newfile.txt 파일이 생성됨
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

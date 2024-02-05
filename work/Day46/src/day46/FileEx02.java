package day46;

import java.io.*;

public class FileEx02 {
	public static void main(String[] args) {
		
		// 파일 복사 프로그램
		FileReader fr;
		FileWriter fw;
		BufferedReader br;
		BufferedWriter bw;
		
		try {
			fr = new FileReader("prac.txt");
			fw = new FileWriter("result.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String line;
			
			while((line = br.readLine()) != null) { // readLine() : 줄바꿈전까지의 문자열을 한줄 씩 읽어옴
				bw.write(line);
			}
			
			bw.close();
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

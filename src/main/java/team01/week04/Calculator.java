package team01.week04;

import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Calculator {
	int grade;
	int time;
	int line;

	public double money() {
		double result = calline() + calminute();
		result = result-(100*result-(int)100*result)/100;
		if (grade == 1) {// gold
			return result;
		} else if (grade == 2) {// silver
			return result;
		}
		return 0;
	}

	public int addminute() {
		if (grade == 1) { // gold
			return time - 1000 >= 0 ? time - 1000 : -1;
		} else if (grade == 2) { // silver
			return time - 500 >= 0 ? time - 500 : -1;
		} else {
			return -100;
		}
	}

	public double calminute() {
		if(grade == 1){ // gold
			return addminute() == -1?  49.95: 49.95 + addminute() * 0.45;
		}
		else if (grade == 2){// silver
			return  addminute() == -1? 29.95: 29.95 + addminute() * 0.54;
		}
		else{return -1;}
	}

	public int addline() {
		if (line - 3 < 0) {
			return -1;
		} else {
			return line - 3;
		}
	}

	public double calline() {
		
		if (line == 1) {
			return 0;
		}
		if(addline()>=0)
			return (grade==1)? 14.5 * 2 + addline() * 5 :21.5 * 2 + addline() * 5;
		else
			return (grade == 1) ? 14.5 * (line - 1) : 21.5 * (line - 1);
	}
/**
	public static void main(String[] args) throws IOException {
		 final Logger logInfo = Logger.getLogger(
				    Thread.currentThread().getStackTrace()[0].getClassName() );
		BufferedReader br = new BufferedReader(new FileReader("src/Out.txt"));
		for (;;) {
			Calculator cal = new Calculator();
	        	String fileline = br.readLine();
	            	if (fileline==null){
	            		break;
	            	} 
	            	//등급,통화시간 회선개수추가 
		        cal.grade= Integer.parseInt(fileline.split(" ")[0]);
		        cal.time= Integer.parseInt(fileline.split(" ")[1]);
		        cal.line= Integer.parseInt(fileline.split(" ")[2]);
			logInfo.info(String.format("%.2f",cal.money()));
			logInfo.info("\n");
		}
		br.close();
	}
**/
}

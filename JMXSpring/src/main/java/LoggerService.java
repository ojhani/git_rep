package main.java;

public class LoggerService {
     private String logString;                          
	 public String getLogString() {
	     return logString;
	 }
	 public void setLogString(String logString) {
	     this.logString = logString;
	 }
	 public void log(){
	     System.out.println(logString);
	 }
}

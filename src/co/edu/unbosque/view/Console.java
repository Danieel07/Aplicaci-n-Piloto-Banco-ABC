package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	 private Scanner reader;
	    
	    public Console(){
	        reader = new Scanner(System.in);
	    }
	    public int readInt(){
	        return reader.nextInt();
	    }
	    public float readFloat(){
	        return reader.nextFloat();
	    }
	    public double readDouble(){
	        return reader.nextDouble();
	    }
	    
	    public long readLong(){
	        return reader.nextLong();
	    }

	    public String readLine(){
	        return reader.nextLine();
	    }

	    public String readWord(){
	        return reader.next();
	    }
	    public char readLetter(){
	        return reader.next().charAt(0);
	    }
	    public void showText(String text){
	        System.out.println(text);
	    }
	    
}

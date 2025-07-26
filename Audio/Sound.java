import java.io.*;
import java.util.*;
import javax.sound.sampled.*;
public class Sound{
	public static void main(String[] args){
	String Path="Drifting Memories - The Mini Vandals.wav";//initializing path to a string
	File file=new File(Path);//creating a file to contain the audio
	try(Scanner sc=new Scanner(System.in);AudioInputStream audio=AudioSystem.getAudioInputStream(file)){//inside the try block no need to close open resources
		Clip clip=AudioSystem.getClip();//java audio player clip
		clip.open(audio);//Opens the audio resource
		String option="";
			while(!option.equals("Q")){
			System.out.println("Enter your Choice :");
			System.out.println("P for Play");
			System.out.println("S for Stop");
			System.out.println("Q for Quit");
			option=sc.next();
	 	switch(option){
		case "P" -> clip.start();
		case "S" -> clip.stop();
		case "Q" -> clip.close();
		default ->System.out.println("Invalid option");	}	
	}
	}
	catch(UnsupportedAudioFileException e){
		System.out.println("NOT SUPPORTED");
	}
	catch(LineUnavailableException e){
		System.out.println("Line not found");
	}
	catch(IOException e){
		System.out.println("File Error");
	}

	}
	
}
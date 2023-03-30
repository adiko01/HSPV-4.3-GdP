package beispiele.Exceptions;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class ExcBsp
{
	public static void logExecutedProgram() throws IOException
	{
		String content = System.getProperty("sun.java.command");
		content +=  " started at ";
		content += LocalDateTime.now();
		content += "\n";
		
		Files.writeString(Path.of("log.txt"), content, StandardOpenOption.APPEND);
	}
	
	public static void main(String[] args) throws IOException
	{
		String content = System.getProperty("sun.java.command");
		content +=  " started at ";
		content += LocalDateTime.now();
		content += "\n";
		try
		{
			Files.writeString(Path.of("log.txt"), content, StandardOpenOption.APPEND);
		}
		catch (Exception ex)
		{
			System.out.println("Ausnahme ausgelöst."); 
			ex.printStackTrace();
		}
		
		/*
		 * 
		 */
		try
		{
			logExecutedProgram();
		}
		catch (Exception ex)
		{
			System.out.println("Ausnahme ausgelöst."); 
			ex.printStackTrace();
		}
		
		/*
		 * 
		 */
		logExecutedProgram();
		

	}

}

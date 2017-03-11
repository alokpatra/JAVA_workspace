import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myfile =new File("data.txt");
		FileReader fileReader;
		try {
			fileReader = new FileReader(myfile);
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//List<Integer> ints = Files.lines(Paths.get(data.txt)).map(Integer::parseInt).collect(Collectors.toList());
		

	}

}

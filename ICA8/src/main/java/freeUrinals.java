import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class freeUrinals {


    Boolean goodString(String input){
        Pattern pattern = Pattern.compile("^[0-1]*$");
        Matcher m = pattern.matcher(input);
        return m.find();
    }


    String[] readFile(String path) throws IOException {
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;
        String out="";
        while((line=br.readLine())!=null)
        {
            out+=(line);
            out += "\n";
        }
        return out.split("\n");

    }


    String writeFile(String lines[]) throws IOException {
        String rulefile = getOutPutFile();
        File f = new File("./" + rulefile);
        StringBuilder str = new StringBuilder();
        for (String line : lines) {
            str.append(this.checkFreeUrinals(line)).append("\n");
        }
        Files.write(f.toPath(), str.toString().getBytes());
        return rulefile;
    }

    String getOutPutFile() {
        File file = new File("./rule.txt");
        if (!file.exists()) return "rule.txt";

        File folder = new File("./");
        File[] listOfFiles = folder.listFiles();

        int count = 0;
        assert listOfFiles != null;
        for (File f : listOfFiles) {
            if (f.isFile()) {
                String fileName = f.getName();
                if (fileName.contains("rule")) count ++;
            }
        }
        return "rule" + count + ".txt";
    }

    int checkFreeUrinals(String str)
    {
        boolean is_free = str.contains("11");
        if(is_free){
            return -1;
        }
        int count = (int)str.chars().filter(ch -> ch == '1').count();
        char arr[] = new char[str.length()];
        for(int i=0; i<str.length(); i++)
        {
            arr[i] = str.charAt(i);
        }
        if(arr.length==1){
            int urinal = Character.getNumericValue(arr[0]);
            return 1-urinal;
        }
        for(int i = 0; i< arr.length; i++)
        {
            if (i == 0) {
                if (arr[i] == '0' && arr[i + 1] == '0') {
                    arr[i] = '1';
                }
            }
            else if (i==arr.length-1)
            {
                if(arr[i]=='0' && arr[i-1] == '0')
                {
                    arr[i] = '1';
                }
            }
            else {
                if(arr[i] =='0' && arr[i-1] == '0' && arr[i+1] == '0')
                {
                    arr[i] = '1';
                }
            }
        }
        int occupied_count=0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == '1')
                occupied_count += 1;
        }
        return occupied_count-count;
    }
}

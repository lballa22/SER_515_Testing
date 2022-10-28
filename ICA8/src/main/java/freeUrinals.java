import java.util.*;
public class freeUrinals {
    void getString()
    {

    }
    void getfile()
    {

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

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
        else{
            return 0;
        }
    }
}

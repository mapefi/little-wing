import java.util.Comparator;

public class NumeroComparator implements Comparator<Integer> {
    public int compare(Integer num, Integer outroNum) {
        //return num.compareTo(outroNum);
    	if (num > outroNum)
    		return num;
    	else
    		return outroNum;
    }
}
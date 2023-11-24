import java.text.NumberFormat;

public class FormattingNum {
    public static void main(String[] args){
        NumberFormat.getPercentInstance();
        String result = percent.format(0.6);
        System.out.println(result);
    }
    
}

// OUTPUT 60%

// Same code but Clean And Redundant Less Lines of Code
// Chaining Method 

import java.text.NumberFormat;

public class FormattingNum {
    public static void main(String[] args){
        String result = NumberFormat.getPercentInstance().format(0.6);
        System.out.println(result);
    }
    
}

// OUTPUT 60%
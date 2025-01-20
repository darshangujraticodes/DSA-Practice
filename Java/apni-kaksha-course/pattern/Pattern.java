package pattern;


public class Pattern{
    
    public static void main(String[] args) {
        int n =5;
        String str = "";

        for(int i =0; i< n; i++){
            for(int j=0; j<i ; j++ ){
                str += "*";
            }
            str += "\n";
        }

        System.out.println(str);

    }
}


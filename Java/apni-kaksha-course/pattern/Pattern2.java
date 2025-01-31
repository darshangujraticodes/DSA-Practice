
public class Pattern2 {

    public void showTrainglePattern(){
       
        int count = 5;
        String str = "";

        for(int i =count; i > 0; i-- ){
            for(int j = 0; j <i ; j++){
                str += "*";
            }
            str += "\n";
        }
        System.out.println(str);
        
    }
    public static void main(String[] args) {
        

        Pattern2 p1 = new Pattern2();
        p1.showTrainglePattern();

    }
}

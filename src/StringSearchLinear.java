
public class StringSearchLinear {
    public static void main(String[] args) {
        String my_str = "HELLO";
        boolean ans = stringSearch(my_str , 'E');
        System.out.println(ans);

        boolean ans2 = newStringSearch(my_str , 'O');
        System.out.println(ans2);




    }

    static boolean stringSearch(String my_str , char key ){
        if (my_str.length() == 0){
            return false;
        }
        for(int i = 0; i < my_str.length() ; i++){
            if(my_str.charAt(i) == key){
                return true;
            }

        }

        return false;

    }



    //ENHANCED stringSearch() function
    static boolean newStringSearch(String my_str , char key){
        if (my_str.length() == 0){
            return false;
        }
        for(char ch : my_str.toCharArray()){
            if(key == ch){
                return true;
            }

        }

        return false;
    }
}

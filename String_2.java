//Solutions from the String-2 section of Coding Bat
//Medium String problems

public class String_2 {
    public static void main(String[] args) {
        
    }

    public static String doubleChar(String str) {
        String doubleChar = "";
        for(int i = 0; i<=str.length()-1; i++){
          doubleChar = doubleChar + str.substring(i,i+1) + str.substring(i,i+1);
        }
        return doubleChar;
      }



      public static int countHi(String str) {
        int countHi = 0;
        for(int i = 0; i<=str.length()-2; i++){
          if(str.substring(i, i+2).equals("hi")){
            countHi++;
          }
        }
        return countHi;
      }



      public static boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for(int i = 0; i<str.length()-2; i++){
          if(str.substring(i, i+3).equals("cat")){
            countCat++;
          }else if(str.substring(i, i+3).equals("dog")){
            countDog++;
          }
        }
        if(countDog == countCat){
          return true;
        }
        return false;
      }
      
      
}

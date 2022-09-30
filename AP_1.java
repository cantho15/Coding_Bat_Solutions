//Solutions from the AP-1 section of Coding Bat
public class AP_1 {
    public static void main(String[] args) {
        
    }

    public static boolean scoresIncreasing(int[] scores) {
        for(int i = 1;i <scores.length;i++){
          if(!(scores[i]>= scores[i-1])){
            return false;
          }
        }
        return true;
      }



      public static boolean scores100(int[] scores) {
        for(int i = 1; i<scores.length; i++){
          if((scores[i] == 100) && (scores[i-1]== 100)){
            return true;
          }
        }
        return false;
      }


      public static boolean scoresClump(int[] scores) {
        for(int i = 0; i <= scores.length - 3; i++) {
            if(scores[i+2] - scores[i] <= 2)
                return true;
        }
                    
        return false;
    }


    public static int scoresAverage(int[] scores) {
      int first = average(scores, 0, scores.length / 2);
      int second = average(scores, scores.length / 2, scores.length);
      return Math.max(first, second);
  }
  
 
  public static int average(int[] scores, int start, int end) {
      int sum = 0;
            
      for(int i = start; i < end; i++)
          sum += scores[i];
  
      return sum / (end - start);
  }



  public static int wordsCount(String[] words, int len) {
    int count = 0;
    for(int i = 0; i<words.length; i++){
      if(words[i].length() == len){
        count++;
      }
    }
    return count;
  }
  
    
      
      
}

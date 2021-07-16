package Calc;
public class Operators {

    public static float addition(){
        float addition = 0;
        for(int i = 0; i < Calculator.numbers.size(); i++) {
        addition += Calculator.numbers.get(i);
        }
      return addition;
    }

    public static float subtraction(){
        float subtraction = Calculator.numbers.get(0);
        for(int i = 1; i< Calculator.numbers.size(); i++){
            subtraction  -= Calculator.numbers.get(i);
        }
        return subtraction;
    }

    public static float multiplication(){
        float multiplication = 1;
        for(int i = 0; i< Calculator.numbers.size(); i++){
            multiplication *= Calculator.numbers.get(i);
        }
        return multiplication;
    }

    public static float division(){
        float division = Calculator.numbers.get(0);
        for(int i = 1; i< Calculator.numbers.size(); i++){
            division /= Calculator.numbers.get(i);
        }
        return division;
    }

    public static String mean(){
        float mean = 0;
        for(int i = 0; i< Calculator.numbers.size(); i++){
            mean += Calculator.numbers.get(i);
        }
        mean /= Calculator.numbers.size();
        String s =String.valueOf(mean);  
        return s;
    }

    public static float max(){
        float max = 0;
        for (int p =  0; p < Calculator.numbers.size(); p++){
          if (Calculator.numbers.get(p) > max){
              max = (Calculator.numbers.get(p));
          }
        }
        return max;
    }
    
  public static float mode(){
    float mode = 0;
    float Lowest = 0;
    int j=0;
    int LowestIndex = 0;

for(int i = 0;i<Calculator.numbers.size() - 1;i++){
        Lowest = Calculator.numbers.get(i);
        LowestIndex = i;
        for(j=i+1;j<Calculator.numbers.size();j++){
            if(Calculator.numbers.get(j)<Lowest){
                Lowest = Calculator.numbers.get(j);
                LowestIndex = j;                    
            }
        }

        if (i != LowestIndex) {
            float temp = Calculator.numbers.get(LowestIndex);
            Calculator.numbers.set(LowestIndex, Calculator.numbers.get(i));
            Calculator.numbers.set(i, temp);
        }
    }

        for(int i = 0; i<Calculator.numbers.size(); i++){
            float checker = Calculator.numbers.get(i);
            int counter = 0;
            int max_numberino = 0;
           
                for(int p = i + 1 ; p<Calculator.numbers.size(); p++){
                    if (checker ==  Calculator.numbers.get(p)){
                        counter++;
                        
                    }
                }
                if(counter > max_numberino){
                    max_numberino = counter;
                    mode = Calculator.numbers.get(i);
                }
                counter = 0;
                
            }
            return mode;
        }
      

    public static double median(){
            float Lowest = 0;
            int j=0;
            int LowestIndex = 0;
        
        for(int i = 0;i<Calculator.numbers.size() - 1;i++){
                Lowest = Calculator.numbers.get(i);
                LowestIndex = i;
                for(j=i+1;j<Calculator.numbers.size();j++){
                    if(Calculator.numbers.get(j)<Lowest){
                        Lowest = Calculator.numbers.get(j);
                        LowestIndex = j;                    
                    }
                }
        
                if (i != LowestIndex) {
                    float temp = Calculator.numbers.get(LowestIndex);
                    Calculator.numbers.set(LowestIndex, Calculator.numbers.get(i));
                    Calculator.numbers.set(i, temp);
                }
            }
        double median =  ((Calculator.numbers.size()/2.0));
            if (median % 2 == 0){
                median = ((Calculator.numbers.get((int) (median)) + (Calculator.numbers.get((int) (median-1))))/2);
                return median ;
            }
            else if (median % 2 != 0){
                median =(median - 0.5 );
                return (Calculator.numbers.get((int) (median)));
            }
            
            return Calculator.numbers.get(0);
            
            }
    }
  
    





public public class Shoes {
    public static void main(String[] args) {

        String[] str = {"7L","7R","7L","8L","6R","7R","8R","6R"};
        int pair=0;
        for (int i = 0; i < str.length; i++)
          { 
            
            if (str[i].charAt(1) == 'L')
             {

                for (int j = i + 1; j < str.length; j++) 
                 {

                    if (str[i].charAt(0) == str[j].charAt(0)
                            && str[j].charAt(1) == 'R')
                    {

                        System.out.println(str[i] + " , " + str[j]);
                        pair++;
                        str[j] = "XX";                          
                        break;
                                  
                     }
                      
                  }
              }
          }
             System.out.println(pair);

    }
} {
    
}

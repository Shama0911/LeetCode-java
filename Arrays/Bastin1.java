public class Bastin1 {
    public static void main(String[] args) {

        String name = "hello this is alpha 5051 and 9475";
        int max=0;
        int number=0;

        for (int i = 0; i < name.length(); i++) {

            int ch = name.charAt(i)-'0';

            if (ch >= 0 && ch <=8) {
                //value1 = value1 + ch;
               number=(number*10)+ch;
                  if(number>max)
                   {
                      max=number;
                   }
            }
            else
            {
              number=0;
            }

        }

        System.out.println(max);
    }
}
public class Runner
{
    public static void main(String[] args)
    {
        String[][] str = {
                {"                 ..."},
                {"                  |"},
                {"                   |"},
                {"                    |"},
                {"                    |"},
                {"                   |"},
                {"     {----------  | --------}"},
                {"    { |       |-----|         }"},
                {"   { |                          }"},
                {"  { |    []               []      }"},
                {" { |                               }"},
                {"{ |                                }"},
                {"{ |                                }"},
                {"{ |    |                   |       }"},
                {" {  |   |                 |       }"},
                {"  {  |   |---------------|       }"},
                {"   {  |                         }"},
                {"    {  |                       }"},
                {"     {------------------------}"}};
        JackOLantern pumpkin = new JackOLantern(str);
        System.out.println(pumpkin.toString());
    }
}

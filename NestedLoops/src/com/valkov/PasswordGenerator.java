package com.valkov;

import java.io.Console;
import java.util.Scanner;

public class PasswordGenerator {
    Scanner scanner=new Scanner(System.in);
    int nNumber = Integer.parseInt(scanner.nextLine());
    int lnumber = Integer.parseInt(scanner.nextLine());

            for (int i1 = 1; i1 < nNumber; i1++)
    {
        for (int i2 = 1; i2 < n_Number; i2++)
        {
            for (int i3 = 'a'; i3 < 'a'+ l_number; i3++)
            {
                for (int i4 = 'a'; i4 < 'a'+ l_number; i4++)
                {
                    for (int i5 = 2; i5 <= n_Number; i5++)
                    {

                        if (i5 > i1 && i5 > i2)
                        {
                            Console.Write($"{i1}{i2}{(char)i3}{(char)i4}{i5} ");
                        }


                    }
                }
            }
        }
    }
}
    }

}

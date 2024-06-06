public class RomanNumerals
{
    public static int toDecimal(String romanNumeral)
    {
        int decimal = 0;

        for(int i = 0; i < romanNumeral.length() - 1; i++)
        {
            char numeral = romanNumeral.charAt(i);
            char nextNumeral = romanNumeral.charAt(i + 1);

            if(numeral == 'M') decimal += 1000;
            else if(numeral == 'C')
            {
                if(nextNumeral == 'M')
                {
                    decimal += 900;
                    i++;
                }
                else if(nextNumeral == 'D')
                {
                    decimal += 400;
                    i++;
                }
                else decimal += 100;
            }
            else if (numeral == 'D') decimal += 500;
            else if (numeral == 'X')
            {
                if(nextNumeral == 'C')
                {
                    decimal += 90;
                    i++;
                }
                else if(nextNumeral == 'L')
                {
                    decimal += 40;
                    i++;
                }
                else decimal += 10;
            }
            else if (numeral == 'L') decimal += 50;
            else if (numeral == 'I')
            {
                if(nextNumeral == 'X')
                {
                    decimal += 9;
                    i++;
                }
                else if(nextNumeral == 'V')
                {
                    decimal += 4;
                    i++;
                }
                else decimal++;
            }
            else decimal += 5;
        }

        return decimal;
    }

    public static void main(String[] args)
    {
        System.out.println("DCCCLXXVIII to base 10: " + toDecimal("DCCCLXXVIII "));
        System.out.println("DCCLVIII to base 10: " + toDecimal("DCCLVIII "));
        System.out.println("CCCLXXXV to base 10: " + toDecimal("CCCLXXXV "));
        System.out.println("DCCLXI to base 10: " + toDecimal("DCCLXI "));
        System.out.println("CMXLVI to base 10: " + toDecimal("CMXLVI "));
        System.out.println("VII to base 10: " + toDecimal("VII "));
        System.out.println("LI to base 10: " + toDecimal("LI "));
        System.out.println("DCLXXXIII to base 10: " + toDecimal("DCLXXXIII "));
        System.out.println("CDLXXXIV to base 10: " + toDecimal("CDLXXXIV "));
        System.out.println("DCLXII to base 10: " + toDecimal("DCLXII "));
    }

}

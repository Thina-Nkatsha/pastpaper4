public class VehicleSales
{
    public static void main(String[] args)
    {
        // Two dimensional array containing the monthly vehicle sales
        int[][] sales =
        {
            {25, 15, 35}, // SUV
            {25, 55, 35}, // COUPE
            {11, 20, 45}, // SEDAN
            {17, 27, 25}  // VAN
        };

        // Display the vehicle sales report
        System.out.println("VEHICLE SALES REPORT");
        System.out.println("*****************************");
        System.out.println("          JAN   FEB   MAR");
        System.out.println("SUV       " + sales[0][0] + "    " + sales[0][1] + "    " + sales[0][2]);
        System.out.println("COUPE     " + sales[1][0] + "    " + sales[1][1] + "    " + sales[1][2]);
        System.out.println("SEDAN     " + sales[2][0] + "    " + sales[2][1] + "    " + sales[2][2]);
        System.out.println("VAN       " + sales[3][0] + "    " + sales[3][1] + "    " + sales[3][2]);

        // Display total sales for each vehicle type
        System.out.println();
        System.out.println("TOTAL SALES PER VEHICLE TYPE");
        System.out.println("*****************************");

        for (int row = 0; row < sales.length; row++)
        {
            int total = 0;

            for (int column = 0; column < sales[row].length; column++)
            {
                total = total + sales[row][column];
            }

            if (row == 0)
            {
                System.out.println("SUV TOTAL: " + total);
            }
            else if (row == 1)
            {
                System.out.println("COUPE TOTAL: " + total);
            }
            else if (row == 2)
            {
                System.out.println("SEDAN TOTAL: " + total);
            }
            else
            {
                System.out.println("VAN TOTAL: " + total);
            }
        }

        // Calculate total sales for each month
        int januaryTotal = sales[0][0] + sales[1][0] + sales[2][0] + sales[3][0];
        int februaryTotal = sales[0][1] + sales[1][1] + sales[2][1] + sales[3][1];
        int marchTotal = sales[0][2] + sales[1][2] + sales[2][2] + sales[3][2];

        System.out.println();
        System.out.println("MONTHLY SALES STATUS");
        System.out.println("*****************************");

        // January status
        if (januaryTotal >= 100)
        {
            System.out.println("JANUARY TOTAL: " + januaryTotal + " - GOLD");
        }
        else
        {
            System.out.println("JANUARY TOTAL: " + januaryTotal + " - SILVER");
        }

        // February status
        if (februaryTotal >= 100)
        {
            System.out.println("FEBRUARY TOTAL: " + februaryTotal + " - GOLD");
        }
        else
        {
            System.out.println("FEBRUARY TOTAL: " + februaryTotal + " - SILVER");
        }

        // March status
        if (marchTotal >= 100)
        {
            System.out.println("MARCH TOTAL: " + marchTotal + " - GOLD");
        }
        else
        {
            System.out.println("MARCH TOTAL: " + marchTotal + " - SILVER");
        }
    }
}

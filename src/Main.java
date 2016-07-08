
public class Main
{
    public static void main(String []args)
    {
        Main main = new Main();
        System.out.println(main.sumOfFactorial(4));
        int [][]array = new int[6][6];
        int []arr = {0,2,1,4, 5,3,8,7,6, 10};
        new Main().fillingArray(array);
        System.out.println("searchJ " + main.searchJ(arr));
        int [] A = { 1, 15, 27, 32, 44};
        int [] B = {0, 12, 14,15, 28, 42};
        new Main().sortTwoMassiv(A, B);
    }

    public int sumOfFactorial(int n)//Нахождение значения функции F(n)
    {
        int sum = 1;
        for(int i = 0; i <= n; i++)
        {
            sum*=factorial(i);
        }
        return sum;
    }

    public int factorial(int n)//Находим факториал
    {
        int temp = 1;
        if(n == 1 || n == 0)
        {
            return 1;
        }
        for(int i = 2; i <= n; i++)
        {
            temp *= i;
        }
        return temp;
    }

    public int searchJ(int []array)//Поиск недостающего числа
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        return array.length * (array.length + 1) / 2 - sum;
    }

    public void fillingArray(int [][]array)//Заполнение массива по часовой стрелке по спирали
    {
        int index = 1;
        int n = array.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n - i - 1; j++)
            {
                array[i][j] = index++;
            }
            for(int j = i; j < n - i; j++)
            {
                array[j][n - i - 1] = index++;
            }
            for(int j = n - i - 2; j > i; --j)
            {
                array[n - i - 1][j] = index++;
            }
            for(int j = n - i - 1; j > i; --j)
            {
                array[j][i] = index++;
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();;
        }
    }

    public void sortTwoMassiv(int []A, int []B)//Сортировка двух массивов в порядке возрастания
    {
        int indexA = 0;
        int indexB = 0;
        int [] temp = new int[A.length + B.length];
        for(int i = 0; i < A.length + B.length; i++)
        {
            if(indexA < A.length && indexB < B.length)
            {
                if (A[indexA] < B[indexB])
                {
                    temp[i] = A[indexA];
                    indexA++;
                }
                else
                {
                    temp[i] = B[indexB];
                    indexB++;
                }
            }
            else
            {
                if(indexA < A.length)
                {
                    temp[i] = A[indexA];
                    indexA++;
                }
                else
                {
                    temp[i] = B[indexB];
                    indexB++;
                }
            }
            System.out.print(temp[i] + "\t");
        }
    }
}

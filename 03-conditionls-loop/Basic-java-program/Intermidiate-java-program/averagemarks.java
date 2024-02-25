import java.util.Scanner;

public class averagemarks {
        public static void main(String[] args) {
            int n=5;
            Scanner input = new Scanner(System.in);
            int[] m =new int[n];
            int g = 0;
            double cgpa,sum=0;
            m[0]=input.nextInt();
            m[1]=input.nextInt();
            m[2]=input.nextInt();
            m[3]=input.nextInt();
            m[4]=input.nextInt();
            for(int i=0;i<n;i++)
            {
                g+= (int) m[i];
            }
            cgpa= (double) g /n;

            System.out.println("percentage="+cgpa);
        }
    }


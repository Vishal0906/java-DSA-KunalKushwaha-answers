import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        int n=5;
        Scanner  input = new Scanner(System.in);
        double[] m =new double[n];
        double[] g =new double[n];
        double cgpa,sum=0;
        m[0]=input.nextInt();
        m[1]=input.nextInt();
        m[2]=input.nextInt();
        m[3]=input.nextInt();
        m[4]=input.nextInt();
        for(int i=0;i<n;i++)
        {
            g[i]=(m[i]/10);
        }
        for(int i=0;i<n;i++)
        {
            sum+=g[i];
        }
        cgpa=sum/n;
        System.out.println("cgpa="+cgpa);
        System.out.println("percantage from cgpa="+cgpa*9.5);
    }
    }


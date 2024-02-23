import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Ul = input.nextInt(),x=0,temp,sum=0;
        int Ll = input.nextInt();
        x = Ul;
        while(Ul<=Ll){
            x = Ul;
            sum =0;
            while(x!=0){
                temp=x%10;
                sum=sum+(temp*temp*temp);
                x=x/10;
            }
            if(sum==Ul)
                System.out.println("armstrong" + sum );
            Ul=Ul+1;
        }
    }
}

import java.net.SocketTimeoutException;

public class While{
    public static void main(String[] args)

    {
        int x=0;

        for( ;x<2; x=x+1)
        {
            System.out.println("x"+x);
        }
        while(x<2);


    }
}

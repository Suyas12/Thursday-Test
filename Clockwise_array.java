import java.util.Arrays;
class Clockwise_array 
{
    static int[] a={10,20,30,40,50,60};
    static void clockwise_array()
    {
        int b = a[a.length-1],i;
        for(i=a.length-1;i>0;i--)
            a[i]=a[i-1];
            a[0]=b;
    }
    public static void main(String args[])
    {
    System.out.println("Default Array: "+Arrays.toString(a));
    clockwise_array();
    System.out.println("Clockwise Array: "+Arrays.toString(a));
    }
}

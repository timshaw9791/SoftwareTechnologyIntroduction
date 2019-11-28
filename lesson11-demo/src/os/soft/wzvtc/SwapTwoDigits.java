package os.soft.wzvtc;

public class SwapTwoDigits {
    private int a=3;
    private int b=5;
    /**
     * 交换两个变量的值
     * @param args
     */
    public static void main(String[] args) {

        int a=3,b=5;
        System.out.println("a="+a+",b="+b);
        int t=a;
        a=b;
        b=t;
        System.out.println("a="+a+",b="+b);

        System.out.println("a="+a+",b="+b);
        swap(a,b);//切换到本句，交换会成功吗
        System.out.println("a="+a+",b="+b);

        /**请观察数组中的两个元素是否被交换
         int[] array=new int[]{3,5};
        System.out.println("array[0]="+array[0]+",array[1]="+array[1]);
        swap(array);
        System.out.println("array[0]="+array[0]+",array[1]="+array[1]);
         */

        /**请观察对象中的实例变量是否被交换

        SwapTwoDigits instance=new SwapTwoDigits();
         System.out.println("instance.a="+instance.a+",instance.b="+instance.b);
         swap(instance);
        System.out.println("instance.a="+instance.a+",instance.b="+instance.b);
         */

    }

    static void swap(int a,int b){
        int t=a;
        a=b;
        b=t;
    }

    //交换数组中的两个元素的值
    static void swap(int[] array){
        int t=array[0];
        array[0]=array[1];
        array[1]=t;
    }

    //交换对中两个实例变量的值
    static void swap(SwapTwoDigits swapTwoDigits){
        int t=swapTwoDigits.a;
        swapTwoDigits.a=swapTwoDigits.b;
        swapTwoDigits.b=t;
    }

}

package os.soft.wzvtc;

public class JieCheng {
    public static void main(String[] args) {
      /*  for(int i=1;i<15;i++){
            System.out.println(i+"!="+jiecheng(i));
        }
*/
        System.out.println(jiecheng2(4));
    }

    static int jiecheng2(int n){
        if(n==1){
            return 1;
        }else{
            int result=n*jiecheng2(n-1);
            return result;
        }
    }

    static int jiecheng(int n){
        int i=1,result=1;
        for(;i<n;i++){
            result=result*i;
        }
        return result;
    }



}

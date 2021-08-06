import org.junit.Test;

/**
 * @author haibin
 * @version 1.0.0
 * @ClassName LeetCodeTest.java
 * @Description TODO
 * @createTime 2021年07月30日 17:43:00
 */
public class LeetCodeTest {

    @Test
    public void canPlaceFlowers() {
        int[] flowerbed=new int[]{1,0,0,0};
        int n=1;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }

    //判断是否能种n朵花
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count=0;

        for(int i=0;i<=flowerbed.length-1;){
            int temp=flowerbed[i];
            //特殊处理：数组长度为1
            if(flowerbed.length==1 && temp==0){
                count++;
                i=i+2;
            //特殊处理：第一个元素
            } else if(i==0 && flowerbed[i]==0 && i+1<flowerbed.length && flowerbed[i+1]==0){
                count++;
                i=i+2;
            //特殊处理：最后一个元素
            }else if(i==flowerbed.length-1 && flowerbed[i]==0   && i-1>=0 && flowerbed[i-1]==0){
                count++;
                i=i+2;
            //如果是1,直接下一步
            }else if(temp==1){
                i++;
            //前后是0,本身是0
            }else if(i-1>=0 && flowerbed[i-1]==0 && i+1<flowerbed.length && flowerbed[i+1]==0){
                count++;
                i=i+2;
            }else{
                i++;
            }

        }
        if(count>=n){
            return true;
        }
        return false;
    }


}

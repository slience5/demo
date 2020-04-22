package construct;


import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

public class DynamicProgrammingTest {
    static int n = 5;
    static int bagWeight = 9;
    static int maxWeight;
    private static int[] weights = {2,2,4,1,3};

    private static int[][] yanghuiTriangle = {{5},{7,8},{9,3,4},{4,9,6,1},{2,7,9,4,5}};
    static int nearestLength = Integer.MAX_VALUE;

    private static int price = 12;
    private static Integer coinsNum = Integer.MAX_VALUE;


    /**
     * 0-1背包问题
     * @param index
     * @param weight
     */
    public static void bagMaxProblem(int index,int weight){
       if(index == n || weight >= bagWeight){
            if(weight > maxWeight){
                maxWeight = weight;
            }
            return;
       }
       bagMaxProblem(index+1,weight);
       if(weight + weights[index] <= bagWeight){
           bagMaxProblem(index+1,weight+weights[index]);
       }
    }


    public static int dynamicBagMax(){
        boolean[][] state = new boolean[n+1][bagWeight+1];
        state[0][0] = true;
//        state[1][0] = true;
//        state[1][weights[0]] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= bagWeight; j++) {
                if(state[i-1][j]){
                    state[i][j] = true;
                }
            }

            for (int j = 0; j <= bagWeight - weights[i-1]; j++) {
                if(state[i-1][j]){
                    state[i][j+weights[i-1]] = true;
                }
            }
        }

        for (int i = bagWeight; i >= 0; i--) {
            if(state[n][i]){
                return i;
            }
        }
        return 0;
    }
    
    
    public static int dynamicBagEasy(){
        boolean[] state = new boolean[bagWeight+1];
        state[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = bagWeight - weights[i-1]; j >= 0; j--) {
                if(state[j]){
                    state[j+weights[i-1]] = true;
                }
            }            
        }

        for (int i = bagWeight; i >= 0; i--) {
            if(state[i]) return i;
        }
        return 0;
    }

    /**
     * 最短距离问题
     * @param n
     * @param m
     * @param length
     */
    public static void nearestProblem(int n,int m,int length){
        if(n == yanghuiTriangle.length){
            if(length < nearestLength){
                nearestLength = length;
            }
            return;
        }
        length += yanghuiTriangle[n][m];
        nearestProblem(n+1,m,length);
        nearestProblem(n+1,m+1,length);
    }

    public static int dynamicNearestLength(){
        int[][] state = new int[yanghuiTriangle.length][yanghuiTriangle.length];
        state[0][0] = yanghuiTriangle[0][0];

        for (int i = 0; i < state.length-1; i++) {
            for (int j = 0; j < yanghuiTriangle[i].length; j++) {
                state[i+1][j] = state[i][j] + yanghuiTriangle[i+1][j];
                state[i+1][j+1] = state[i][j] + yanghuiTriangle[i+1][j+1];
            }
        }

        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < state[yanghuiTriangle.length-1].length; i++) {
           if(state[yanghuiTriangle.length-1][i] < minLength){
               minLength = state[yanghuiTriangle.length-1][i];
           }
        }
        return minLength;
    }


    /**
     * 硬币问题
     * @param coinPrice
     * @param coinNum
     * @param totalPrice
     */
    private static void coinProblem(int coinPrice,int coinNum,int totalPrice){
        if(totalPrice + coinPrice > price){
            return;
        }
        coinNum++;
        if(totalPrice + coinPrice == price){
                if(coinNum < coinsNum){
                    coinsNum = coinNum;
                }
                return;
        }
        coinProblem(1,coinNum,coinPrice + totalPrice);
        coinProblem(3,coinNum,coinPrice + totalPrice);
        coinProblem(5,coinNum,coinPrice + totalPrice);
    }

    public DynamicProgrammingTest() {
    }

    private static void dynamicCoins(){
        boolean[][] state = new boolean[price+1][price+1];
        int[] coins = {1,3,5};

        //init
        for (int i = 0; i < coins.length; i++) {
            state[1][coins[i]] = true;
        }

//        boolean flag = false;
        for (int i = 2; i < state.length; i++) {
            for (int j = 0; j < state[0].length; j++) {
                if(state[i-1][j]){
                    for (int k = 0; k < coins.length; k++) {
                        if(j + coins[k] <= price){
                            state[i][j + coins[k]] = true;
                        }
//                        if(j+coins[k] == 9){
//                            flag = true;
//                        }
                    }
                }
            }
        }

        for (int i = 1; i < state.length; i++) {
            if(state[i][price]){
                System.out.println("硬币个数为=" + i);
                findCoins(Lists.newArrayList(),coins,state,i,price);
            }
        }

    }

    private static void findCoins(List<Integer> result, int[] coins, boolean[][] state, int i, int j){
        if(i == 0){
                if (result.stream().mapToInt(s -> s).sum() == price){
                    System.out.println(result);
                }
            result.clear();
            return;
        }
        for (int k = 0; k < coins.length; k++) {
            if((j-coins[k] > 0 && state[i-1][j-coins[k]]) || (j-coins[k] == 0 && state[i][j])){
                List<Integer> list = Lists.newArrayList(result);
                list.add(coins[k]);
                findCoins(list,coins,state,i-1,j-coins[k]);
            }
        }
    }


    private static final char[] b = "mitcmu".toCharArray();
    private static final char[] a = "mtacnu".toCharArray();
    private static Integer minLength = Integer.MAX_VALUE;
    /**
     * 莱文斯坦距离问题
     */
    private static  void strMinLength(int i,int j,int min){
        if(i == a.length || j == b.length){
            if(i < a.length){
                min += (a.length - i);
            }
            else if(j < b.length){
                min += (b.length -j);
            }
            if(min < minLength){
                minLength = min;
            }
            return;
        }

        if(a[i] == b[j]){
            strMinLength(i+1,j+1,min);
        }else {
            strMinLength(i+1,j,min+1);
            strMinLength(i,j+1,min+1);
            strMinLength(i+1,j+1,min+1);
        }
    }
    
    private static  void dynamicStrMinLength(){
        int[][] state = new int[a.length][b.length];


        state[0][0] = a[0] == b[0] ? 0 : 1;
        // init row
        for (int i = 1; i < state.length; i++) {
            state[i][0] =  a[i] == b[0] ? i : state[i-1][0] + 1;
        }
        // init line
        for (int i = 1; i < state[0].length; i++) {
            state[0][i] =  b[i] == a[0] ?  i : state[0][i-1] + 1;
        }

        for (int i = 1; i < state.length; i++) {
            for (int j = 1; j < state[0].length; j++) {
                if(a[i] != b[j]){
                    state[i][j] = min(state[i-1][j] + 1,state[i][j-1] + 1,state[i-1][j-1] + 1);
                }else{
                    state[i][j] = min(state[i-1][j] + 1,state[i][j-1] + 1,state[i-1][j-1]);
                }
            }
        }

        System.out.println(state[a.length-1][b.length-1]);
    }

    private static int min(int x,int y,int z){
        int min = x;
        if(y < min) min = y;
        if(z < min) min = z;
        return min;
    }

    /**
     * 最长公共子序列
     */
    private static Integer maxCommonStr = 0;
    private static void maxCommonStr(int i,int j,int maxLength){
        if(i == a.length || j == b.length){
            if(maxLength > maxCommonStr){
                maxCommonStr = maxLength;
            }
            return;
        }

        if(a[i] == b[j]){
            maxCommonStr(i+1,j+1,maxLength+1);
        }else{
            maxCommonStr(i,j+1,maxLength);
            maxCommonStr(i+1,j,maxLength);
        }
    }

    private static void dynamicMaxCommonStr(){
        int[][] state = new int[a.length][b.length];

        //init line
        for (int i = 0; i < state.length; i++) {
            state[i][0] = a[0] == b[0] ? 1 : 0;
        }
        //init row
        for (int i = 0; i < state[0].length; i++) {
            state[0][i] = b[0] == a[0] ? 1 : 0;
        }

        for (int i = 1; i < state.length; i++) {
            for (int j = 1; j < state[0].length; j++) {
                state[i][j] = a[i] == b[j] ? Math.max(state[i][j-1], state[i-1][j]) + 1 : Math.max(state[i][j-1], state[i-1][j]);
            }
        }

        System.out.println(state[a.length-1][b.length-1]);
    }

    private static int[] arys = {2,9,3,6,5,1,7};
    private static List<Integer> nums = Lists.newArrayList();
    private static void maxSortedStr(int i,int num,List<Integer> result){
        if(i == arys.length-1){
            if(result.size() > nums.size()){
                nums = result;
            }
            return;
        }
        for (int j = i+1; j < arys.length; j++) {
            List<Integer> list = Lists.newArrayList(result);
            Integer temp = num;
            if(arys[j] > num){
                temp = arys[j];
                list.add(temp);
            }
            maxSortedStr(j,temp,list);
        }
    }

    private static void countDynamic(int[] arrays) {
        int length = arrays.length;

        int[] status = new int[length];

        status[0] = 1;

        int commMax = 0;

        for (int i = 1; i < length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arrays[j] < arrays[i]) {
                    if (status[j] > max) {
                        max = status[j];
                    }
                }
            }
            status[i] = max + 1;

            if (status[i] > commMax) {
                commMax = status[i];
            }
        }

        System.out.println("最大递增序列为 ：" + commMax);
        int maxComp = commMax;
        System.out.println("递增:" + Arrays.toString(status));

        for (int i = length - 1; i >= 0; i--) {
            if (status[i] == maxComp) {
                System.out.print("-->" + arrays[i]);
                maxComp = maxComp - 1;
            }
        }
    }

    public static void main(String[] args) {
//        bagMaxProblem(0,0);
//        System.out.println(maxWeight);
//        System.out.println(dynamicBagMax());
//        System.out.println(dynamicBagEasy());

//        nearestProblem(0,0,0);
//        System.out.println(nearestLength);
//
//        System.out.println(dynamicNearestLength());

//        coinProblem(1,0,0);
//        coinProblem(3,0,0);
//        coinProblem(5,0,0);
//        System.out.println(coinsNum);
//        dynamicCoins();

//        strMinLength(0,0,0);
//        System.out.println(minLength);
//
//        dynamicStrMinLength();

//        maxCommonStr(0,0,0);
//        System.out.println(maxCommonStr);
//        dynamicMaxCommonStr();

//        for (int i = 0; i < arys.length; i++) {
//            maxSortedStr(i,arys[i],Lists.newArrayList(arys[i]));
//        }
//        System.out.println(nums);

        countDynamic(arys);
    }


}

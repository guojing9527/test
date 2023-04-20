package com.hainiu.test;

public class Demo01 {
    public static void main(String[] args) {
        float M=50;
        //背包所能容纳的重量
        float[] w={10,10,30,20,5};
        //每种物品的重量
        float[] v={10,200,400,450,20};
        //每种物品的价值

        float num = getNumber3(M,w,v);

        System.out.println("物品数量："+num);
    }
    /**
     * 贪心算法3：背包问题
     */
    public void greedy3(){
        float M=50;
        //背包所能容纳的重量
        float[] w={0,10,30,20,5};
        //每种物品的重量
        float[] v={0,200,400,450,20};
        //每种物品的价值

        float num = getNumber3(M,w,v);

        System.out.println("物品数量："+num);
    }
    /**
     * 贪心算法3：背包问题
     * @return
     */
    public static float getNumber3(float M, float[] w, float[] v) {
        float num=0;
        int i=0;
        float max=0;
        float weight=0;
        for(i=0;i<w.length;i++) {
            if(v[i]/w[i]>max) {
                max=v[i]/w[i];
                weight=w[i];
            }
        }
        num=M/weight;
        return num;
    }
}

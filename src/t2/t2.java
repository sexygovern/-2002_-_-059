package t2;

import java.util.Scanner;

public class t2 {
	    static int max=0;
    public static int[] Max(int[] arr,int []ans) {
		int flag=arr[0];
		for(int i=0;i<arr.length;i++) {
			     flag=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				flag+=arr[j];
				if(flag>max) {
					max=flag;
					ans[0]=max;
					ans[1]=i;
					ans[2]=j;
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] ans=new int[3];
		System.out.println("����������Ĵ�С:");
		int i=sc.nextInt();
		System.err.println("���������������");
		int[] arr=new int[i];
		for (int j = 0; j < arr.length; j++) {
			arr[j]=sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			max=Math.max(max, j);
			ans[0]=max;
			ans[1]=j;
			ans[2]=j;
		}
	     ans=Max(arr,ans);
	      System.out.println("���������ֵΪ"+ans[0]);
	      System.out.println("��ʼ�±�Ϊ��"+ans[1]);
	      System.out.println("�����±�Ϊ��"+ans[2]);
	}
}

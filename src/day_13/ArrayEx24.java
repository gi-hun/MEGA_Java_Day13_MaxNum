/*
 * # �ִ밪 ���ϱ�[3�ܰ�]
 * 1. ���� ū ���� ã�� �Է��Ѵ�.
 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
 * ��)
 * 11, 87, 42, 100, 24
 * �Է� : 100
 * 
 * 11, 87, 42, 0, 24
 * �Է� : 87
 * 
 * 11, 0, 42, 0, 24
 */
package day_13;

import java.util.Scanner;

public class ArrayEx24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		int check = 0;
		int count = 0;

		while(true)
		{
			int max = 0;
			
			for(int i=0;i<5;i++)
			{
				if(max<arr[i])
				{
					max = arr[i];;
					check = i;
				}
			}
			
			System.out.print("[");
			for(int i=0;i<5;i++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.print("]");
			System.out.println();
			
			System.out.println("�ִ��� �Է��Ͻÿ�");
			int data = sc.nextInt();
			
			if(max == data)
			{
				arr[check] = 0;
				count++;
			}
			
			if(count == 5)
			{
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}
